package com.mindock.springbootmongo.account

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest
import org.springframework.test.context.TestPropertySource

@DataMongoTest
@TestPropertySource(properties = ["spring.mongodb.embedded.version=3.5.5"])
internal class AccountRepositoryTest {

    @Autowired
    lateinit var accountRepository: AccountRepository

    @Test
    fun findByEmail() {
        val account = Account(
            username = "anna",
            email = "test@email.com"
        )
        accountRepository.save(account)

        val byId = accountRepository.findById(account.id!!)
        assertThat(byId).isNotEmpty

        val byEmail = accountRepository.findByEmail(account.email)
        assertThat(byEmail).isNotEmpty
    }
}