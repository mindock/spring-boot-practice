package com.mindock.springbootredis.account

import org.springframework.data.repository.CrudRepository

interface AccountRepository: CrudRepository<Account, String>