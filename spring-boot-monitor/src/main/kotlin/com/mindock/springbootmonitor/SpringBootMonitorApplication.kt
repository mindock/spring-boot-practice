package com.mindock.springbootmonitor

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAdminServer
class SpringBootMonitorApplication

fun main(args: Array<String>) {
    runApplication<SpringBootMonitorApplication>(*args)
}
