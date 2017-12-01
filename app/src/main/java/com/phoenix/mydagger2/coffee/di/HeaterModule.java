package com.phoenix.mydagger2.coffee.di;

import com.phoenix.mydagger2.coffee.Cooker;
import com.phoenix.mydagger2.coffee.di.scope.PerMachine;
import com.phoenix.mydagger2.coffee.modules.ElectricHeater;
import com.phoenix.mydagger2.coffee.modules.base.Heater;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhenghui on 2017/11/29.
 */

@Module
public class HeaterModule {

    @PerMachine
    @Provides
    public Heater provideHeater() {
        return new ElectricHeater();
    }
}
