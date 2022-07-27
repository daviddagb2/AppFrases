package com.dgb.appfrases.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dgb.appfrases.R
import com.dgb.appfrases.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





    }
}