package com.phoenix.mydagger2.coffee.di;

import com.phoenix.mydagger2.coffee.di.scope.PerHeater;
import com.phoenix.mydagger2.coffee.modules.ElectricHeater;

import dagger.Subcomponent;

/**
 * Created by zhenghui on 2017/11/30.
 */

@PerHeater
@Subcomponent
public interface HeaterSubComponent {

    void inject(ElectricHeater heater);
}
