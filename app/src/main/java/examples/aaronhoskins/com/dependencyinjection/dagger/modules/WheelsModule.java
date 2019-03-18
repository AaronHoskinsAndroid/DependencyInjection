package examples.aaronhoskins.com.dependencyinjection.dagger.modules;

import dagger.Module;
import dagger.Provides;
import examples.aaronhoskins.com.dependencyinjection.model.car.Rims;
import examples.aaronhoskins.com.dependencyinjection.model.car.Tires;
import examples.aaronhoskins.com.dependencyinjection.model.car.Wheels;

@Module
public class WheelsModule {

    @Provides
    public Rims provideRims() {
        return new Rims();
    }

    @Provides
    public Tires provideTires() {
        Tires tires = new Tires();
        tires.setTirePreasure(36);
        tires.inflateTires();
        return tires;
    }

    @Provides
    public Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
