package com.mindock.springbootjdbc

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component
import javax.sql.DataSource

@Component
class H2Runner(
    private val dataSource: DataSource,
    private val jdbcTemplate: JdbcTemplate,
) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        dataSource.connection.use { connection ->
            println("url: ${connection.metaData.url}")
            println("userName: ${connection.metaData.userName}")

            val statement = connection.createStatement()
            val sql = "CREATE TABLE USER(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (ID))"
            statement.executeUpdate(sql)
        }

        jdbcTemplate.execute("INSERT INTO USER VALUES (1, 'mindock')")
    }
}