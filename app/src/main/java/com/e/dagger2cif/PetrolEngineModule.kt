package com.e.dagger2cif

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PetrolEngineModule {
//class PetrolEngineModule {
    @Binds
    abstract fun provideEngine(engine: PetrolEngine): Engine


//    @Provides
//    fun provideEngine(engine: PetrolEngine): Engine{
//        return engine
//    }
}