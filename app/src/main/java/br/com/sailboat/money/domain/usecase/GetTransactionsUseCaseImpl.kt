package br.com.sailboat.money.domain.usecase

import br.com.sailboat.money.domain.model.Transaction
import br.com.sailboat.money.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class GetTransactionsUseCaseImpl(
    private val transactionRepository: TransactionRepository,
) : GetTransactionsUseCase {

    override suspend fun invoke(): Flow<Result<List<Transaction>>> {
        return transactionRepository.getTransactions()
    }
}
