package com.example.example

import com.google.gson.annotations.SerializedName


data class Offers (

  @SerializedName("hotels"         ) var hotels         : ArrayList<Hotels> = arrayListOf(),
  @SerializedName("totalCount"     ) var totalCount     : Int?              = null,
  @SerializedName("availableCount" ) var availableCount : Int?              = null

)