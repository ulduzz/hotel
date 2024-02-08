package com.example.example

import com.google.gson.annotations.SerializedName


data class RoomClass (

  @SerializedName("code"        ) var code        : String?  = null,
  @SerializedName("description" ) var description : String?  = null,
  @SerializedName("refundable"  ) var refundable  : Boolean? = null,
  @SerializedName("promotion"   ) var promotion   : Boolean? = null,
  @SerializedName("Namepackage" ) var Namepackage     : Boolean? = null,
  @SerializedName("offer"       ) var offer       : Boolean? = null

)