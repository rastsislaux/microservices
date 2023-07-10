package me.leepsky.microservices.currencyexchangeservice

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class CurrencyExchange(
    @Id
    val id: Long,

    @Column(name = "currency_from")
    var from: String,

    @Column(name = "currency_to")
    var to: String,

    var conversionMultiple: Long,
    var environment: String
)
