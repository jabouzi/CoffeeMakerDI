package com.skanderjabouzi.coffeemaker

import CoffeeMaker
import DaggerCoffeeMakerComponent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coffeeMakerComponent = DaggerCoffeeMakerComponent.create()
        coffeeMakerComponent.getCoffeMaker().brew()
    }
}
