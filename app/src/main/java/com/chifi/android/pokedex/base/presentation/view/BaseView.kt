package com.chifi.android.pokedex.base.presentation.view

interface BaseView {

    fun onCreate()
    fun onPause()
    fun onResume()
    fun onDestroy()

    fun showErrorMsg(msg: String)

    fun onShimmerStart()
    fun onShimmerEnd()

    fun onBack()
    fun onBackPressed()

    fun showShimmer()
}
