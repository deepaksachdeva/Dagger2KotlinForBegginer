package com.e.dagger2cif

import android.util.Log
import javax.inject.Inject

class DieselEngine :Engine {

    private val TAG = DieselEngine::class.simpleName

    @Inject
    constructor(){

    }

    override fun start() {
        Log.d(TAG, "Diesel Engine Started...")
    }
}