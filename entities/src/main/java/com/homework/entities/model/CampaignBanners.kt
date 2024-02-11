package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
data class Campaign_banners (

  val domestic : List<Domestic>? = null,
  val international : List<String>? = null
):Parcelable