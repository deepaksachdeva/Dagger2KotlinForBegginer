package com.e.dagger2cif

import android.util.Log
import javax.inject.Inject

class Car {

    private val TAG = Car::class.simpleName

    @Inject lateinit var engine: Engine
    var wheels: Wheels? = null

    @Inject
    constructor(wheels: Wheels){
        this.wheels = wheels
    }

    fun drive(){
        Log.d(TAG, "driving...")
    }

    @Inject
    fun enableButton(remote: Remote){
        remote.setListener()
    }
}