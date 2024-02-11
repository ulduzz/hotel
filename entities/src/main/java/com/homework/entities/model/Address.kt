package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Address (

  val address : String? = null,
  val zipCode : Int? = null,
  val country : Country? = null,
  val countryCode : String? = null,
  val town : Town? = null,
  val city : City? = null
):Parcelable