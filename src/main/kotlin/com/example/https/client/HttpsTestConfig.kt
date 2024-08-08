package com.example.https.client

import com.fasterxml.jackson.databind.ObjectMapper
import okhttp3.OkHttpClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

@Configuration
class HttpsTestConfig(
    private val objectMapper: ObjectMapper,
) {

    @Bean
    fun httpsConfig(): HttpsApi {
        return Retrofit.Builder()
            .baseUrl("https://dlsvmfjs.kro.kr")
            .addConverterFactory(JacksonConverterFactory.create(objectMapper))
            .client(
                OkHttpClient.Builder()
                .addInterceptor {
                    val request = it.request()
                        .newBuilder()
                        .build()
                    it.proceed(request)
                }
                .build())
            .build()
            .create(HttpsApi::class.java)
    }

    @Bean
    fun toossApi() : TossApi {
        return Retrofit.Builder()
            .baseUrl("https://api.tosspayments.com/")
            .addConverterFactory(JacksonConverterFactory.create(objectMapper))
            .client(
                OkHttpClient.Builder()
                    .addInterceptor {
                        val request = it.request()
                            .newBuilder()
                            .build()
                        it.proceed(request)
                    }
                    .build())
            .build()
            .create(TossApi::class.java)
    }
}