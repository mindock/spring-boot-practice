package com.mindock.springtest.sample

import com.ninjasquad.springmockk.MockkBean
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension
import io.mockk.every
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class SampleControllerTest2 {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Autowired
    lateinit var webTestClient: WebTestClient

    @MockkBean
    lateinit var sampleService: SampleService

    @Test
    fun hello_testRestTemplate() {
        every { sampleService.getName() } returns "test2_testRestTemplate"

        val result = testRestTemplate.getForObject("/hello", String::class.java)
        assertEquals("hello test2_testRestTemplate", result)
    }

    @Test
    fun hello_webTestClient() {
        every { sampleService.getName() } returns "test2_webTestClient"

        webTestClient.get().uri("/hello")
            .exchange()
            .expectStatus().isOk
            .expectBody(String::class.java).isEqualTo("hello test2_webTestClient")
    }
}