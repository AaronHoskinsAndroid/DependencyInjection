package examples.aaronhoskins.com.dependencyinjection.model.car;

import android.util.Log;

public class Tires {
    int tirePreasure;

    public void inflateTires() {
        Log.d("TAG", "inflateTires: TIRES ARE NOW INFLATED PSI = " + tirePreasure);
    }

    public void setTirePreasure(int tirePreasure) {
        this.tirePreasure = tirePreasure;
    }
}
