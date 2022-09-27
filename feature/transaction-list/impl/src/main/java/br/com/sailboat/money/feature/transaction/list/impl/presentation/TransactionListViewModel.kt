package br.com.sailboat.money.feature.transaction.list.impl.presentation

import androidx.lifecycle.ViewModel
import br.com.sailboat.money.feature.transaction.list.impl.domain.repository.TransactionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TransactionListViewModel @Inject constructor(
    private val transactionRepository: TransactionRepository
) : ViewModel() {

}
