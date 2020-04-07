package com.skanderjabouzi.coffeemaker

import CoffeeMaker
//import DaggerCoffeeMakerComponent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

//    @Inject
//    lateinit var coffeeMaker: CoffeeMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coffeeMakerComponent = DaggerCoffeeMakerComponent.create()
//        coffeeMakerComponent.inject(this)
        coffeeMakerComponent.getCoffeMaker().brew()
//        coffeeMaker.brew()

        val carComponent = DaggerCarComponent.create()
        carComponent.inject2Activity(this)
        car.drive()
    }
}
