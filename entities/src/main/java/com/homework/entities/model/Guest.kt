package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.google.gson.annotations.SerializedName


@Parcelize
data class Guest (

  val adults : Int? = null,
  val children : Int? = null
):Parcelable