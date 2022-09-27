package br.com.sailboat.money.feature.transaction.list.impl.presentation.component

import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionCategory
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionType

data class TransactionListItemUiModel(
    val id: Long,
    val description: String,
    val type: TransactionType,
    val amount: String,
    val category: TransactionCategory,
    val date: String,
)
