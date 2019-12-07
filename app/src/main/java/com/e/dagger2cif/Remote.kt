package com.e.dagger2cif

import android.util.Log
import javax.inject.Inject

class Remote {

    private val TAG = Remote::class.simpleName

    @Inject
    constructor(){

    }

    fun setListener(){
        Log.d(TAG, "Remote Connected")
    }
}