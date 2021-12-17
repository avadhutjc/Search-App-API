package com.ajc.search_app.models.remote


import com.ajc.search_app.models.remote.Data
import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("requestId")
    val requestId: String
)