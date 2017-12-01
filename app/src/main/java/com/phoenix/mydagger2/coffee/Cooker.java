package com.phoenix.mydagger2.coffee;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by zhenghui on 2017/11/29.
 */

public class Cooker {
    private static final String TAG = PublicConstant.PUB + "Cooker";

    private String name = "StarBuck";

    public Cooker() {
    }

    public void cook() {
        Log.d(TAG, name + " cooking...");
    }
}
