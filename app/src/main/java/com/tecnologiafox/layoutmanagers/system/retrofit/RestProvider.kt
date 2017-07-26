package com.tecnologiafox.layoutmanagers.system.retrofit

import com.tecnologiafox.layoutmanagers.system.retrofit.apis.NetflixRoulleteApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RestProvider {

    companion object {
        val ENDPOINT: String = "http://netflixroulette.net/api/api.php"
    }

    public fun build(): Retrofit {
        return Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    public fun getNetflixApi(): NetflixRoulleteApi {
        return build().create(NetflixRoulleteApi::class.java)
    }

}