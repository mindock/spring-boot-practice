package com.mindock.springbootsecurity.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }

    @GetMapping("/my")
    fun my(): String {
        return "my"
    }
}