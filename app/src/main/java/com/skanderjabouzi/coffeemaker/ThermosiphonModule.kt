import dagger.Binds
import dagger.Module

@Module
abstract class ThermosiphonModule {
    @Binds
    abstract fun bindPump(thermosiphon: Thermosiphon): Pump

}