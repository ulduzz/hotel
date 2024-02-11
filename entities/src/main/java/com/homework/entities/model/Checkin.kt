package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Checkin (

  val begin_time : String? = null,
  val end_time : String? = null
):Parcelable