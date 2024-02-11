package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Fees (

  val mandatory : String? = null,
  val optional : String? = null
):Parcelable