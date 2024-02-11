package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Extra (

  val image_count : Int? = null,
  val thumbnailImage : String? = null
):Parcelable