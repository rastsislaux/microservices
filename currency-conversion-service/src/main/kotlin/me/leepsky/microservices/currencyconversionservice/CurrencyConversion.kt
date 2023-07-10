package me.leepsky.microservices.currencyconversionservice

data class CurrencyConversion(
    val id: Long,
    val from: String,
    val to: String,
    var quantity: Long,
    val conversionMultiple: Long,
    var totalCalculatedAmount: Long,
    var environment: String? = null
)
