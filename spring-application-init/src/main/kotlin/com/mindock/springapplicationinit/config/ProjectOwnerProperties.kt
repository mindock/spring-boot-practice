package com.mindock.springapplicationinit.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.convert.DurationUnit
import org.springframework.validation.annotation.Validated
import java.time.Duration
import java.time.temporal.ChronoUnit
import javax.validation.constraints.NotEmpty

@ConstructorBinding
@ConfigurationProperties("project.owner")
@Validated
data class ProjectOwnerProperties(
    @field:NotEmpty
    val name: String,
    val age: Int,
    val fullName: String,
//    @DurationUnit(ChronoUnit.SECONDS)
    val sessionTimeout: Duration = Duration.ofSeconds(30)
)