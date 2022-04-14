package com.mindock.springbootjpa.account

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.jdbc.core.JdbcTemplate
import javax.sql.DataSource

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    lateinit var dataSource: DataSource

    @Autowired
    lateinit var jdbcTemplate: JdbcTemplate

    @Autowired
    lateinit var accountRepository: AccountRepository

    @Test
    fun di() {
        dataSource.connection.use { connection ->
            val metaData = connection.metaData
            println(metaData.url)
            println(metaData.driverName)
            println(metaData.userName)
        }
    }

    @Test
    fun `데이터 저장`() {
        val account = Account(
            userName = "mindock",
            password = "pass"
        )

        val savedAccount = accountRepository.save(account)

        assertNotNull(savedAccount)

        val existingAccount = accountRepository.findByUserName(savedAccount.userName)
        assertNotNull(existingAccount)

        val notExistingAccount = accountRepository.findByUserName("test")
        assertNull(notExistingAccount)
    }
}