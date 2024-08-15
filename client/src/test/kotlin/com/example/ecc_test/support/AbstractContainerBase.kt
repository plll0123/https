package com.example.ecc_test.support

import org.junit.jupiter.api.BeforeAll
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.utility.DockerImageName

abstract class AbstractContainerBase {

    companion object {
        private var PostgresqlContainer: PostgreSQLContainer<*>? = PostgreSQLContainer(
            DockerImageName.parse("postgres:alpine3.19")
        )

        @JvmStatic
        @BeforeAll
        fun init(): Unit {
            PostgresqlContainer!!.start()
        }
    }
}