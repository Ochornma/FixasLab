package org.promise.fixaslab.Retrofit

import org.promise.fixaslab.models.CoinResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {

    fun getResponse(): List<CoinResponse>{

        var coinsList = ArrayList<CoinResponse>()
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.coinmarketcap.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(Api::class.java)

        val call: Call<List<CoinResponse>> = api.getCoins(50)

        call.enqueue(object : Callback<List<CoinResponse>>{
            override fun onFailure(call: Call<List<CoinResponse>>, t: Throwable) {

            }

            override fun onResponse(call: Call<List<CoinResponse>>, response: Response<List<CoinResponse>>) {
               if (response.isSuccessful){
                   coinsList = response.body() as ArrayList<CoinResponse>
               }
            }

        })

        return coinsList
    }
}