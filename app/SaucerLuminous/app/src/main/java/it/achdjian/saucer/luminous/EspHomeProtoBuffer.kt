package it.achdjian.saucer.luminous

import android.net.nsd.NsdServiceInfo
import android.util.Log
import com.google.protobuf.ByteString
import com.google.protobuf.CodedOutputStream
import com.google.protobuf.GeneratedMessageV3
import com.google.protobuf.kotlin.toByteString
import it.achdjian.saucer.luminous.protobuf.*
import it.achdjian.saucer.luminous.protobuf.ApiOptions.id
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.net.Socket
import java.nio.ByteBuffer


private const val TAG = "EspHomeProtobuffer"

private val responses = mapOf(
    HelloResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to HelloResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ConnectResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ConnectResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    DisconnectResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to DisconnectResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    PingResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to PingResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    DeviceInfoResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to DeviceInfoResponse::class.java.getMethod("parseFrom", ByteArray::class.java),
    ListEntitiesDoneResponse.getDefaultInstance().descriptorForType.toProto().options.getExtension(id) to ListEntitiesDoneResponse::class.java.getMethod("parseFrom", ByteArray::class.java),

)

fun Int.toProtobuf() : ByteString{
    val size = CodedOutputStream.computeInt32SizeNoTag(this)
    val byteBuffer = ByteBuffer.allocateDirect(size);
    val codedOutputStream = CodedOutputStream.newInstance(byteBuffer)
    codedOutputStream.writeInt32NoTag(this)
    return byteBuffer.toByteString()
}

class EspHomeProtoBuffer(val service: NsdServiceInfo) {
    companion object {
        const val MAJOR_API_VERSION=1
        const val MINOR_API_VERSION=7

    }
    var socket = Socket()
    private val _connected = MutableStateFlow(false)
    val connected: StateFlow<Boolean> get() = _connected

    fun connect(password:String? = null) {
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
                        _connected.value = true
                    }
                }
            }

        }catch (e:Exception){
            Log.e(TAG,"errore", e)
        }
    }

    fun  <RequestT:GeneratedMessageV3, ResponseT:GeneratedMessageV3>sendMessage(request: RequestT) : ResponseT ?{
        if (socket.isConnected) {
            sendRequest(request)
            return parseResponse()
        }
        return  null
    }

    private fun <RequestT:GeneratedMessageV3> sendRequest(request:RequestT){
        val id = request.descriptorForType.toProto().options.getExtension(id)
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
            val response = parseFrom.invoke(it, responseData) as ResponseT
            Log.d(TAG, "response: ${response}")
            return response
        }
        return null
    }

}