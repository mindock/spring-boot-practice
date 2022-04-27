package com.mindock.springbootmongo

import com.mindock.springbootmongo.account.Account
import com.mindock.springbootmongo.account.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.mongodb.core.MongoTemplate

@SpringBootApplication
class SpringBootMongoApplication {

//    @Autowired
//    private lateinit var mongoTemplate: MongoTemplate

    @Autowired
    private lateinit var accountRepository: AccountRepository


    @Bean
    fun applicationRunner(): ApplicationRunner {
        return ApplicationRunner {
            val account = Account(
                email = "test1@test.com",
                username = "mindock1"
            )
//            mongoTemplate.insert(account)
            accountRepository.insert(account)

            println("finished!")
        }
    }
}

fun main(args: Array<String>) {
    runApplication<SpringBootMongoApplication>(*args)
}
