package com.example.ecc_test.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientApi {

    @GetMapping("/client")
    fun clientApi() = ApiResponse("client api v1")
}