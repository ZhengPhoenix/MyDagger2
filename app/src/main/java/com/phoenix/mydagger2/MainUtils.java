package com.phoenix.mydagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by zhenghui on 2017/11/28.
 */

public class MainUtils {
    private static final String TAG = "MainUtils";

    @Inject
    public MainUtils() {
    }

    public void mainLog(String tag) {
        Log.d(TAG, "mainLog: this is log from " + tag + " id: " + this);
    }
}
