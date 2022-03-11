package com.mindock.springapplicationinit.application

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Order(1)
@Component
class FirstApplicationRunner(
    @Value("\${project.owner.name}") private val ownerName: String,
    @Value("\${project.owner.age}") private val ownerAge: Int,
    @Value("\${project.owner.fullName}") private val ownerFullName: String,
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println("FIRST 111111111111111111")
        println("project owner name is $ownerName")
        println("project owner age is $ownerAge")
        println("project owner full name is $ownerFullName")
    }
}