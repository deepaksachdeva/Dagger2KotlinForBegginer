package com.e.dagger2cif

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels{
        return Wheels(rims, tires)
    }

    @Provides
    fun getRims(): Rims{
        return Rims()
    }

    @Provides
    fun getTires(): Tires{
        val tires = Tires()
        tires.inflate()
        return tires
    }
}