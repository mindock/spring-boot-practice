package com.mindock.springbootsecurity

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootSecurityApplication

fun main(args: Array<String>) {
    runApplication<SpringBootSecurityApplication>(*args)
}
