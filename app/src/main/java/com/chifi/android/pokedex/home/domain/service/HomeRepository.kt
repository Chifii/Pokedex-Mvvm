package com.chifi.android.pokedex.home.domain.service

import com.chifi.android.pokedex.base.domain.domain.Result
import com.chifi.android.pokedex.base.domain.service.BaseRepository
import com.chifi.android.pokedex.home.domain.models.Regions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class HomeRepository : BaseRepository<HomeService>(HomeService::class.java) {
    suspend fun getRegions(): Result<Regions> {
        return withContext(Dispatchers.IO) {
            try {
                val data = service.getRegions()
                Result.Success(data)
            } catch (exception: HttpException) {
                Result.Error(exception)
            }
        }
    }
}
