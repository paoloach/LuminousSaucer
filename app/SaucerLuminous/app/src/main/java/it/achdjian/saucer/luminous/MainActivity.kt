package it.achdjian.saucer.luminous

import android.net.nsd.NsdServiceInfo
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import it.achdjian.saucer.luminous.ui.compose.ListDevice
import it.achdjian.saucer.luminous.ui.compose.MessageCard
import it.achdjian.saucer.luminous.ui.theme.SaucerLuminousTheme
import java.net.Inet4Address

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModelProvider = ViewModelProvider(this)
        val sottovasoLuminosoViewModel: LuminousSaucer by viewModels()

        sottovasoLuminosoViewModel.devices.value.map {

          //  val espHome: EspHome() by viewModels()

        }


        setContent {
            val devices by sottovasoLuminosoViewModel.devices.collectAsState()

            ListDevice(devices = devices.values,viewModelProvider)
        }
    }
}

