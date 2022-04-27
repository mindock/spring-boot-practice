package com.mindock.springbootneo4j.account

import org.springframework.data.annotation.Id
import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Node
import org.springframework.data.neo4j.core.schema.Relationship

@Node
class Account(

    @Id
    @GeneratedValue
    var id: Long? = null,

    val username: String,

    val email: String,

    @Relationship(type = "has")
    val roles: MutableSet<Role> = HashSet()
) {

    fun addRole(role: Role) {
        this.roles.add(role)
    }
}