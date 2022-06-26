package com.windrialfika.winewsmandiri.Entity.Data.Model

import com.google.gson.annotations.SerializedName

data class MainDetail (
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String
)
