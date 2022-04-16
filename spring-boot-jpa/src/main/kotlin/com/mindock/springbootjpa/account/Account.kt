package com.mindock.springbootjpa.account

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Account(

    @Id
    @GeneratedValue
    val id: Long = 0L,

    val userName: String,

    val password: String,

    val active: Boolean,
)