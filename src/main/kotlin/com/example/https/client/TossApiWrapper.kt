package com.example.https.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.util.*

@Component
class TossApiWrapper (
    @Value("\${toss.secret}") private val secret: String,
    private val tossApi: TossApi
){

    fun getPaymentInfo(key: String) {
        val encode = Base64.getEncoder().encode("$secret:".toByteArray())
        val s = "Basic " + String(encode)
        val paymentInfo = tossApi.paymentInfo(s, key)
        val execute = paymentInfo.execute()
        println("execute = ${execute.body()}")
    }
}