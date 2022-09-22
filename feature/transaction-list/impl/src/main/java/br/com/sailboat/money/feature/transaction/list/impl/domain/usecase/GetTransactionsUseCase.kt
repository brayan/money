package br.com.sailboat.money.feature.transaction.list.impl.domain.usecase

import br.com.sailboat.money.feature.transaction.list.impl.domain.model.Transaction
import kotlinx.coroutines.flow.Flow

interface GetTransactionsUseCase {
    suspend operator fun invoke(): Flow<Result<List<Transaction>>>
}
