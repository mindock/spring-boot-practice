package com.mindock.springcorsserver

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

//    @CrossOrigin(origins = ["http://localhost:18080"])
    @GetMapping("/hello")
    fun hello(): String = "hello"
}