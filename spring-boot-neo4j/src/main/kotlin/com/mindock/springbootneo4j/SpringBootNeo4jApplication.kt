package com.mindock.springbootneo4j

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootNeo4jApplication

fun main(args: Array<String>) {
    runApplication<SpringBootNeo4jApplication>(*args)
}
