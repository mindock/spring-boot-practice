package com.mindock.springcorsclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCorsClientApplication

fun main(args: Array<String>) {
    runApplication<SpringCorsClientApplication>(*args)
}
