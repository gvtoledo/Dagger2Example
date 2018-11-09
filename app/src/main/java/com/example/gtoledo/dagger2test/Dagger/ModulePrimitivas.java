package com.example.gtoledo.dagger2test.Dagger;

import com.example.gtoledo.dagger2test.Models.Primitivas.Alicate;
import com.example.gtoledo.dagger2test.Models.Primitivas.Martelo;
import com.example.gtoledo.dagger2test.Models.Primitivas.Serrote;

import dagger.Module;
import dagger.Provides;

@Module
public class ModulePrimitivas {

    @Provides
    public Martelo pegarMartelo(){
        return new Martelo();
    }

    @Provides
    public Serrote pegarSerrote(){
        return new Serrote();
    }

    @Provides
    public Alicate pegarAlicate(){
        return new Alicate();
    }
}
