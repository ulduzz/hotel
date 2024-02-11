package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Coordinate (

  val longitude : Double? = null,
  val latitude : Double? = null
):Parcelable