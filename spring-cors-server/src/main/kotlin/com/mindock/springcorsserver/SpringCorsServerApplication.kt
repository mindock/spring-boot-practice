package com.mindock.springcorsserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCorsServerApplication

fun main(args: Array<String>) {
    runApplication<SpringCorsServerApplication>(*args)
}
