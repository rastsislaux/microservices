package me.leepsky.microservices.currencyconversionservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CurrencyConversionController(
    private val currencyExchangeProxy: CurrencyExchangeProxy
) {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    fun calculateCurrencyConversion(
        @PathVariable from: String,
        @PathVariable to: String,
        @PathVariable quantity: Long
    ): CurrencyConversion {
        val exchange = currencyExchangeProxy.retrieveExchangeValue(from, to)
        exchange.quantity = quantity
        exchange.totalCalculatedAmount = exchange.conversionMultiple * quantity
        return exchange
    }

}