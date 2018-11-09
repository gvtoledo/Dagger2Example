package com.example.gtoledo.dagger2test;

import android.app.Application;

import com.example.gtoledo.dagger2test.Dagger.DaggerFerramentasComponent;
import com.example.gtoledo.dagger2test.Dagger.FerramentasComponent;
import com.example.gtoledo.dagger2test.Dagger.ModuleMotorizadas;


public class MyApplication extends Application {
    private FerramentasComponent ferramentasComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        ferramentasComponent = createFerramentasComponent();
    }

    FerramentasComponent getFerramentasComponent() {
        return ferramentasComponent;
    }

    private FerramentasComponent createFerramentasComponent() {
        return DaggerFerramentasComponent
                .builder()
                .build();
    }
}
