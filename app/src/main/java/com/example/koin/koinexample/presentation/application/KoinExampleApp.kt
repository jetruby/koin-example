package com.example.koin.koinexample.presentation.application

import android.app.Application
import com.example.koin.koinexample.data.repository.TokenRepositoryImpl
import com.example.koin.koinexample.domain.repository.TokenRepository
import com.example.koin.koinexample.presentation.ui.main.MainPresenter
import org.koin.android.ext.android.startKoin
import org.koin.dsl.module.Module

class KoinExampleApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val module: Module = org.koin.dsl.module.applicationContext {
            factory { MainPresenter(get()) }
            bean { TokenRepositoryImpl() as TokenRepository }
        }

        startKoin(this, listOf(module))
    }
}