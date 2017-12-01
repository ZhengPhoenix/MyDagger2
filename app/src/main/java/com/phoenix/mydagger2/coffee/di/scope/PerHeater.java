package com.phoenix.mydagger2.coffee.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by zhenghui on 2017/11/29.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerHeater {
}
