package com.example.https.api

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class EndPoint(

) {
    @Value("\${hello}")lateinit var profile: String

    @GetMapping("/hello")
    fun hello() = profile

}