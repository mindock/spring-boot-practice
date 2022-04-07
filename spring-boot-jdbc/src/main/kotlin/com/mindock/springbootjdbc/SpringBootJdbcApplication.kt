package com.mindock.springbootjdbc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootJdbcApplication

fun main(args: Array<String>) {
    runApplication<SpringBootJdbcApplication>(*args)
}
