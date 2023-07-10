package me.leepsky.microservices.currencyexchangeservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CurrencyExchangeServiceApplication

fun main(args: Array<String>) {
	runApplication<CurrencyExchangeServiceApplication>(*args)
}
