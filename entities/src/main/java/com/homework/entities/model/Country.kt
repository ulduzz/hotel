package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


import com.google.gson.annotations.SerializedName


@Parcelize
data class Country (

  val code : String? = null,
  val name : String? = null
):Parcelable