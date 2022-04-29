package com.mindock.springbootsecuritycustomizing

import com.mindock.springbootsecuritycustomizing.account.AccountService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class AccountRunner(
    private val accountService: AccountService
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val account = accountService.createAccount("mindock", "1234")
        println("${account.username} password: ${account.password}")
    }
}