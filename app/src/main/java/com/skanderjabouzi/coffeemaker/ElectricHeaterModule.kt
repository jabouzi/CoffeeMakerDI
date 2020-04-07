import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ThermosiphonModule::class])
class ElectricHeaterModule {
    @Provides
    @Singleton
    fun provideHeater(): Heater = ElectricHeater()
}