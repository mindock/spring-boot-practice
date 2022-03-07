package com.mindock.springapplicationinit.application

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Order(1)
@Component
class FirstApplicationRunner: ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println("FIRST 111111111111111111")
    }
}