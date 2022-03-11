package com.mindock.springapplicationinit

import com.mindock.springapplicationinit.listener.StartingEventListener
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.properties.ConfigurationPropertiesScan

@SpringBootApplication
@ConfigurationPropertiesScan
class SpringApplicationInitApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(SpringApplicationInitApplication::class.java)
        .web(WebApplicationType.NONE)
        .listeners(StartingEventListener())
        .run(*args)

//    runApplication<SpringApplicationInitApplication>(*args)

    /*
    // SpringApplicationBuilder & 배너 등록
    SpringApplicationBuilder(SpringApplicationInitApplication::class.java)
        .banner(
            object : Banner {
                override fun printBanner(environment: Environment?, sourceClass: Class<*>?, out: PrintStream?) {
                    println("==========================================")
                    println("MINDUCK SPRING BOOT")
                    println("==========================================")
                }

            }
        )
        .run(*args)
     */
}
