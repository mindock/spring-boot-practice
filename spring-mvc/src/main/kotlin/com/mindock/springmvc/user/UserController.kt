package com.mindock.springmvc.user

import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }

    @PostMapping("/users")
    fun create(@RequestBody user: User): User {
        return user
    }
}