package com.sateeshjh.mviweatherapp.data.repository

import com.sateeshjh.mviweatherapp.data.mappers.toWeatherInfo
import com.sateeshjh.mviweatherapp.data.remote.WeatherApi
import com.sateeshjh.mviweatherapp.domain.repository.WeatherRepository
import com.sateeshjh.mviweatherapp.domain.util.Resource
import com.sateeshjh.mviweatherapp.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "Unknown error occured")
        }
    }
}