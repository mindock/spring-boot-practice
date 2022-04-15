package com.mindock.springbootredis.account

import org.springframework.data.annotation.Id
import org.springframework.data.redis.core.RedisHash

@RedisHash("accounts")
class Account(

    @Id
    var id: String? = null,

    val username: String,

    val email: String
)