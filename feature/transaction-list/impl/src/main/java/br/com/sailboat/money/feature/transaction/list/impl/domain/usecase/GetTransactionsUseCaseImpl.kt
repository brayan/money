package br.com.sailboat.money.feature.transaction.list.impl.domain.usecase

import br.com.sailboat.money.feature.transaction.list.impl.domain.model.Transaction
import br.com.sailboat.money.feature.transaction.list.impl.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class GetTransactionsUseCaseImpl(
    private val transactionRepository: TransactionRepository,
) : GetTransactionsUseCase {

    override suspend fun invoke(): Flow<Result<List<Transaction>>> {
        return transactionRepository.getTransactions()
    }
}
