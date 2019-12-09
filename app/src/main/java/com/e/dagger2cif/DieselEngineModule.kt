package com.e.dagger2cif

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DieselEngineModule {

    var horsePower: Int? = null

    constructor(horsePower: Int){
        this.horsePower = horsePower
    }

    @Provides
    fun provideEngine(): Engine{
        return DieselEngine(horsePower!!)
    }
}