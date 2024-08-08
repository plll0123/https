package com.example.https.client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class HttpsApiTest(
    private val httpsApi: HttpsApi,
    private val tossApiWrapper: TossApiWrapper
) {

    @GetMapping("/hello")
    fun hello() {
        val execute = httpsApi.health().execute()
        println("httpsApi = ${httpsApi}")
    }

    @GetMapping("/toss")
    fun hello1(
        @RequestParam(value = "key", required = false) key: String,
    ) {
        tossApiWrapper.getPaymentInfo(key)
    }
}