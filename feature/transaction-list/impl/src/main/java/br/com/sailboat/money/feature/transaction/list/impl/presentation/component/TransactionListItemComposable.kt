package br.com.sailboat.money.feature.transaction.list.impl.presentation.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionCategory
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionType

@Composable
fun TransactionListItemComposable(transaction: TransactionListItemUiModel) {
    Text(text = transaction.description)
}

@Preview
@Composable
fun PreviewTransactionListItemComposable() {
    val transaction = TransactionListItemUiModel(
        id = 42L,
        description = "Salary",
        type = TransactionType.INCOME,
        amount = "R$ 5000,00",
        category = TransactionCategory(
            id = 12L,
            description = "Category",
        ),
        date = "23 Sep",
    )
    TransactionListItemComposable(transaction)
}
