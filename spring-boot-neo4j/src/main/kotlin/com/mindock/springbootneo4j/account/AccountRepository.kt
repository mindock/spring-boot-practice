package com.mindock.springbootneo4j.account

import org.springframework.data.neo4j.repository.Neo4jRepository

interface AccountRepository : Neo4jRepository<Account, Long>