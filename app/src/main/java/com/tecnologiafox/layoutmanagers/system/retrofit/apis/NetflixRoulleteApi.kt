package com.tecnologiafox.layoutmanagers.system.retrofit.apis

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface NetflixRoulleteApi {

    @GET("title")
    fun getMovie(@Path("username") username: String): Call<User>

}