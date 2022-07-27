package com.dgb.appfrases.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dgb.appfrases.R
import com.dgb.appfrases.databinding.ActivityMainBinding
import com.dgb.appfrases.databinding.ActivityQuoteDetailBinding

class QuoteDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuoteDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuoteDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}