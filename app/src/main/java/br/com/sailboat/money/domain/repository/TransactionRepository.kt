package br.com.sailboat.money.domain.repository

import br.com.sailboat.money.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface TransactionRepository {
    suspend fun getTransactions(): Flow<Result<List<Transaction>>>
}
