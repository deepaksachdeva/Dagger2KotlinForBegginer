package com.e.dagger2cif

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car
}