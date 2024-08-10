package com.example.ecc_test.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClientApi(
    @Value("\${role}") private val role: String,
) {

    @GetMapping("/client")
    fun clientApi() = ApiResponse("$role api v1")
}