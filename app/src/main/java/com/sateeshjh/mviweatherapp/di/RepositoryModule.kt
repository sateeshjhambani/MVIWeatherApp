package com.sateeshjh.mviweatherapp.di

import com.sateeshjh.mviweatherapp.data.location.DefaultLocationTracker
import com.sateeshjh.mviweatherapp.data.repository.WeatherRepositoryImpl
import com.sateeshjh.mviweatherapp.domain.location.LocationTracker
import com.sateeshjh.mviweatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}