package com.chifi.android.pokedex.base.domain.service

import com.chifi.android.pokedex.base.domain.service.RepositoryFactory.getRetrofit

open class BaseRepository<T>(
    service: Class<T>,
) {
    var service: T = getRetrofit()
        .create(service)
}
