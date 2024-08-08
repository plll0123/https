package com.example.https.client

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface TossApi {

    @GET("/v1/payments/{paymentKey}")
    fun paymentInfo(
        @Header("Authorization") authorization: String,
        @Path("paymentKey") paymentKey: String
    ): Call<Any>
}