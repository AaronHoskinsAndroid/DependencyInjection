package examples.aaronhoskins.com.dependencyinjection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.Component;
import examples.aaronhoskins.com.dependencyinjection.dagger.components.Components;
import examples.aaronhoskins.com.dependencyinjection.dagger.components.DaggerComponents;
import examples.aaronhoskins.com.dependencyinjection.model.car.Car;

public class MainActivity extends AppCompatActivity {
   @Inject
   public Car car;
   //@Inject
   //public Driver driver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Components components = DaggerComponents.create();
        components.inject(this);

        car.getEngine().startEngine();
    }
}
