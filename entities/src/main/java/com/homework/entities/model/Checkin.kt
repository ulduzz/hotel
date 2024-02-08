package com.example.example

import com.google.gson.annotations.SerializedName


data class Checkin (

  @SerializedName("begin_time" ) var beginTime : String? = null,
  @SerializedName("end_time"   ) var endTime   : String? = null

)