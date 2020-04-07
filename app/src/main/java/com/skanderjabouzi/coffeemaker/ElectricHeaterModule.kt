import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ElectricHeaterModule {
    @Binds
    abstract fun bindHeater(electricHeater: ElectricHeater): Heater
}