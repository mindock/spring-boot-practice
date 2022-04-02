package com.mindock.springmvc.sample

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/sample")
    fun sample() {
        throw SampleException()
    }

    @ExceptionHandler(SampleException::class)
    fun handleSampleException(e: SampleException): SampleError {
        return SampleError(
            message = "sample 에러",
            reason = "sample API 호출"
        )
    }
}