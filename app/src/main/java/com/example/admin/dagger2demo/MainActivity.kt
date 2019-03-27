package com.example.admin.dagger2demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carComponent = DaggerCarComponent.create()
        val car = carComponent.car
        car.driver()
    }


}
