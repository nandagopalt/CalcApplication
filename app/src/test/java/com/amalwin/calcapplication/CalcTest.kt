package com.amalwin.calcapplication

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class CalcTest {
    private lateinit var calc: Calc

    @Before
    fun init() {
        calc = Calc()
    }

    @Test
    fun calculateCircumference_radiusGiven_correctResult() {
        val result = calc.calculateCircumference(2.1)
        assertThat(result).isEqualTo(13.188)
    }

    @Test
    fun calculateArea_radiusGiven_correctResult() {
        val result = calc.calculateArea(2.1)
        assertThat(result).isEqualTo(13.8474)
    }

    @Test
    fun calculateCircumference_zeroRadius_zeroResult() {
        val result = calc.calculateCircumference(0.0)
        assertThat(result).isEqualTo(0.0)
    }

    @Test
    fun calculateArea_zeroRadius_zeroResult() {
        val result = calc.calculateArea(0.0)
        assertThat(result).isEqualTo(0.0)
    }


}