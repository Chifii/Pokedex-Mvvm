package com.chifi.android.pokedex.splash.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.chifi.android.pokedex.databinding.ActivityHomeBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    
}
