import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ElectricHeater @Inject constructor() : Heater {
    var is_hot = false

    override fun on() {
        println("~ ~ ~ heating ~ ~ ~")
        is_hot = true
    }

    override fun off() {
        is_hot = false
    }

    override fun isHot() = is_hot
}