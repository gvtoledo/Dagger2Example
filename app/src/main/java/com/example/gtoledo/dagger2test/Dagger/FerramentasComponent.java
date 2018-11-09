package com.example.gtoledo.dagger2test.Dagger;

import com.example.gtoledo.dagger2test.MainActivity;

import dagger.Component;

@Component(modules = {
        ModuleMotorizadas.class,
        ModulePrimitivas.class
})
public interface FerramentasComponent {
    void inject(MainActivity mainActivity);
}
