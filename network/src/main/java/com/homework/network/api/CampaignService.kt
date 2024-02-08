package com.homework.network.api

import retrofit2.http.GET

interface CampaignService {
    @GET("campaigns")
    suspend fun getHotels()
}