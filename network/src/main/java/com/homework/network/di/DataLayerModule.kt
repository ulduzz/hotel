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
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataLayerModule {


    @Provides
    @Singleton
    fun provideGson() : Gson{
        return Gson()
    }



    @Provides
    @Singleton
    @HotelsAnnotation
    fun provideApiClient(gson: Gson, @HotelsAnnotation client: OkHttpClient) : Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(" https://65a7624794c2c5762da692dd.mockapi.io/api/v1/ ")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
        return retrofit
    }

    @Provides
    @Singleton
    fun providerApiService(@HotelsAnnotation retrofit: Retrofit): ApiService{
        return retrofit.create(ApiService::class.java)
    }
    @Provides
    @Singleton
    @HotelsAnnotation
    fun provideOkHttpClient(): OkHttpClient{
        val client = OkHttpClient.Builder()

        client
            .connectTimeout(60,TimeUnit.SECONDS)
            .readTimeout(60,TimeUnit.SECONDS)
            .writeTimeout(60,TimeUnit.SECONDS)
        return  client.build()

    }

    @Provides
    @Singleton
    @CampaignAnnotation
    fun provideCampaignApiClient(gson: Gson, @CampaignAnnotation client: OkHttpClient) : Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl(" https://65a7624794c2c5762da692dd.mockapi.io/api/v5/ ")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
        return retrofit
    }

    @Provides
    @Singleton
    fun providerCampaignService(@CampaignAnnotation retrofit: Retrofit): CampaignService {
        return retrofit.create(CampaignService::class.java)
    }
    @Provides
    @Singleton
    @CampaignAnnotation
    fun provideCampaignOkHttpClient(): OkHttpClient {
        val client = OkHttpClient.Builder()

        client
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
        return  client.build()

    }
}

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class HotelsAnnotation


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class CampaignAnnotation