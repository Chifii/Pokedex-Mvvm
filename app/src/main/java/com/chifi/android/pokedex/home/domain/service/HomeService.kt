package com.chifi.android.pokedex.home.domain.service

import com.chifi.android.pokedex.home.domain.models.Regions
import retrofit2.http.GET

interface HomeService {
    @GET("pokedex")
    suspend fun getRegions(): Regions
}