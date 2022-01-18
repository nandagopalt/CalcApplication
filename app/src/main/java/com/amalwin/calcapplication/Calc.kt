package com.amalwin.calcapplication

class Calc : Calculations {
    private val PI = 3.14
    override fun calculateArea(radius: Double): Double {
        return PI * radius * radius
    }

    override fun calculateCircumference(radius: Double): Double {
        return 2 * PI * radius
    }
}