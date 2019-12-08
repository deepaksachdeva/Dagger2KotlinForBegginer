package com.e.dagger2cif

import android.util.Log
import javax.inject.Inject

class Car {

    private val TAG = Car::class.simpleName

    var engine: Engine? = null
    var wheels: Wheels? = null

    @Inject
    constructor(engine: Engine, wheels: Wheels){
        this.engine = engine
        this.wheels = wheels
    }

    fun drive(){
        engine?.start()
        Log.d(TAG, "driving...")
    }
}