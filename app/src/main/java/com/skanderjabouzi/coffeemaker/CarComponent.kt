package com.skanderjabouzi.coffeemaker

import dagger.Component

@Component
interface CarComponent {
    fun getCar(): Car
    fun inject2Activity(mainActivity: MainActivity)
}