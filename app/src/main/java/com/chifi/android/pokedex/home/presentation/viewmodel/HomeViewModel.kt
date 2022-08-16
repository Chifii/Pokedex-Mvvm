package com.chifi.android.pokedex.home.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chifi.android.pokedex.base.domain.domain.Result
import com.chifi.android.pokedex.home.domain.models.Regions
import com.chifi.android.pokedex.home.domain.service.HomeRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private var repository: HomeRepository = HomeRepository()

    private val scopeRecovery by lazy { CoroutineScope(Job() + Dispatchers.Main) }
    private lateinit var region: Regions

    private val regionsMDL: MutableLiveData<Regions> = MutableLiveData()

    private val regions: MutableLiveData<Regions> by lazy {
        MutableLiveData<Regions>().also {
            getRegions()
        }
    }

    fun getRegions() {
        scopeRecovery.launch {
            when (val response = repository.getRegions()) {
                is Result.Success -> {
                    regionsMDL.value = response.data
                }
                is Result.Error -> {
                    TODO()
                }
            }
        }
    }

    fun retriveRegions(): LiveData<Regions> = regionsMDL
}
