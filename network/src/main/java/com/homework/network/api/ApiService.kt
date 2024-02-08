package com.homework.network.api

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface ApiService {
    @GET ("hotels")
    suspend fun getHotels()
}