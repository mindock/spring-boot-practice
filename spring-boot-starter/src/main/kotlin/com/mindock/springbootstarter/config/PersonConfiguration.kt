package com.mindock.springbootstarter.config

import com.mindock.springbootstarter.domain.Person
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PersonConfiguration {

    @Bean
    @ConditionalOnMissingBean
    @ConfigurationProperties("person")
    fun person(): Person = Person()
}