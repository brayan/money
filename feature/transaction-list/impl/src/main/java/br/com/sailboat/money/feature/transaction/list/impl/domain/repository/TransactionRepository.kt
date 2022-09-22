package br.com.sailboat.money.feature.transaction.list.impl.domain.repository

import br.com.sailboat.money.feature.transaction.list.impl.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    suspend fun getTransactions(): Flow<Result<List<Transaction>>>
}
