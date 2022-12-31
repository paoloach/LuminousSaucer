package  it.achdjian.saucer.luminous

import android.net.nsd.NsdServiceInfo
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import it.achdjian.saucer.luminous.protobuf.CoverCommandRequest
import it.achdjian.saucer.luminous.protobuf.HelloRequest
import it.achdjian.saucer.luminous.protobuf.HelloResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private const val TAG = "EspHome "


class EspHome : ViewModel() {
    companion object {
        const val clientName = "SaucerLuminous"
    }

    var device:NsdServiceInfo?=null
    val serviceName : String get() = device?.serviceName ?: "undefined"
    val address get() = device?.host?.hostAddress ?: "unknown"
    var connected = false

    fun connect() {
        if (!connected){
            connected=true
            viewModelScope.launch(Dispatchers.IO) {
                device?.let {
                    val espHomeProtoBuffer = EspHomeProtoBuffer(it)
                    espHomeProtoBuffer.connect()


                }
            }
        }
    }

}