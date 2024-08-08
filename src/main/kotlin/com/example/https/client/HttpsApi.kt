package com.example.https.client

import retrofit2.Call
import retrofit2.http.GET

interface HttpsApi {

    @GET("/api/health")
    fun health(): Call<Any>
}
