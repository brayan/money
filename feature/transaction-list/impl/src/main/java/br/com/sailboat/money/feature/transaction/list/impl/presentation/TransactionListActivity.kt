package br.com.sailboat.money.feature.transaction.list.impl.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionCategory
import br.com.sailboat.money.feature.transaction.list.impl.domain.model.TransactionType
import br.com.sailboat.money.feature.transaction.list.impl.presentation.component.TransactionListItemComposable
import br.com.sailboat.money.feature.transaction.list.impl.presentation.component.TransactionListItemUiModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TransactionListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
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
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
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
