package com.mindock.springbootstarter.config

import com.mindock.springbootstarter.domain.Person
import com.mindock.springbootstarter.domain.PersonProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(PersonProperties::class)
class PersonConfiguration {

    @Bean
    @ConditionalOnMissingBean
    fun person(properties: PersonProperties): Person =
        Person(name = properties.name, age = properties.age)
}