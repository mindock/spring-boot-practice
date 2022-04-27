package com.mindock.springbootneo4j.account

import org.springframework.data.annotation.Id
import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Node

@Node
class Role(

    @Id
    @GeneratedValue
    var id: Long? = null,

    val name: String,
)