package com.mindock.springbootjpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootJpaApplication

fun main(args: Array<String>) {
    runApplication<SpringBootJpaApplication>(*args)
}
