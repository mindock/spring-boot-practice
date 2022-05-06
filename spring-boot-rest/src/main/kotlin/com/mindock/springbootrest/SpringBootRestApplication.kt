package com.mindock.springbootrest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.function.client.WebClient

@SpringBootApplication
class SpringBootRestApplication {

    @Bean
    fun webClientCustomizer(): WebClientCustomizer = // 전역 커스터마이징
        WebClientCustomizer {  webClientBuilder -> webClientBuilder.baseUrl("http://localhost:8080") }
}

fun main(args: Array<String>) {
    runApplication<SpringBootRestApplication>(*args)
}
