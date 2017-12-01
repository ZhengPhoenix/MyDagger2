package com.phoenix.mydagger2.di;

import com.phoenix.mydagger2.MainApplication;
import com.phoenix.mydagger2.MainUtils;
import com.phoenix.mydagger2.di.scope.PerApp;

import dagger.Component;

/**
 * Created by zhenghui on 2017/11/28.
 */

@PerApp
@Component (modules = {ToastModule.class})
public interface AppComponent {

    MainComponent mainComponent();


    void inject(MainApplication app);
}
