package com.mindock.webserver

//import org.apache.catalina.connector.Connector
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean

@SpringBootApplication
class WebServerApplication {
    /*
    @Bean
    fun serverFactory(): ServletWebServerFactory {
        val factory = TomcatServletWebServerFactory()
        factory.addAdditionalTomcatConnectors(createStandardConnector())
        return factory
    }

    private fun createStandardConnector(): Connector? {
        // HTTP 커넥터 설정
        val connector = Connector("org.apache.coyote.http11.Http11NioProtocol")
        connector.port = 8080
        return connector
    }
     */
}

fun main(args: Array<String>) {
    runApplication<WebServerApplication>(*args)
}
