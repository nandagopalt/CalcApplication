package com.amalwin.calcapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CalcViewModelFactory constructor(private val calculations: Calculations) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CalcViewModel::class.java)) {
            return CalcViewModel(calculations) as T
        }
        throw IllegalArgumentException("View Model not matching from $modelClass")
    }

}