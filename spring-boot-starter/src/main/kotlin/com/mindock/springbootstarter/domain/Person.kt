package com.mindock.springbootstarter.domain

class Person {
    lateinit var name: String
    lateinit var age: Integer

    override fun toString(): String =
        "Person(name='$name', age=$age)"
}