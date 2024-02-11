package com.homework.network.api

import androidx.lifecycle.LiveData
import com.homework.entities.model.Result
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {
    @GET ("hotels")
    suspend fun getHotels() : Result?
}