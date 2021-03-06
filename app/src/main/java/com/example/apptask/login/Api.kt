package com.example.apptask.login

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("login")
    fun useLogin(

        @Field("email") email:String,
        @Field("password") password: String

    ): Call<LoginResponse>


}