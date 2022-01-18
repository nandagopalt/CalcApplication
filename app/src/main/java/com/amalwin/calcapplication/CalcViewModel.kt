package com.amalwin.calcapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel constructor(private val calculations: Calculations) : ViewModel() {
    init {

    }

    private val area = MutableLiveData<String?>()
    val areaValue: LiveData<String?>
        get() = area

    private val circumference = MutableLiveData<String?>()
    val circumferenceValue: LiveData<String?>
        get() = circumference

    var radius = MutableLiveData<String>()

    fun calculate() {
        try {
            val radiusValue = radius.value?.toDouble()
            if (radiusValue != null) {
                calculateArea(radiusValue)
                calculateCircumference(radiusValue)
            } else {
                area.value = null
                circumference.value = null
            }
        } catch (exception: Exception) {
            Log.i("Mytag", exception.message.toString())
            area.value = null
            circumference.value = null
        }
    }

    fun calculateArea(radius: Double) {
        area.value = calculations.calculateArea(radius).toString()
    }

    fun calculateCircumference(radius: Double) {
        circumference.value = calculations.calculateCircumference(radius).toString()
    }
}