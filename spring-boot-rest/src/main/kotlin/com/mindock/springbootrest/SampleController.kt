package com.mindock.springbootrest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello")
    fun hello(): String {
        Thread.sleep(5000)
        return "hello"
    }

    @GetMapping("/world")
    fun world(): String {
        Thread.sleep(3000)
        return "world"
    }
}