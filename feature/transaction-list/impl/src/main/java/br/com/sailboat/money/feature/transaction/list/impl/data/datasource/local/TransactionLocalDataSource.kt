package br.com.sailboat.money.feature.transaction.list.impl.data.datasource.local

import br.com.sailboat.money.feature.transaction.list.impl.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionLocalDataSource {
    suspend fun getTransactions(): Flow<Result<List<Transaction>>>
}
