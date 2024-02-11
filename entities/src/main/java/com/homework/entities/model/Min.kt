package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Min (

  val name : String? = null,
  val code : String? = null,
  val value : String? = null,
  val type : String? = null,
  val position : Int? = null,
  val count : String? = null
):Parcelable