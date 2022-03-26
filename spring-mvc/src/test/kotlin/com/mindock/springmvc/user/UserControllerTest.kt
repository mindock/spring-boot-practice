package com.mindock.springmvc.user

import org.hamcrest.Matchers
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@WebMvcTest(UserController::class)
internal class UserControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun hello() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
            .andExpect(status().isOk)
            .andExpect(content().string("hello"))
    }

    @Test
    fun createUser_JSON() {
        val userJson = "{\"username\":\"mindock\", \"password\":\"123\"}"

        mockMvc.perform(
            MockMvcRequestBuilders.post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_XML)
                .content(userJson)
        )
            .andExpect(status().isOk)
            .andExpect(xpath("/User/username").string("mindock"))
            .andExpect(xpath("/User/password").string("123"))
//            .andExpect(jsonPath("$.username", Matchers.`is`(equalTo("mindock"))))
//            .andExpect(jsonPath("$.password", Matchers.`is`(equalTo("123"))))
    }
}