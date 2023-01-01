package  it.achdjian.saucer.luminous

import android.net.nsd.NsdServiceInfo
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import it.achdjian.saucer.luminous.protobuf.LightStateResponse
import it.achdjian.saucer.luminous.protobuf.NumberStateResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

private const val TAG = "EspHome "


class EspHome : ViewModel() {
    companion object {
        const val clientName = "SaucerLuminous"
        const val EndHourSensorName = "end_hour"
        const val EndMinuteSensorName = "end_minute"
        const val StartHourSensorName = "start_hour"
        const val StartMinuteSensorName = "start_minute"
    }

    var device:NsdServiceInfo?=null
    val serviceName : String get() = device?.serviceName ?: "undefined"
    val address get() = device?.host?.hostAddress ?: "unknown"

    private val _lightOn = MutableStateFlow(false)
    val lightOn: StateFlow<Boolean> get() = _lightOn

    private val _startHour = MutableStateFlow(0)
    val startHour: StateFlow<Int> get() = _startHour
    private val _endHour = MutableStateFlow(0)
    val endHour: StateFlow<Int> get() = _endHour
    private val _endMinute = MutableStateFlow(0)
    val endMinute: StateFlow<Int> get() = _endMinute
    private val _startMinute = MutableStateFlow(0)
    val startMinute: StateFlow<Int> get() = _startMinute

    var key: Int=0

    private val _lightValue = MutableStateFlow(0.0f)
    val lightValue: StateFlow<Float> get() = _lightValue

    val espHomeProtoBuffer =  EspHomeProtoBuffer(viewModelScope)
    val connected: StateFlow<Boolean> get() = espHomeProtoBuffer.connected
    fun connect() {
        if (!espHomeProtoBuffer.connected.value){
            viewModelScope.launch(Dispatchers.IO) {
                device?.let {
                    espHomeProtoBuffer.service = it
                    espHomeProtoBuffer.connect()
                    if (espHomeProtoBuffer.connected.value) {
                        parsingResponses()
                    }
                }
            }
        }
    }

    fun changeBrightness(value: Float) {
        viewModelScope.launch(Dispatchers.IO) {
            connect()
            if (espHomeProtoBuffer.connected.value) {
                espHomeProtoBuffer.changeBrightness(key, _lightOn.value, value)
            }
        }
    }

    private suspend fun parsingResponses() {
        viewModelScope.launch ( Dispatchers.IO ){
            while (true) {
                val message = espHomeProtoBuffer.responseChannel.receive()
                if (message is LightStateResponse) {
                    _lightOn.value = message.state
                    _lightValue.value = message.brightness
                    key = message.key
                }
                if (message is NumberStateResponse) {
                    if (message.key == espHomeProtoBuffer.getNumberKey(StartHourSensorName)){
                        _startHour.value = message.state.toInt()
                    }else if (message.key == espHomeProtoBuffer.getNumberKey(EndHourSensorName)){
                        _endHour.value = message.state.toInt()
                    } else if (message.key == espHomeProtoBuffer.getNumberKey(EndMinuteSensorName)){
                        _endMinute.value = message.state.toInt()
                    } else if (message.key == espHomeProtoBuffer.getNumberKey(StartMinuteSensorName)){
                        _startMinute.value = message.state.toInt()
                    }

                }
            }
        }
    }

    fun toggle() {
        viewModelScope.launch(Dispatchers.IO) {
            connect()
            espHomeProtoBuffer.changeBrightness(key, !_lightOn.value, _lightValue.value)
        }
    }


    fun updateEndHour(time: Int) = updateTime(EndHourSensorName, time)
    fun updateEndMinute(time: Int) = updateTime(EndMinuteSensorName, time)
    fun updateStartHour(time: Int) = updateTime(StartHourSensorName, time)
    fun updateStartMinute(time: Int) = updateTime(StartMinuteSensorName, time)

    private fun updateTime(sensorName: String, time: Int){
        viewModelScope.launch(Dispatchers.IO) {
                connect()
                val key = espHomeProtoBuffer.getNumberKey(sensorName)
                key?.let { espHomeProtoBuffer.setNumber(it, time.toFloat())}
        }
    }

}