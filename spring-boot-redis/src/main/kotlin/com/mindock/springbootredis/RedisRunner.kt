package com.mindock.springbootredis

import com.mindock.springbootredis.account.Account
import com.mindock.springbootredis.account.AccountRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Component
import java.util.*

@Component
class RedisRunner(
    private val redisTemplate: StringRedisTemplate,
    private val accountRepository: AccountRepository,
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        val values = redisTemplate.opsForValue()
        values.set("mindock", "anna")
        values.set("springboot", "2.0")
        values.set("hi", "hello")

        val account = Account(
            username = "mindock",
            email = "mindock@email.com"
        )
        accountRepository.save(account)

        val foundAccount = accountRepository.findById(account.id!!)
        println("username: ${foundAccount.get().username}")
        println("email: ${foundAccount.get().email}")
    }
}