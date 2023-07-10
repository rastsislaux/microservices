package me.leepsky.microservices.currencyexchangeservice

import org.springframework.core.env.Environment
import org.springframework.core.env.get
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CurrencyExchangeController(
    private val environment: Environment,
    private val currencyExchangeRepository: CurrencyExchangeRepository
) {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable from: String,
                              @PathVariable to: String): CurrencyExchange? {
        val exchange = currencyExchangeRepository.findByFromAndTo(from, to)
        exchange?.environment = "${environment["local.server.port"]}"
        return exchange
    }

}