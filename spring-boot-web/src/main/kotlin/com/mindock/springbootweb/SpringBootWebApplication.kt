package com.mindock.springbootweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class SpringBootWebApplication

fun main(args: Array<String>) {
    runApplication<SpringBootWebApplication>(*args)
}