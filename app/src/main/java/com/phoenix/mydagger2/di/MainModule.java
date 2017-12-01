package com.phoenix.mydagger2.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhenghui on 2017/11/16.
 */

@Module
public class MainModule {
    Context context;

    public MainModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return this.context;
    }
}
