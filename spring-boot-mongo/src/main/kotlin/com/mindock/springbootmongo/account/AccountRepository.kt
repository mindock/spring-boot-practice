package com.mindock.springbootmongo.account

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface AccountRepository : MongoRepository<Account, String> {
    fun findByEmail(email: String): Optional<Account>
}