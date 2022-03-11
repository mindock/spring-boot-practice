package com.mindock.springapplicationinit

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.core.env.Environment
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
//@TestPropertySource(properties = ["project.owner.name=mindock_2"]) // 우선순위 2
@TestPropertySource(locations = ["classpath:/test-application.properties"])
@SpringBootTest()
//@SpringBootTest(properties = ["project.owner.name=mindock_3"]) // 우선순위 3
internal class SpringApplicationInitApplicationKtTest {

    @Autowired
    private lateinit var environment: Environment

    @Test
    public fun contextLoad() {
        assertEquals("mindock_test", environment.getProperty("project.owner.name"))
    }
}