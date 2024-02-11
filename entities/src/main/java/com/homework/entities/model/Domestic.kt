package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Domestic (
  val image : String? = null,
  val index : Int? = null
):Parcelable