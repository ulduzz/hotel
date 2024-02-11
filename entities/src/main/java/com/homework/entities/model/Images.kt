package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Images (

  val url : String? = null,
  val name : String? = null,
  val type : String? = null
):Parcelable