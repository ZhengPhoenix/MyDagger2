package com.phoenix.mydagger2;

import android.app.Application;

import com.phoenix.mydagger2.coffee.PublicConstant;
import com.phoenix.mydagger2.di.AppComponent;
import com.phoenix.mydagger2.di.DaggerAppComponent;

import javax.inject.Inject;

/**
 * Created by zhenghui on 2017/11/15.
 */

public class MainApplication extends Application {
    private static final String TAG = PublicConstant.PUB + "MainApplication";

    AppComponent appComponent;

    @Inject MainUtils mainUtils;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();
        appComponent.inject(this);

        mainUtils.mainLog(TAG);
    }



    public AppComponent getAppComponent() {
        return appComponent;
    }
}
