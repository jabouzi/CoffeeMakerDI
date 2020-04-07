import com.skanderjabouzi.coffeemaker.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ElectricHeaterModule::class])
interface CoffeeMakerComponent {
    fun getCoffeMaker(): CoffeeMaker
    fun inject(mainActivity: MainActivity)
}