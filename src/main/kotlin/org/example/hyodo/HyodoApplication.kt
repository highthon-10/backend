package org.example.hyodo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class HyodoApplication

fun main(args: Array<String>) {
    runApplication<HyodoApplication>(*args)
}
