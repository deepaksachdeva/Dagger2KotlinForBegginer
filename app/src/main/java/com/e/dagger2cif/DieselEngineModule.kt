package com.e.dagger2cif

import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class DieselEngineModule {

    @Provides
    fun provideEngine(engine: DieselEngine): Engine{
        return engine
    }
}