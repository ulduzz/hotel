package com.example.example

import com.google.gson.annotations.SerializedName


data class ExampleJson2KtKotlin (

  @SerializedName("responseCode"     ) var responseCode    : Int?             = null,
  @SerializedName("errors"           ) var errors          : String?          = null,
  @SerializedName("message"          ) var message         : String?          = null,
  @SerializedName("result"           ) var result          : Result?          = Result(),
  @SerializedName("campaign_banners" ) var campaignBanners : CampaignBanners? = CampaignBanners()

)