package com.example.gtoledo.dagger2test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.gtoledo.dagger2test.Models.Motorizadas.Motoserra;
import com.example.gtoledo.dagger2test.Models.Primitivas.Serrote;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Serrote serrote;

    @Inject
    public Motoserra motoserra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication())
        .getFerramentasComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),this.serrote.getName(),Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),this.motoserra.getName(),Toast.LENGTH_LONG).show();
    }
}
