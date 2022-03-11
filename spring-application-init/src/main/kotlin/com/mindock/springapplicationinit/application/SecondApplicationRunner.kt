package com.mindock.springapplicationinit.application

import com.mindock.springapplicationinit.config.ProjectOwnerProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Order(2)
@Component
class SecondApplicationRunner(
    private val projectOwnerProperties: ProjectOwnerProperties,
    private val hello: String,
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println("SECOND 222222222222222222")
        println("=========================")
        println("(properties) project owner's name is ${projectOwnerProperties.name}")
        println("(properties) project owner's age is ${projectOwnerProperties.age}")
        println("(properties) project owner's full name is ${projectOwnerProperties.fullName}")
        println("(properties) project owner's session timeout is ${projectOwnerProperties.sessionTimeout}")
        println("=========================")
        println("hello bean: $hello")
    }
}