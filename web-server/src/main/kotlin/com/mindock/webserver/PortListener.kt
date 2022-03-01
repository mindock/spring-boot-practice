package com.mindock.webserver

import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class PortListener: ApplicationListener<ServletWebServerInitializedEvent> {
    override fun onApplicationEvent(event: ServletWebServerInitializedEvent) {
        val context = event.applicationContext
        val port = context.webServer.port
        println("[portListener]: port is $port")
    }
}