package com.homework.data.repository

import com.homework.network.api.ApiService
import javax.inject.Inject


interface HotelsRepositoryInterface{
    suspend fun  getHotels(): SearchResponse?
}

class HotelsRepository @Inject constructor(private val apiService: ApiService) :
    HotelsRepositoryInterface {
    override suspend fun getHotels(): SearchResponse? {
        return  apiService.getHotels()
    }
}