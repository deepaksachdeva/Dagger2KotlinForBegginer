package com.e.dagger2cif

import android.util.Log
import javax.inject.Inject

class PetrolEngine : Engine {

    private val TAG = PetrolEngine::class.simpleName

    @Inject
    constructor(){

    }

    override fun start() {
        Log.d(TAG, "Petrol Engine Started...")
    }
}