package com.mindock.springhateoas

data class Introduce(
    val prefix: String,
    val name: String,
) {

    override fun toString(): String {
        return "$prefix $name"
    }
}