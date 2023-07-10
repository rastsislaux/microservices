package me.leepsky.microservices.currencyexchangeservice

import org.springframework.data.jpa.repository.JpaRepository

interface CurrencyExchangeRepository: JpaRepository<CurrencyExchange, Long> {

    fun findByFromAndTo(from: String, to: String): CurrencyExchange?

}