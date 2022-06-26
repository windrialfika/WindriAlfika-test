package com.windrialfika.winewsmandiri.Entity.Data.Response

import com.google.gson.annotations.SerializedName
import com.windrialfika.winewsmandiri.Entity.Data.Model.MainDetail

class MainResponse (
    @SerializedName("status")
    val status: String?,
    @SerializedName("sources")
    val sources: List<MainDetail>
)
