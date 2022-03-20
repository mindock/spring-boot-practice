package com.mindock.springtest.sample

import io.mockk.every
import com.ninjasquad.springmockk.MockkBean
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.system.CapturedOutput
import org.springframework.boot.test.system.OutputCaptureExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@ExtendWith(OutputCaptureExtension::class)
@WebMvcTest(SampleController::class)
internal class SampleControllerTest3 {

    @MockkBean
    lateinit var sampleService: SampleService

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun hello(captureOutput: CapturedOutput) {
        every { sampleService.getName() } returns "test3"

        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string("hello test3"))
            .andDo(MockMvcResultHandlers.print())

        assertTrue(captureOutput.out.contains("[sample controller]"))
    }
}