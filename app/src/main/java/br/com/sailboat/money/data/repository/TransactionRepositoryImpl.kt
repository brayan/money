package br.com.sailboat.money.data.repository

import br.com.sailboat.money.data.datasource.local.TransactionLocalDataSource
import br.com.sailboat.money.domain.model.Transaction
import br.com.sailboat.money.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class TransactionRepositoryImpl(
    private val transactionLocalDataSource: TransactionLocalDataSource,
) : TransactionRepository {

    override suspend fun getTransactions(): Flow<Result<List<Transaction>>> {
        return transactionLocalDataSource.getTransactions()
    }
}
