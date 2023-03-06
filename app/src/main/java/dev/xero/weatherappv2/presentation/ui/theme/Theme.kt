package dev.xero.weatherappv2.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun WeatherAppV2Theme(content: @Composable () -> Unit) {
	MaterialTheme(
		typography = Typography,
		shapes = Shapes,
		content = content
	)
}