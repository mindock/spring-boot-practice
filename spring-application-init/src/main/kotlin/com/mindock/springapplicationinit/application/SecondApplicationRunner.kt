package com.mindock.springapplicationinit.application

import com.mindock.springapplicationinit.config.ProjectOwnerProperties
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component

@Order(2)
@Component
class SecondApplicationRunner(
    private val projectOwnerProperties: ProjectOwnerProperties,
    private val hello: String,
): ApplicationRunner {
    private val logger = LoggerFactory.getLogger(SecondApplicationRunner::class.java)

    override fun run(args: ApplicationArguments?) {
        logger.debug("SECOND 222222222222222222")
        logger.debug("=========================")
        logger.debug("(properties) project owner's name is ${projectOwnerProperties.name}")
        logger.debug("(properties) project owner's age is ${projectOwnerProperties.age}")
        logger.debug("(properties) project owner's full name is ${projectOwnerProperties.fullName}")
        logger.debug("(properties) project owner's session timeout is ${projectOwnerProperties.sessionTimeout}")
        logger.debug("=========================")
        logger.debug("hello bean: $hello")
    }
}