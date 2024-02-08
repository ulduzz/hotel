package com.homework.network.di

import com.google.gson.Gson
import com.homework.network.api.ApiService
import com.homework.network.api.CampaignService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


    @Module
    @InstallIn(SingletonComponent::class)
   abstract class CampaignServiceModule {


    }