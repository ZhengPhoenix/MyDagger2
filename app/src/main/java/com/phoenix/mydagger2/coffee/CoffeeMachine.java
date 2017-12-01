package com.phoenix.mydagger2.coffee;

import android.util.Log;

import com.phoenix.mydagger2.coffee.di.DaggerMachineComponent;
import com.phoenix.mydagger2.coffee.di.MachineComponent;
import com.phoenix.mydagger2.coffee.modules.base.Heater;
import com.phoenix.mydagger2.coffee.modules.base.Pumper;

import javax.inject.Inject;

/**
 * Created by zhenghui on 2017/11/29.
 */

public class CoffeeMachine {
    private static final String TAG = PublicConstant.PUB + "CoffeeMachine";

    @Inject
    Pumper mPumper;
    @Inject
    Cooker mCooker;
    @Inject
    Heater mHeater;

    public CoffeeMachine() {
    }

    MachineComponent component;

    public void makeCoffee() {
        component = DaggerMachineComponent.create();
        component.inject(this);
        mPumper.pump();
        mHeater.heat();
        Log.d(TAG, "Coffee ready, cooked by: " + mCooker);
    }

}
