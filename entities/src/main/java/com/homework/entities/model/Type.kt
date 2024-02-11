package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Type (

  val id : String? = null,
  val name : String? = null,
  val typeCode : String? = null,
  val characteristicCode : String? = null
):Parcelable