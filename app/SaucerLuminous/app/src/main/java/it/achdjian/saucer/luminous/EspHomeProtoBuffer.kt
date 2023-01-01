package it.achdjian.saucer.luminous

import android.net.nsd.NsdServiceInfo
import android.util.Log
import com.google.protobuf.ByteString
import com.google.protobuf.CodedOutputStream
import com.google.protobuf.GeneratedMessageV3
import com.google.protobuf.kotlin.toByteString
import it.achdjian.saucer.luminous.protobuf.*
import it.achdjian.saucer.luminous.protobuf.ApiOptions.id
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.net.Socket
import java.nio.ByteBuffer
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicInteger


private const val TAG = "EspHomeProtobuffer"

private val responses = mapOf(
    HelloResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to HelloResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ConnectResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ConnectResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    DisconnectResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to DisconnectResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    PingResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to PingResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    DeviceInfoResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to DeviceInfoResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesDoneResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesDoneResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    BinarySensorStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to BinarySensorStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    CoverStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to CoverStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    FanStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to FanStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    LightStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to LightStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    SensorStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to SensorStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    SwitchStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to SwitchStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    TextSensorStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to TextSensorStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ClimateStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ClimateStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    NumberStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to NumberStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    SelectStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to SelectStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    LockStateResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to LockStateResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesDoneResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesDoneResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesBinarySensorResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesBinarySensorResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesCoverResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesCoverResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesServicesResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesServicesResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesNumberResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesNumberResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    HomeassistantServiceResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to HomeassistantServiceResponse::class.java.getMethod("parseFrom", ByteArray::class.java),

)

fun Int.toProtobuf() : ByteString{
    val size = CodedOutputStream.computeInt32SizeNoTag(this)
    val byteBuffer = ByteBuffer.allocateDirect(size)
    val codedOutputStream = CodedOutputStream.newInstance(byteBuffer)
    codedOutputStream.writeInt32NoTag(this)
    return byteBuffer.toByteString()
}

