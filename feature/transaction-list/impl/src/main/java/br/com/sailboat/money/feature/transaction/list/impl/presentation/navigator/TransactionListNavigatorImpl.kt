package br.com.sailboat.money.feature.transaction.list.impl.presentation.navigator

import android.content.Context
import android.content.Intent
import br.com.sailboat.money.feature.navigation.TransactionListNavigator
import br.com.sailboat.money.feature.transaction.list.impl.presentation.TransactionListActivity
import javax.inject.Inject

class TransactionListNavigatorImpl @Inject constructor() : TransactionListNavigator {

    override fun navigate(context: Context) {
        val intent = Intent(context, TransactionListActivity::class.java)
        context.startActivity(intent)
    }
}
