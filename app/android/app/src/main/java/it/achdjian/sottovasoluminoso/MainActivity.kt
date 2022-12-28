package it.achdjian.sottovasoluminoso

import android.net.nsd.NsdServiceInfo
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview


import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.ui.AppBarConfiguration
import kotlinx.coroutines.launch
import java.net.Inet4Address
import java.net.InetAddress


class MainActivity : ComponentActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
  //  private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val sottovasoLuminosoViewModel: LuminousSaucer by viewModels()

        /*
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                // Trigger the flow and start listening for values.
                // Note that this happens when lifecycle is STARTED and stops
                // collecting when the lifecycle is STOPPED
                sottovasoLuminosoViewModel.devices.collect{
                    it.values.forEach { service ->
                        Log.d("Main", "service: $service")
                    }
                }

            }
        }
*/

        setContent{
            val devices by sottovasoLuminosoViewModel.devices.collectAsState()
            listDevice(devices = devices.values)
        }
    }
}

@Composable
fun listDevice(devices: Collection<NsdServiceInfo>){
    Column() {
        for (device in devices) {
           Log.d("MAIN", "device: $device")
            MessageCard(device)
        }
    }
}

@Composable
fun MessageCard(device:NsdServiceInfo){

    Card{
        Text(text = device.serviceName,
            style = MaterialTheme.typography.h3        )
        Text(text = device.host?.hostAddress ?: "unknown",
            style = MaterialTheme.typography.body1)
    }
}

@Preview
@Composable
fun previewMessage() {
    val device1 = NsdServiceInfo()
    device1.serviceName = "prova"
    device1.host = Inet4Address.getLocalHost()
    val device2 = NsdServiceInfo()
    device2.serviceName = "test"
    device2.host = Inet4Address.getLocalHost()

    listDevice(listOf(device1, device2))
}