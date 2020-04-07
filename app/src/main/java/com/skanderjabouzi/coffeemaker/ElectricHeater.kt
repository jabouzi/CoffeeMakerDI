import javax.inject.Inject
import javax.inject.Singleton

class ElectricHeater constructor() : Heater {
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