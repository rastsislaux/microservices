package me.leepsky.microservices.limitsservice

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("limits-service")
class Configuration(
    val minimum: Int,
    val maximum: Int
)