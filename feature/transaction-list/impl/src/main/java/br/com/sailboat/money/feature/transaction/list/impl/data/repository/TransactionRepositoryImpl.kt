package br.com.sailboat.money.feature.transaction.list.impl.data.repository

import br.com.sailboat.money.feature.transaction.list.impl.data.datasource.local.TransactionLocalDataSource
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.Transaction
import br.com.sailboat.money.feature.transaction.list.impl.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class TransactionRepositoryImpl(
    private val transactionLocalDataSource: TransactionLocalDataSource,
) : TransactionRepository {

    override suspend fun getTransactions(): Flow<Result<List<Transaction>>> {
        return transactionLocalDataSource.getTransactions()
    }
}
