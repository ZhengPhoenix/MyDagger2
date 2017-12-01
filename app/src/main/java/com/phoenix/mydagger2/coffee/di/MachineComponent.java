package com.phoenix.mydagger2.coffee.di;

import com.phoenix.mydagger2.coffee.CoffeeMachine;
import com.phoenix.mydagger2.coffee.di.scope.PerMachine;

import dagger.Component;

/**
 * Created by zhenghui on 2017/11/29.
 */
@PerMachine
@Component(modules = { HeaterModule.class,
        PumperModule.class,
        CookerModule.class})
public interface MachineComponent {

    HeaterSubComponent heaterComponent();

    void inject(CoffeeMachine machine);
}
