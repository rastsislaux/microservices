package me.leepsky.microservices.limitsservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitController(
    private val configuration: Configuration
) {

    @GetMapping("/limits")
    fun retrieveLimits(): Limits = Limits(
        configuration.minimum,
        configuration.maximum
    )

}