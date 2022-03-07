package com.mindock.springapplicationinit.listener

import org.springframework.boot.context.event.ApplicationStartingEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

//@Component
class StartingEventListener : ApplicationListener<ApplicationStartingEvent> {

    override fun onApplicationEvent(event: ApplicationStartingEvent) {
        println("!!Application is starting!!")
    }
}