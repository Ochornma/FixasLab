package org.promise.fixaslab.models


import com.google.gson.annotations.SerializedName

data class CoinResponse(


    @SerializedName("name")
    val name: String,
    @SerializedName("percent_change_1h")
    val percentChange1h: String,
    @SerializedName("price_usd")
    val priceUsd: String,
    @SerializedName("rank")
    val rank: String,
    @SerializedName("symbol")
    val symbol: String
)