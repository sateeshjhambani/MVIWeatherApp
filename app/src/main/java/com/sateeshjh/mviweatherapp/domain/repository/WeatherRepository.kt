package com.sateeshjh.mviweatherapp.domain.repository

import com.sateeshjh.mviweatherapp.domain.util.Resource
import com.sateeshjh.mviweatherapp.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}