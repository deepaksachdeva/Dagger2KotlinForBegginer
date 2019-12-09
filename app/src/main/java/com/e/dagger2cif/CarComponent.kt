package com.e.dagger2cif

import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class/*, PetrolEngineModule::class*/])
interface CarComponent {

    fun getCar(): Car
}