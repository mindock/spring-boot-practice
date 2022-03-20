package com.mindock.springtest.sample

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) {

    private val logger = LoggerFactory.getLogger(SampleController::class.java)

    @GetMapping("/hello")
    fun hello(): String {
        logger.info("[sample controller] logger info")
        println("[sample controller] println")
        return "hello " + sampleService.getName()
    }
}