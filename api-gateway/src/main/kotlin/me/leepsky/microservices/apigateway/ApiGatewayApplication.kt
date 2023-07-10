package me.leepsky.microservices.apigateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApiGatewayConfiguration {

    @Bean
    fun gatewayRouter(builder: RouteLocatorBuilder): RouteLocator =
        builder.routes()
            .route { it.path("/currency-exchange/**").uri("lb://currency-exchange-service") }
            .route { it.path("/currency-conversion/**").uri("lb://currency-conversion-service") }
            .build()

}

@SpringBootApplication
class ApiGatewayApplication

fun main(args: Array<String>) {
    runApplication<ApiGatewayApplication>(*args)
}
