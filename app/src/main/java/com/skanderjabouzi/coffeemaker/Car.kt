package com.skanderjabouzi.coffeemaker

import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels) {
    fun drive() {
        println("Driving with $engine and $wheels")
    }
}