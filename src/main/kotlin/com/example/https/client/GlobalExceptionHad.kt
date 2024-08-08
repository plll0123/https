package com.example.https.client

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHad {

    @ExceptionHandler(Exception::class)
    fun handle(exception: Exception){
        println("exception.message = ${exception.message}")
        println("exception.message = ${exception.message}")
        println("exception.message = ${exception.message}")
        println("exception.message = ${exception.message}")
        println("exception.message = ${exception.message}")
    }

}