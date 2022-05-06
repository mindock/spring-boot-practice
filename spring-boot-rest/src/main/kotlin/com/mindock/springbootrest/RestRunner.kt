package com.mindock.springbootrest

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.stereotype.Component
import org.springframework.util.StopWatch
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.client.WebClient

@Component
class RestRunner(
    private val restTemplateBuilder: RestTemplateBuilder,
    private val webClientBuilder: WebClient.Builder,
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
//        runByRestTemplate()
        runByWebClient()
    }

    private fun runByRestTemplate() {
        val restTemplate = restTemplateBuilder.build()

        val stopWatch = StopWatch()
        stopWatch.start()

        val helloResult = restTemplate.getForObject("http://localhost:8080/hello", String::class.java)
        println(helloResult)

        val worldResult = restTemplate.getForObject("http://localhost:8080/world", String::class.java)
        println(worldResult)

        stopWatch.stop()
        println(stopWatch.prettyPrint())
    }

    private fun runByWebClient() {
        val webClient = webClientBuilder
//            .baseUrl("http://localhost:8080") // 로컬 커스터마이징
            .build()

        val stopWatch = StopWatch()
        stopWatch.start()

        val helloMono = webClient.get().uri("/hello")
            .retrieve()
            .bodyToMono(String::class.java)
        helloMono.subscribe {
            println(it)

            if(stopWatch.isRunning) {
                stopWatch.stop()
            }
            println(stopWatch.prettyPrint())
            stopWatch.start()
        }

        val worldMono = webClient.get().uri("/world")
            .retrieve()
            .bodyToMono(String::class.java)
        worldMono.subscribe {
            println(it)

            if(stopWatch.isRunning) {
                stopWatch.stop()
            }
            println(stopWatch.prettyPrint())
            stopWatch.start()
        }
    }
}