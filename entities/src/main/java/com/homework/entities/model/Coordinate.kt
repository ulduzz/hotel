package com.example.example

import com.google.gson.annotations.SerializedName


data class Coordinate (

  @SerializedName("longitude" ) var longitude : Double? = null,
  @SerializedName("latitude"  ) var latitude  : Double? = null

)