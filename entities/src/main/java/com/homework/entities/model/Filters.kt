package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Filters (

  val min : Min? = null,
  val max : Max? = null,
  val title : String? = null,
  val name : String? = null,
  val icon : String? = null,
  val type : String? = null,
  val items : List<String>? = null
):Parcelable