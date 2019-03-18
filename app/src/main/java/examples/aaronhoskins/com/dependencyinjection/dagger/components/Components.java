package examples.aaronhoskins.com.dependencyinjection.dagger.components;

import dagger.Component;
import examples.aaronhoskins.com.dependencyinjection.MainActivity;
import examples.aaronhoskins.com.dependencyinjection.dagger.modules.WheelsModule;
import examples.aaronhoskins.com.dependencyinjection.model.car.Car;

@Component (modules = WheelsModule.class)
public interface Components {
    //Car getCar();
    void inject(MainActivity mainActivity);
}
