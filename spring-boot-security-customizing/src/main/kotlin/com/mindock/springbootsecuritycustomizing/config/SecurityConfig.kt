package com.mindock.springbootsecuritycustomizing.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
class SecurityConfig : WebSecurityConfigurerAdapter() {

    override fun configure(http: HttpSecurity?) {
        http?.let {
            it.authorizeRequests()
                .antMatchers("/", "/hello").permitAll() // 루트와 hello는 모두 볼 수 있음
                .anyRequest().authenticated() // 그 외는 인증 필요
                .and()
                .formLogin()
                .and()
                .httpBasic()
        }
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder()
}