package com.mindock.springbootstarter.domain

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("person")
data class PersonProperties(
    val name: String,
    val age: Int,
)