package com.mindock.springbootsecurity.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.security.test.context.support.WithMockUser
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.view

@WebMvcTest(HomeController::class)
internal class HomeControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    @WithMockUser
    fun hello() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.TEXT_HTML))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk)
            .andExpect(view().name("hello"))
    }

    @Test
    fun hello_without_user() {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.TEXT_HTML))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().is3xxRedirection)
    }

    @Test
    @WithMockUser
    fun my() {
        mockMvc.perform(MockMvcRequestBuilders.get("/my"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isOk)
            .andExpect(view().name("my"))
    }

    @Test
    fun my_without_user() {
        mockMvc.perform(MockMvcRequestBuilders.get("/my"))
            .andDo(MockMvcResultHandlers.print())
            .andExpect(status().isUnauthorized)
    }
}