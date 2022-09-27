package br.com.sailboat.money.feature.transaction.list.impl.data.datasource.local

import br.com.sailboat.money.feature.transaction.list.impl.domain.model.Transaction
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionCategory
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionType
import java.math.BigDecimal
import java.util.Calendar
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TransactionLocalDataSourceImpl @Inject constructor() : TransactionLocalDataSource {

    override suspend fun getTransactions(): Flow<Result<List<Transaction>>> {
        val transaction = Transaction(
            id = 42L,
            description = "",
            type = TransactionType.EXPENSE,
            amount = BigDecimal("200.0"),
            category = TransactionCategory(id = 45L, description = "Category"),
            date = Calendar.getInstance(),
        )
        return flow {
            emit(Result.success(listOf(transaction)))
        }
    }
}
