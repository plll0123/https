package com.example.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EndPoint(
    @Value("\${spring.config.activate.on-profile}") var profile: String,
) {

    @GetMapping("/hello")
    fun hello() = profile
}