package com.mindock.springbootneo4j

import com.mindock.springbootneo4j.account.Account
import com.mindock.springbootneo4j.account.AccountRepository
import com.mindock.springbootneo4j.account.Role
import org.neo4j.driver.internal.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Neo4jRunner(
    private val accountRepository: AccountRepository
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val account = Account(
            username = "mindock",
            email = "mindock@mail.com"
        )
        val role = Role(name = "admin")
        account.addRole(role)

        accountRepository.save(account)

        println("finished!")
    }
}