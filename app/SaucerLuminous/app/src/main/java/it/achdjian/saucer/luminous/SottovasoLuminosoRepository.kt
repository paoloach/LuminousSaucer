package  it.achdjian.saucer.luminous

import android.app.Application
import android.content.Context
import android.net.nsd.NsdManager
import android.net.nsd.NsdServiceInfo
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.channels.trySendBlocking
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Semaphore


private const val TAG="Zeroconf"
const val SERVICE_TYPE="_esphomelib._tcp"
const val SERVICE_NAME="sottovasoluminoso"


class LuminousSaucer(applicaion: Application) : AndroidViewModel(applicaion) {
    val resolverChannel = Channel<NsdServiceInfo>(5)
    val discoveredChannel = Channel<NsdServiceInfo>(Channel.RENDEZVOUS)


    private val _devices = MutableStateFlow(mapOf<String, NsdServiceInfo>())
    val devices: StateFlow<Map<String, NsdServiceInfo>> get() = _devices
    val nsdManager = applicaion.getSystemService(Context.NSD_SERVICE) as NsdManager

    init {

        val callbackDiscovery = object  : NsdManager.DiscoveryListener {
            override fun onStartDiscoveryFailed(p0: String?, p1: Int) {
                Log.e(TAG, "failed: $p0")

            }

            override fun onStopDiscoveryFailed(p0: String?, p1: Int) {
                Log.e(TAG, "service stop: $p0")
            }

            override fun onDiscoveryStarted(p0: String?) {
            }

            override fun onDiscoveryStopped(p0: String?) {
                Log.e(TAG, "service stop: $p0")
            }

            override fun onServiceFound(service: NsdServiceInfo?) {
                service?.let {
                    Log.d(TAG, "Found service: ${service.serviceName}")
                    if (service.serviceName.startsWith("sottovasoluminoso")) {
                        viewModelScope.launch {
                            discoveredChannel.send(it)
                        }
                    }
                }
            }

            override fun onServiceLost(service: NsdServiceInfo?) {
                Log.e(TAG, "service lost: $service")
            }

        }
        nsdManager.discoverServices(SERVICE_TYPE, NsdManager.PROTOCOL_DNS_SD,callbackDiscovery )

        viewModelScope.launch {
            val waitingResolve = Semaphore(1)
            while(true) {
                val discovered = discoveredChannel.receive()
                Log.d(TAG,"Start resolve")

                val callback = object  : NsdManager.ResolveListener {
                    override fun onResolveFailed(service: NsdServiceInfo?, cause: Int) {
                        Log.e(TAG, "resolver failed for ${service?.serviceName}: cause, $cause")
                        waitingResolve.release()
                    }

                    override fun onServiceResolved(service: NsdServiceInfo?) {
                        service?.let {
                            Log.d(TAG, "resolve service: ${service.serviceName} -- ${service.host.address}")
                            viewModelScope.launch {
                                resolverChannel.send(service)
                                waitingResolve.release()
                            }
                        }
                    }
                }
                waitingResolve.acquire()
                nsdManager.resolveService(discovered, callback)

            }
        }
        viewModelScope.launch {
            while (true){
                val resolvedService = resolverChannel.receive()
                Log.d(TAG, "new service resolved: ${resolvedService.serviceName}")
                if (!_devices.value.containsKey(resolvedService.serviceName)){
                    val newMap = _devices.value.toMutableMap()
                    newMap.put(resolvedService.serviceName, resolvedService)
                    _devices.value = newMap
                    Log.d(TAG, "new value resolved: ${newMap.keys}}")
                }
            }
        }
    }

}
