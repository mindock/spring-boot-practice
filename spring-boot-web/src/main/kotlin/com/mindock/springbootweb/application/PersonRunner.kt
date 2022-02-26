package com.mindock.springbootweb.application

import com.mindock.springbootstarter.domain.Person
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class PersonRunner(
    private val person: Person
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println(person)
    }
}