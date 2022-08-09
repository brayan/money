package br.com.sailboat.money.data.datasource.local

import br.com.sailboat.money.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionLocalDataSource {
    suspend fun getTransactions(): Flow<Result<List<Transaction>>>
}
