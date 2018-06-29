package com.example.koin.koinexample.presentation.ui.main

import com.example.koin.koinexample.domain.repository.TokenRepository

class MainPresenter(private val tokenRepository: TokenRepository) {

    fun getToken() = tokenRepository.getToken()
}