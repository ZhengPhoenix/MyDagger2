package com.phoenix.mydagger2.coffee.di;

import com.phoenix.mydagger2.coffee.CoffeeMachine;
import com.phoenix.mydagger2.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhenghui on 2017/11/29.
 */

@Module
public class MachineModule {

    @PerActivity
    @Provides
    public CoffeeMachine provideMachine() {
        return new CoffeeMachine();
    }
}