@Suppress("UNCHECKED_CAST")
class EspHomeProtoBuffer(val service: NsdServiceInfo, val coroutineScope: CoroutineScope) {
    companion object {
        const val MAJOR_API_VERSION=1
        const val MINOR_API_VERSION=7
        val PING_RESPONSE_ID = PingResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id)
        val ENTITIES_SERVICE_RESPONSE_ID = ListEntitiesServicesResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id)
        val HA_SERVICE_RESPONSE_ID = HomeassistantServiceResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id)
        val ENTITIES_NUMBER_RESPONSE_ID = ListEntitiesNumberResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id)
        val ENTITIES_LIST_DONE_RESPONSE_ID = ListEntitiesDoneResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id)
    }

    private val timeMap = ConcurrentHashMap<Int, Long>()
    private var socket = Socket()
    private val userServices = mutableMapOf<String, ListEntitiesServicesResponse>()
    private val numbers = mutableMapOf<String, ListEntitiesNumberResponse>()
    private val _connected = MutableStateFlow(false)
    val connected: StateFlow<Boolean> get() = _connected

    val responseChannel = Channel<GeneratedMessageV3>(5)
    private val pingCounter = AtomicInteger(0)

    suspend fun connect(password:String? = null) {
        if (socket.isConnected){
            socket.close()
        }


        _connected.value = false
        val helloRequest = HelloRequest.newBuilder().setClientInfo(EspHome.clientName).setApiVersionMajor(MAJOR_API_VERSION).setApiVersionMinor(MINOR_API_VERSION).build()

        try {
            socket = Socket(service.host, service.port)
            sendMessage<HelloRequest, HelloResponse>(helloRequest) ?. let { response->
                if (response.apiVersionMajor == MAJOR_API_VERSION && response.apiVersionMinor >= MINOR_API_VERSION){
                    val connectRequest =  password?.let { ConnectRequest.newBuilder().setPassword(password).build()} ?: ConnectRequest.newBuilder().build()
                    val connectResponse: ConnectResponse? = sendMessage(connectRequest)
                    if (connectResponse != null && !connectResponse.invalidPassword){
                        Log.d(TAG, "Connected")
                        _connected.value = true
                        coroutineScope.launch (Dispatchers.IO){ enableResponsesListener()}
                        coroutineScope.launch (Dispatchers.IO){activePing()}
                        val entitiesRequest = ListEntitiesRequest.newBuilder().build()
                        sendRequest(entitiesRequest)
                        sendRequest(SubscribeHomeassistantServicesRequest.newBuilder().build())
                    } else {
                        Log.d(TAG, "Not connected")
                    }
                }
            }
        }catch (e:Exception){
            Log.e(TAG,"error", e)
        }
    }

    private suspend fun activePing() {
        pingCounter.set(0)
        while(true){
            try {
                val request = PingRequest.newBuilder().build()
                sendRequest(request)
                val prevValue = pingCounter.getAndIncrement()
                delay(5000)
                if (pingCounter.get() >2){
                    Log.e(TAG, "Too many missing ping ${pingCounter.get()}")
                    _connected.value=false
                    return
                }
                if (pingCounter.get() == prevValue ){
                    pingCounter.set(0)
                }
            } catch (e:Exception){
                Log.e(TAG, "Error ping device", e)
                _connected.value = false
                return
            }
        }
    }

    fun subscribeStates() {
        if (!socket.isConnected){
            return
        }
        val request = SubscribeStatesRequest.newBuilder().build()
        sendRequest(request)
    }

    private fun tooManyRequest(key:Int):Boolean{
        if (!timeMap.containsKey(key)) {
            timeMap[key] =  System.currentTimeMillis()
            return false
        }
        val lastTime = timeMap[key]!!
        val now = System.currentTimeMillis()
        if (now - lastTime < 200 ){
            return true
        }
        timeMap[key] = now
        return false
    }


    fun changeBrightness(key:Int, state:Boolean, value: Float?=null){
        if (!socket.isConnected){
            return
        }
        if (tooManyRequest(key)){
            return
        }
        val request = LightCommandRequest.newBuilder()
            .setKey(key)
            .setHasState(true)
            .setState(state)
            .setColorModeValue(0)
            .setHasColorBrightness(false)
            .setHasBrightness(false)
            .setHasColorTemperature(false)

        value?.let {
            request.hasBrightness = true
            request.setBrightness(it)
        }
        Log.d(TAG, "Request: $request")
        sendRequest(request.build())
    }

    fun getNumberKey(name: String):Int?{
        return numbers[name] ?.key
    }

    private fun  <RequestT:GeneratedMessageV3, ResponseT:GeneratedMessageV3>sendMessage(request: RequestT) : ResponseT ?{
        if (socket.isConnected) {
            sendRequest(request)
            return parseResponse()
        }
        return  null
    }

    private suspend fun enableResponsesListener() {
        try {
            val iStream = BufferedInputStream(withContext(Dispatchers.IO) {
                socket.getInputStream()
            })
            while (true) {
                val start = withContext(Dispatchers.IO) {
                    iStream.read()
                }
                if (start == -1) {
                    delay(100)
                    continue
                }
                if (start == 0) {
                    val responseLen =
                        withContext(Dispatchers.IO) {
                            iStream.read()
                        }
                    val responseId = withContext(Dispatchers.IO) {
                        iStream.read()
                    }
                    val responseData = ByteArray(responseLen)
                    withContext(Dispatchers.IO) {
                        iStream.read(responseData)
                    }

                    val parseFrom = responses[responseId]
                    parseFrom?.let {
                        val response = it.invoke(it, responseData) as GeneratedMessageV3
                        when(responseId){
                            PING_RESPONSE_ID->pingCounter.decrementAndGet()
                            ENTITIES_LIST_DONE_RESPONSE_ID -> {
                                Log.d(TAG, "List done")
                                subscribeStates()
                            }
                            ENTITIES_NUMBER_RESPONSE_ID -> {
                                val entityResponse = response as ListEntitiesNumberResponse
                                numbers[entityResponse.name] = entityResponse
                                Log.d(TAG, "number: ${entityResponse.name}")
                            }
                            ENTITIES_SERVICE_RESPONSE_ID->{
                                    val entityResponse = response as ListEntitiesServicesResponse
                                    userServices[entityResponse.name] = entityResponse
                                    Log.d(TAG, "service: ${entityResponse.name}")
                                }
                            HA_SERVICE_RESPONSE_ID -> {
                                val HAService = response as HomeassistantServiceResponse
                                Log.d(TAG, "HAService Response")
                                Log.d(TAG, "data: ${HAService.dataList.joinToString { "${it.key} = ${it.value}" }}")
                                Log.d(TAG, "data: ${HAService.dataTemplateList.joinToString { "${it.key} = ${it.value}" }}")
                                Log.d(TAG, "data: ${HAService.variablesList.joinToString { "${it.key} = ${it.value}" }}")
                                }
                            else ->responseChannel.send(response)
                        }

                    }
                } else {
                    Log.e(TAG, "Response out of sync. Get $start")
                }
            }
        } catch (e:Exception){
            _connected.value = false
        }
    }

    private fun <RequestT:GeneratedMessageV3> sendRequest(request:RequestT){
        try {
            val id = request.descriptorForType.toProto().options.getExtension(id)
            Log.d(TAG, "Send request $id")
            val payload = request.toByteString()
            val lenData = payload.size().toProtobuf()
            val typeData = id.toProtobuf()

            val data = ByteString
                .fromHex("00")
                .concat(lenData)
                .concat(typeData)
                .concat(payload)

            val outData = data.toByteArray()
            val ostream = BufferedOutputStream(socket.getOutputStream())
            ostream.write(outData)
            ostream.flush()
        } catch (e:Exception){
            Log.e(TAG, "Error sending request $request")
            _connected.value=false
        }
    }

    private fun <ResponseT:GeneratedMessageV3> parseResponse():ResponseT? {
        val istream = BufferedInputStream(socket.getInputStream())
        val start = istream.read()
        if (start != 0){
            throw Exception("Invalid start")
        }
        val responseLen = istream.read()
        val responseId = istream.read()
        val responseData = ByteArray(responseLen)
        istream.read(responseData)

        val parseFrom = responses[responseId]
        parseFrom ?.let {
            val response = it.invoke(it, responseData) as ResponseT
            return response
        } ?: Log.e(TAG, "Unknown message of type $responseId")
        return null
    }

    fun setNumber(key: Int, newState: Float) {
        if (!socket.isConnected){
            return
        }
        val request = NumberCommandRequest.newBuilder().setKey(key).setState(newState).build()
        sendRequest(request)
    }


}