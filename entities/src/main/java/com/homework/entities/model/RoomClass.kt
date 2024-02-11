package com.homework.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
data class RoomClass (

  val code : String? = null,
  val description : String? = null,
  val refundable : Boolean? = null,
  val promotion : Boolean? = null,
  val offer : Boolean? = null
):Parcelable
