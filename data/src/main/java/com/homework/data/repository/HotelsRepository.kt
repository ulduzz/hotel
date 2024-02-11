package com.homework.data.repository

import com.homework.entities.model.Result
import com.homework.entities.model.Rooms
import com.homework.network.api.ApiService
import javax.inject.Inject

interface HotelsRepositoryInterface{
    suspend fun  getHotels(): Result?
}

class HotelsRepository @Inject constructor(private val apiService: ApiService) :
    HotelsRepositoryInterface {
    override suspend fun getHotels(): com.homework.entities.model.Result? {
        return  apiService.getHotels()
    }

}