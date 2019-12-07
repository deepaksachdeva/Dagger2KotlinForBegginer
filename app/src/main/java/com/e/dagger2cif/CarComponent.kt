package com.e.dagger2cif

import dagger.Component

@Component(modules = [WheelsModule::class])
interface CarComponent {

    fun getCar(): Car
}