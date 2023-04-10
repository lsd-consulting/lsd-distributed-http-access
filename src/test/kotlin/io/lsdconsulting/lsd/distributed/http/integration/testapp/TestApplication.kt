package io.lsdconsulting.lsd.distributed.http.integration.testapp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TestApplication {
    fun main(args: Array<String>) {
        SpringApplication.run(TestApplication::class.java, *args)
    }
}
