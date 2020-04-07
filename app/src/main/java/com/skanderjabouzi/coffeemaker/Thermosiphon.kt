import javax.inject.Inject

class Thermosiphon @Inject constructor(val heater: Heater): Pump {

    override fun pump() {
        println("# # checking heater # # ${heater.isHot()}")
        if (heater.isHot()) {
            println("=> => pumping => =>")
        }
    }

}