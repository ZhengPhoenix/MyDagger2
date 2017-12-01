package com.phoenix.mydagger2.coffee.modules;

import android.util.Log;

import com.phoenix.mydagger2.coffee.PublicConstant;
import com.phoenix.mydagger2.coffee.modules.base.Pumper;

/**
 * Created by zhenghui on 2017/11/29.
 */

public class Thermosiphon implements Pumper {

    private static final String TAG = PublicConstant.PUB + "Thermosiphon";

    @Override
    public void pump() {
        Log.d(TAG, "pumping water...");
    }
}
