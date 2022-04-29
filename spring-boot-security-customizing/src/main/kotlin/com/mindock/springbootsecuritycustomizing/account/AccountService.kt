package com.mindock.springbootsecuritycustomizing.account

import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AccountService(
    private val accountRepository: AccountRepository,
    private val passwordEncoder: PasswordEncoder,
) : UserDetailsService {

    fun createAccount(username: String, password: String): Account {
        val account = Account(username = username, password = passwordEncoder.encode(password))
        return accountRepository.save(account)
    }

    override fun loadUserByUsername(username: String?): UserDetails {
        val account = username?.let { accountRepository.findByUsername(it) } ?: throw UsernameNotFoundException(username)
        return User(account.username, account.password, authorities())
    }

    private fun authorities() = listOf(SimpleGrantedAuthority("ROLE_USER"))
}