package com.example.gtoledo.dagger2test.Dagger;

import com.example.gtoledo.dagger2test.Models.Motorizadas.CortadorDeGrama;
import com.example.gtoledo.dagger2test.Models.Motorizadas.Furadeira;
import com.example.gtoledo.dagger2test.Models.Motorizadas.Motoserra;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleMotorizadas {

    @Provides
    public Motoserra pegarMotoserra(){
        return new Motoserra();
    }


    @Provides
    public Furadeira pegarFuradeira(){
        return new Furadeira();
    }

    @Provides
    public CortadorDeGrama pegarCortadorDeGrama(){
        return new CortadorDeGrama();
    }
}
