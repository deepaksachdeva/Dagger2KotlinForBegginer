package com.e.dagger2cif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carComponent = DaggerCarComponent.builder()
            .dieselEngineModule(DieselEngineModule(100))
            .build()

        car = carComponent.getCar()
        car.drive()
    }
}
