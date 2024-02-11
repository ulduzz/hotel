package com.homework.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
data class Rooms (

  val reference : String? = null,
  val type : Type? = null,
  val images : List<Images>? = null,
  val offers : List<Offers>? = null,
  val facilities : List<String>? = null,
  val information : List<String>? = null,
  val alerts : List<String>? = null,
  val description : String? = null
):Parcelable