package com.chifi.android.pokedex.home.domain.models

import com.google.gson.annotations.SerializedName

data class Regions(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: List<PokedexRegions>
)

data class PokedexRegions(
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)
