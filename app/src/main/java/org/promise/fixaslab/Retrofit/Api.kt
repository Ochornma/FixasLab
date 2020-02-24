package org.promise.fixaslab.Retrofit

import org.promise.fixaslab.models.CoinResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("v1/ticker")
    fun getCoins(@Query("limit") limit: Int): Call<List<CoinResponse>>
}