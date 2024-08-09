package com.example.ecc_test.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminApi {

    @GetMapping("/admin")
    fun adminApi() = AdminApiResponse("admin api v1")
}