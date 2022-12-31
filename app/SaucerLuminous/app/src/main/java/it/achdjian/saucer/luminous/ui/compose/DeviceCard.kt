package it.achdjian.saucer.luminous.ui.compose

import android.net.nsd.NsdServiceInfo
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import it.achdjian.saucer.luminous.EspHome
import it.achdjian.saucer.luminous.R
import it.achdjian.saucer.luminous.ui.theme.SaucerLuminousTheme
import java.net.Inet4Address
import java.net.InetAddress


private fun device(name: String): NsdServiceInfo {
    val device = NsdServiceInfo()
    device.serviceName = name
    device.host = InetAddress.getByAddress(/* addr = */ byteArrayOf(192.toByte(), 168.toByte(),  1.toByte(), 12.toByte()))
    return device
}



@Composable
fun MessageCard(device: EspHome){
    device.connect()
    val idImg = if (device.connected)
        R.drawable.basilico
    else
        R.drawable.basilico_dark
    ElevatedCard(modifier = Modifier
        .background(color = Color(0xCAC4D0))
        .width(intrinsicSize = IntrinsicSize.Max)
        .padding(horizontal = 16.dp)
        .height(height = 138.dp) ){
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(idImg) ,
                contentDescription = null,
                modifier = Modifier
                    .defaultMinSize(minWidth = 100.dp)
                    .padding(top = 16.dp, bottom = 16.dp, start = 16.dp)

            )
            HostInfo(device)
        }
    }
}

@Composable
fun HostInfo(device: EspHome){

    Column(modifier = Modifier.padding(horizontal = 16.dp)) {

        Text(
            text = device.serviceName,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = device.address,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 3.dp)
        )
        DayAndNight("07:00", "10:00")
        Slider(value = 0.25f, onValueChange = {},
            modifier = Modifier.requiredWidth(IntrinsicSize.Max).width(200.dp))
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
                    MessageCard(espHome)
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

    MessageCard(device = espHome)
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