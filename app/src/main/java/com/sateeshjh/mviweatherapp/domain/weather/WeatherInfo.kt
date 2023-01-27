package com.sateeshjh.mviweatherapp.domain.weather

import com.sateeshjh.mviweatherapp.data.remote.WeatherDataDTO

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherDataDTO>>,
    val currentWeatherData: WeatherDataDTO?
)