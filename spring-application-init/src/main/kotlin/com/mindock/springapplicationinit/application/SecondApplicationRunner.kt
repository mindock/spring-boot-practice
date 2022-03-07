package com.mindock.springapplicationinit.application

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Order(2)
@Component
class SecondApplicationRunner: ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println("SECOND 222222222222222222")
    }
}