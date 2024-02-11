package com.homework.entities.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
data class SortingMethods (

  val value : Int? = null,
  val text : String? = null,
  val default : Boolean? = null,
  val description : String? = null
):Parcelable