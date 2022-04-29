package com.mindock.springbootsecuritycustomizing.account

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Account(

    @Id
    @GeneratedValue
    val id: Long = 0L,

    val username: String,

    val password: String,

)