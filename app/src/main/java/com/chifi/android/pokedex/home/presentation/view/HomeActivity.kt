package com.chifi.android.pokedex.home.presentation.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.chifi.android.pokedex.base.presentation.view.BaseActivity
import com.chifi.android.pokedex.databinding.ActivityHomeBinding
import com.chifi.android.pokedex.home.presentation.viewmodel.HomeViewModel

class HomeActivity : BaseActivity() {

    private lateinit var binding: ActivityHomeBinding
    val model: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        model.getRegions()

        model.retriveRegions().observe(this, Observer {
            var regiones = ""

            for (regions in it.results) {
                regiones = "$regiones \n $regions.name \n $regions.url"
            }

            binding.textView.text = regiones
        })
    }
}
