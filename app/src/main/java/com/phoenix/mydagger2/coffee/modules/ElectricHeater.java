package com.phoenix.mydagger2.coffee.modules;

import android.util.Log;

import com.phoenix.mydagger2.coffee.CoffeeMachine;
import com.phoenix.mydagger2.coffee.Cooker;
import com.phoenix.mydagger2.coffee.PublicConstant;
import com.phoenix.mydagger2.coffee.di.DaggerMachineComponent;
import com.phoenix.mydagger2.coffee.modules.base.Heater;
import com.phoenix.mydagger2.coffee.modules.base.Pumper;

import javax.inject.Inject;

/**
 * Created by zhenghui on 2017/11/29.
 */

public class ElectricHeater implements Heater {
    private static final String TAG = PublicConstant.PUB + "ElectricHeater";

    @Inject
    Cooker mCooker;

    public ElectricHeater() {
        DaggerMachineComponent.create().heaterComponent().inject(this);
//        CoffeeMachine.getComponent().heaterComponent().inject(this);
    }

    @Override
    public void heat() {
        mCooker.cook();
        Log.d(TAG, "electric heating... by: " + mCooker);
    }
}
