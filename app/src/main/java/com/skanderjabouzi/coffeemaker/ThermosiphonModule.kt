import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class ThermosiphonModule {
    @Binds
    abstract fun bindPump(thermosiphon: Thermosiphon): Pump

    companion object {
        @Provides
        @Singleton
        fun provideHeater(): Heater {
            return ElectricHeater()
        }
    }

}