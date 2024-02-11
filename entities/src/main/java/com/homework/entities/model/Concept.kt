package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Concept (

  val code : Int? = null,
  val description : String? = null,
  val parentCode : String? = null,
  val conceptIconColorCode : String? = null,
  val conceptIcon : String? = null
):Parcelable