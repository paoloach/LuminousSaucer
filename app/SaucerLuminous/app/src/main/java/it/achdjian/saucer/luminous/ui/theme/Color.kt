package it.achdjian.saucer.luminous.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vanpra.composematerialdialogs.datetime.time.TimePickerColors
import com.vanpra.composematerialdialogs.datetime.time.timepicker

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


class SaucerTimePickerColors(
    private val activeBackgroundColor: Color,
    private val inactiveBackgroundColor: Color,
    private val activeTextColor: Color,
    private val inactiveTextColor: Color,
    private val inactivePeriodBackground: Color,
    private val selectorColor: Color,
    private val selectorTextColor: Color,
    private val headerTextColor: Color,
    borderColor: Color
) : TimePickerColors {
    override val border = BorderStroke(1.dp, borderColor)

    @Composable
    override fun backgroundColor(active: Boolean): State<Color> {
        return rememberUpdatedState(if (active) activeBackgroundColor else inactiveBackgroundColor)
    }

    @Composable
    override fun textColor(active: Boolean): State<Color> {
        return rememberUpdatedState(if (active) activeTextColor else inactiveTextColor)
    }

    override fun selectorColor(): Color {
        return selectorColor
    }

    override fun selectorTextColor(): Color {
        return selectorTextColor
    }

    override fun headerTextColor(): Color {
        return headerTextColor
    }

    @Composable
    override fun periodBackgroundColor(active: Boolean): State<Color> {
        return rememberUpdatedState(if (active) activeBackgroundColor else inactivePeriodBackground)
    }
}

/**
 * Object to hold default values used by [timepicker]
 */
object Material3TimePickerColor {
    @Composable
    fun colors(
        activeBackgroundColor: Color = MaterialTheme.colorScheme.secondaryContainer,
        inactiveBackgroundColor: Color =  MaterialTheme.colorScheme.background,
        activeTextColor: Color =  MaterialTheme.colorScheme.onSecondaryContainer,
        inactiveTextColor: Color =MaterialTheme.colorScheme.onBackground,
        inactivePeriodBackground: Color = Color.Transparent,
        selectorColor: Color = MaterialTheme.colorScheme.primary,
        selectorTextColor: Color = MaterialTheme.colorScheme.onPrimary,
        headerTextColor: Color = MaterialTheme.colorScheme.onBackground,
        borderColor: Color = MaterialTheme.colorScheme.onBackground
    ): TimePickerColors {
        return SaucerTimePickerColors(
            activeBackgroundColor = activeBackgroundColor,
            inactiveBackgroundColor = inactiveBackgroundColor,
            activeTextColor = activeTextColor,
            inactiveTextColor = inactiveTextColor,
            inactivePeriodBackground = inactivePeriodBackground,
            selectorColor = selectorColor,
            selectorTextColor = selectorTextColor,
            headerTextColor = headerTextColor,
            borderColor = borderColor
        )
    }
}
