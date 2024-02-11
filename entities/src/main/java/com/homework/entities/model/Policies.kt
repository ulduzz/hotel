package com.homework.entities.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

import com.google.gson.annotations.SerializedName


@Parcelize
data class Policies (

  val checkin : Checkin? = null,
  val checkout : String? = null,
  val instructions : String? = null,
  val special_instructions : String? = null,
  val checkin_min_age : String? = null,
  val fees : Fees? = null,
  val know_before_you_go : String? = null
):Parcelable