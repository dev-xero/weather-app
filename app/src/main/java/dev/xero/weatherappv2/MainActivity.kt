package dev.xero.weatherappv2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.xero.weatherappv2.presentation.ui.theme.WeatherAppV2Theme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			WeatherAppV2Theme {}
		}
	}
}