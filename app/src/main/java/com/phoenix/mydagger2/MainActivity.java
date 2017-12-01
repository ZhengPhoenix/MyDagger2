package com.phoenix.mydagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.phoenix.mydagger2.coffee.CoffeeMachine;
import com.phoenix.mydagger2.coffee.Cooker;
import com.phoenix.mydagger2.coffee.PublicConstant;
import com.phoenix.mydagger2.di.MainComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = PublicConstant.PUB + "MainActivity";

    @Inject CoffeeMachine machine;

    @Inject MainUtils mainUtils;

    MainComponent mMainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainComponent = ((MainApplication)getApplicationContext()).getAppComponent().mainComponent();
        mMainComponent.inject(this);

        machine.makeCoffee();
        mainUtils.mainLog(TAG);
    }
}
