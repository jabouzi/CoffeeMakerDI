package com.skanderjabouzi.coffeemaker

import CoffeeMaker
import DaggerCoffeeMakerComponent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var coffeeMaker: CoffeeMaker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val coffeeMakerComponent = DaggerCoffeeMakerComponent.create()
//        coffeeMakerComponent.inject2Activity(this)
////        coffeeMakerComponent.brew()
//        coffeeMaker.brew()
    }
}
