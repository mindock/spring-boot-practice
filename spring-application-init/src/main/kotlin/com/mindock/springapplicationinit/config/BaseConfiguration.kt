package com.mindock.springapplicationinit.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Profile("prod")
@Configuration
class BaseConfiguration {

    @Bean
    fun hello(): String = "hello"
}