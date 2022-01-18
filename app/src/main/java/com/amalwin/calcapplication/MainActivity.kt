package com.amalwin.calcapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.amalwin.calcapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var factory: CalcViewModelFactory
    private lateinit var viewModel: CalcViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        factory = CalcViewModelFactory(Calc())
        viewModel = ViewModelProvider(this, factory)[CalcViewModel::class.java]
        //setContentView(R.layout.activity_main)
        binding.myViewModel = viewModel
        binding.lifecycleOwner = this
    }
}