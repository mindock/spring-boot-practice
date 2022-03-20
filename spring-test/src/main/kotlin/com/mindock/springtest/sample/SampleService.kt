package com.mindock.springtest.sample

import org.springframework.stereotype.Service

@Service
class SampleService {

    fun getName(): String {
        return "sample-service"
    }
}