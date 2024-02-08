package com.example.example

import com.google.gson.annotations.SerializedName


data class Domestic (

  @SerializedName("image" ) var image : String? = null,
  @SerializedName("index" ) var index : Int?    = null

)