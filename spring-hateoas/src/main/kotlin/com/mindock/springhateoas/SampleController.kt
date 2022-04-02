package com.mindock.springhateoas

import org.springframework.hateoas.EntityModel
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello")
    fun hello(): EntityModel<Introduce> {
        val introduce = Introduce(
            prefix = "Hello~!",
            name = "mindock"
        )

        // 링크 정보 추가하는 방법
        val introduceEntityModel = EntityModel.of(introduce)
        introduceEntityModel.add(linkTo(methodOn(SampleController::class.java).hello()).withSelfRel())

        return introduceEntityModel
    }
}