package dev.xero.weatherappv2.data.remote

import com.squareup.moshi.Json

data class WeatherDTO(
	@field:Json(name = "hourly")
	val weatherData: WeatherDataDTO
)
