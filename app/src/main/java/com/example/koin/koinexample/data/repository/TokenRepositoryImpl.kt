package com.example.koin.koinexample.data.repository

import com.example.koin.koinexample.domain.repository.TokenRepository

class TokenRepositoryImpl : TokenRepository {

    override fun getToken(): String = "Token"
}