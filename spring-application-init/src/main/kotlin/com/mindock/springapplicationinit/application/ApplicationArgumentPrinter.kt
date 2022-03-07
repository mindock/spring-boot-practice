package com.mindock.springapplicationinit.application

import org.springframework.boot.ApplicationArguments
import org.springframework.stereotype.Component

@Component
class ApplicationArgumentPrinter(
    val arguments: ApplicationArguments
) {
    init {
        println("foo: ${arguments.containsOption("foo")}") // JVM Options
        println("bar: ${arguments.containsOption("bar")}") // Application Argument
    }
}