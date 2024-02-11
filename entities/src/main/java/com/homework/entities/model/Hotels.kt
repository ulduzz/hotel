package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Hotels (

  val id : Int? = null,
  val details : Details? = null,
  val rooms : List<Rooms>? = null,
  val cached : Boolean? = null,
  val df : Boolean? = null,
  val fc : Boolean? = null
):Parcelable