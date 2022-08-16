package com.chifi.android.pokedex.base.domain.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RepositoryFactory {

    private const val BASE_URL = "https://pokeapi.co/api/v2/"

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
