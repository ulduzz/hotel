package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Offers (

  val hotels : List<Hotels>? = null,
  val totalCount : Int? = null,
  val availableCount : Int? = null
):Parcelable