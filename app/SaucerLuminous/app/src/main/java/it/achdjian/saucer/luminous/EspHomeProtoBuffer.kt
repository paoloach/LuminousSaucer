package it.achdjian.saucer.luminous

import android.net.nsd.NsdServiceInfo
import android.util.Log
import com.google.protobuf.ByteString
import com.google.protobuf.CodedOutputStream
import com.google.protobuf.GeneratedMessageV3
import com.google.protobuf.kotlin.toByteString
import it.achdjian.saucer.luminous.protobuf.*
import it.achdjian.saucer.luminous.protobuf.ApiOptions.id
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
    var socket:Socket? = null
    fun connect() {
        socket = Socket(service.host, service.port)


    }




    fun  <RequestT:GeneratedMessageV3, ResponseT:GeneratedMessageV3>sendMessage(request: RequestT) : ResponseT ?{
       socket?.let {
           sendRequest(request)
           return parseResponse()

       }
        return  null
    }

    private fun <RequestT:GeneratedMessageV3> sendRequest(request:RequestT){
        socket?.let {
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
            val ostream = BufferedOutputStream(it.getOutputStream())
            ostream.write(outData)
            ostream.flush()
        }
    }

    private fun <ResponseT:GeneratedMessageV3> parseResponse():ResponseT? {
        socket?.let {
            val istream = BufferedInputStream(it.getInputStream())
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
        }
        return null
    }

}