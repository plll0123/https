package com.example.https

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HttpsApplication

fun main(args: Array<String>) {
	runApplication<HttpsApplication>(*args)
}
