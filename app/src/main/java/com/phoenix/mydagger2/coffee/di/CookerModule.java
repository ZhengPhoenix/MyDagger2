package com.phoenix.mydagger2.coffee.di;

import com.phoenix.mydagger2.coffee.Cooker;
import com.phoenix.mydagger2.coffee.di.scope.PerHeater;
import com.phoenix.mydagger2.coffee.di.scope.PerMachine;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhenghui on 2017/11/30.
 */

@Module
public class CookerModule {

    @PerMachine
    @Provides
    public Cooker provideCooker() {
        return new Cooker();
    }

}
