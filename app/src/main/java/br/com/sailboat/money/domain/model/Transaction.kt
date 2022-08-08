package br.com.sailboat.money.domain.model

import java.math.BigDecimal
import java.util.Calendar

data class Transaction(
    val id: Long,
    val description: String,
    val type: TransactionType,
    val amount: BigDecimal,
    val category: TransactionCategory,
    val date: Calendar,
)
