package it.achdjian.saucer.luminous.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import it.achdjian.saucer.luminous.R

@Composable
fun DayAndNight(start:String, end:String,onStartClick: ()->Unit,onEndClick: ()->Unit) {
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 10.dp)) {
        Icon(
            painterResource(id = R.drawable.ic_outline_wb_sunny_24),
            contentDescription = null,
            modifier = Modifier.clickable (onClick = onStartClick)
        )
        Text(
            text=start,
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.clickable (onClick = onStartClick)
        )
        Icon(
            painterResource(id = R.drawable.ic_outline_bedtime_24),
            contentDescription = null,
            modifier = Modifier.clickable (onClick = onEndClick)
        )
        Text(
            text=end,
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.clickable (onClick = onEndClick)
        )
    }
}


@Preview(device = "Redmi note 8T API 28")
@Composable
fun PreviewDayAndNight() {
    DayAndNight("07:00", "22:00",{},{})
}