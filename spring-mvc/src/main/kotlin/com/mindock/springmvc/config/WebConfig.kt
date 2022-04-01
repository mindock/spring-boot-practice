package com.mindock.springmvc.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry.addResourceHandler("/m/**")           // /m/ 으로 시작하는 요청이 오면,
            .addResourceLocations("classpath:/mm/")      // mm 디렉토리 밑의 리소스를 제공함 (여기서, location은 /로 끝나야함)
            .setCachePeriod(60)
    }
}