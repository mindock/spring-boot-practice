package com.mindock.springbootmongo.account

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "accounts")
class Account(

    @Id
    var id: String? = null,

    val username: String,

    val email: String,
)