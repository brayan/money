package br.com.sailboat.money.domain.usecase

import br.com.sailboat.money.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface GetTransactionsUseCase {
    suspend operator fun invoke(): Flow<Result<List<Transaction>>>
}
