package com.example.info_perndakian.api

import com.example.info_perndakian.ResponseLuarSumatera
import com.example.info_perndakian.ResponseSumatera
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
        @GET("gunung/2")
        fun getGunung () : Call<ResponseSumatera>

        @GET("gunung/1")
        fun getGunung1 () : Call<ResponseLuarSumatera>


}