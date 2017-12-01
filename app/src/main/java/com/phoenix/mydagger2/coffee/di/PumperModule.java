package com.phoenix.mydagger2.coffee.di;

import com.phoenix.mydagger2.coffee.di.scope.PerMachine;
import com.phoenix.mydagger2.coffee.modules.Thermosiphon;
import com.phoenix.mydagger2.coffee.modules.base.Pumper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhenghui on 2017/11/29.
 */

@Module
public class PumperModule {

    @PerMachine
    @Provides
    public Pumper providePumper() {
        return new Thermosiphon();
    }
}
