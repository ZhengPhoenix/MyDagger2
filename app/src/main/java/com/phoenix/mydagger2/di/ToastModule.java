package com.phoenix.mydagger2.di;

import com.phoenix.mydagger2.MainUtils;
import com.phoenix.mydagger2.di.scope.PerApp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhenghui on 2017/11/28.
 */

@Module
public class ToastModule {

    @PerApp
    @Provides
    public MainUtils provideToast() {
        return new MainUtils();
    }
}
