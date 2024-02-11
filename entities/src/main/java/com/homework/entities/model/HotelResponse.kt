package com.homework.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
data class HotelResponse (
  val responseCode : Int? = null,
  val errors : String? = null,
  val message : String? = null,
  val result : Result? = null,
  val campaign_banners : Campaign_banners? = null
):Parcelable