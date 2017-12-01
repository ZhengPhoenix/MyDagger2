package com.phoenix.mydagger2.di;

import com.phoenix.mydagger2.MainActivity;
import com.phoenix.mydagger2.MainUtils;
import com.phoenix.mydagger2.coffee.CoffeeMachine;
import com.phoenix.mydagger2.coffee.di.CookerModule;
import com.phoenix.mydagger2.coffee.di.MachineComponent;
import com.phoenix.mydagger2.coffee.di.MachineModule;
import com.phoenix.mydagger2.di.scope.PerActivity;

import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by zhenghui on 2017/11/15.
 */

@PerActivity
@Subcomponent (modules = MachineModule.class)
public interface MainComponent {

    void inject(MainActivity activity);
}
