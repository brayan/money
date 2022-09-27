package br.com.sailboat.money.feature.transaction.list.impl.di

import br.com.sailboat.money.feature.navigation.TransactionListNavigator
import br.com.sailboat.money.feature.transaction.list.impl.data.datasource.local.TransactionLocalDataSource
import br.com.sailboat.money.feature.transaction.list.impl.data.datasource.local.TransactionLocalDataSourceImpl
import br.com.sailboat.money.feature.transaction.list.impl.data.repository.TransactionRepositoryImpl
import br.com.sailboat.money.feature.transaction.list.impl.domain.repository.TransactionRepository
import br.com.sailboat.money.feature.transaction.list.impl.presentation.navigator.TransactionListNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface TransactionListModule {

    @Binds
    @Singleton
    fun bindTransactionRepository(transactionRepository: TransactionRepositoryImpl): TransactionRepository

    @Binds
    @Singleton
    fun bindTransactionLocalDataSource(transactionLocalDataSource: TransactionLocalDataSourceImpl): TransactionLocalDataSource

    @Binds
    @Singleton
    fun bindTransactionListNavigator(transactionListNavigator: TransactionListNavigatorImpl): TransactionListNavigator
}
