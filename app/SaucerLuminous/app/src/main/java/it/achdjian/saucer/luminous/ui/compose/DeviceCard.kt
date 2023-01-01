package it.achdjian.saucer.luminous.ui.compose

import android.net.nsd.NsdServiceInfo
import android.util.Log
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.vanpra.composematerialdialogs.MaterialDialog
import com.vanpra.composematerialdialogs.datetime.time.TimePickerColors
import com.vanpra.composematerialdialogs.datetime.time.timepicker
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import com.vanpra.composematerialdialogs.title
import it.achdjian.saucer.luminous.EspHome
import it.achdjian.saucer.luminous.R
import it.achdjian.saucer.luminous.ui.theme.Material3TimePickerColor
import it.achdjian.saucer.luminous.ui.theme.SaucerLuminousTheme
import java.net.InetAddress
import java.time.LocalTime

private const val TAG="DeviceCard"

private fun device(name: String): NsdServiceInfo {
    val device = NsdServiceInfo()
    device.serviceName = name
    device.host = InetAddress.getByAddress(/* addr = */ byteArrayOf(192.toByte(), 168.toByte(),  1.toByte(), 12.toByte()))
    return device
}



@Composable
fun MessageCard(device: EspHome,  onBrightnessChange: (Float)->Unit){
    device.connect()
    if (device.connected.collectAsState().value) {
        Log.d(TAG, "${device.address} connected")
    } else {
        Log.d(TAG, "${device.address} disconnected")
    }
    val idImg = if (device.lightOn.collectAsState().value)
        R.drawable.saucer
    else
        R.drawable.saucer_black
    val openDialog = rememberSaveable{mutableStateOf(false) }
    val startTimePickerState = rememberMaterialDialogState()
    val endTimePickerState = rememberMaterialDialogState()
    val startTime = LocalTime.of(device.startHour.collectAsState().value, device.startMinute.collectAsState().value)
    val endTimeTime = LocalTime.of(device.endHour.collectAsState().value, device.endMinute.collectAsState().value)

    MaterialDialog(
        dialogState = startTimePickerState,
        buttons = {
            positiveButton("Ok"){
                openDialog.value=false
            }
            negativeButton("Cancel"){
                openDialog.value=false
            }
        }
    ) {
        timepicker(is24HourClock = true,
            initialTime = startTime,
            title = "Select start time",
            waitForPositiveButton = true,
            colors = Material3TimePickerColor.colors()
        ) { time ->
            if (time.hour != device.startHour.value){
                device.updateStartHour(time.hour)
            }
            if (time.minute != device.startMinute.value){
                device.updateStartMinute(time.minute)
            }
        }
    }

    MaterialDialog(
        dialogState = endTimePickerState,
        buttons = {
            positiveButton("Ok"){
                openDialog.value=false
            }
            negativeButton("Cancel"){
                openDialog.value=false
            }
        }
    ) {
        timepicker(is24HourClock = true,
            initialTime = endTimeTime,
            title = "Select end time",
            waitForPositiveButton = true,
            colors = Material3TimePickerColor.colors()
        ) { time ->
            if (time.hour != device.endHour.value){
                device.updateEndHour(time.hour)
            }
            if (time.minute != device.endMinute.value){
                device.updateEndMinute(time.minute)
            }
        }
    }

    ElevatedCard(modifier = Modifier
        .background(color = MaterialTheme.colorScheme.background)
        .width(intrinsicSize = IntrinsicSize.Max)
        .padding(horizontal = 16.dp)
        .height(height = 138.dp) ){
        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(MaterialTheme.colorScheme.secondaryContainer)) {

            Image(
                painter = painterResource(idImg) ,
                contentDescription = null,
                modifier = Modifier
                    .defaultMinSize(minWidth = 100.dp)
                    .padding(top = 16.dp, bottom = 16.dp, start = 16.dp)
                    .clickable {
                        device.toggle()
                    }

            )
            Box(modifier = Modifier.fillMaxSize()) {

                HostInfo(
                    device,
                    onBrightnessChange,
                    { startTimePickerState.show() },
                    { endTimePickerState.show() })
                if (!device.connected.collectAsState().value) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RectangleShape)
                            .background(MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.9f))
                    )
                }
            }
        }
    }
}

@Composable
fun HostInfo(device: EspHome, onBrightnessChange: (Float)->Unit, onStartClick: ()->Unit,onEndClick: ()->Unit){
    val brightness = device.lightValue.collectAsState().value
    val startHour = device.startHour.collectAsState().value
    val endHour = device.endHour.collectAsState().value
    val startMinute= device.startMinute.collectAsState().value
    val endMinute = device.endMinute.collectAsState().value

    val startTime = startHour.toString().padStart(2,'0') +":" + startMinute.toString().padStart(2, '0')
    val endTime = endHour.toString().padStart(2,'0') +":" + endMinute.toString().padStart(2, '0')
    Column(modifier = Modifier.padding(horizontal = 16.dp)) {

        Text(
            text = device.serviceName,
            color=MaterialTheme.colorScheme.onSecondaryContainer,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = device.address,
            color=MaterialTheme.colorScheme.onSecondaryContainer,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 3.dp)
        )
        DayAndNight(startTime, endTime, onStartClick, onEndClick)
        Slider(value = brightness, onValueChange = onBrightnessChange,
            modifier = Modifier
                .requiredWidth(IntrinsicSize.Max)
                .width(200.dp))
    }
}



@Composable
fun ListDevice(devices: Collection<NsdServiceInfo>, viewModelProvider: ViewModelProvider){
    SaucerLuminousTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.padding(vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)) {
                for (device in devices) {
                    val espHome = viewModelProvider[device.serviceName, EspHome::class.java]
                    espHome.device = device
                    Log.d("MAIN", "device: ${device.serviceName}")
                    MessageCard(espHome){
                        espHome.changeBrightness(it)
                    }
                }
            }
        }
    }
}



@Preview(device = "Redmi note 8T API 28")
@Composable
fun PreviewMessage() {
     val espHome: EspHome = EspHome()
    espHome.device =  device("sottovasoluminoso")

    MessageCard(device = espHome, {})
}




@Preview(device = "Redmi note 8T API 28")
@Composable
fun PreviewMessages() {
    val viewModelStore = ViewModelStore()
    val viewModeStoreOwner = object : ViewModelStoreOwner {
        override fun getViewModelStore(): ViewModelStore {
            return viewModelStore
        }

    }
    val viewModelProvider = ViewModelProvider(viewModeStoreOwner)

    ListDevice(listOf(device("prova"), device("pippo")), viewModelProvider)
}