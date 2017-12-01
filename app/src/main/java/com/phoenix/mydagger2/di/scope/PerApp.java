package com.phoenix.mydagger2.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by zhenghui on 2017/11/28.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerApp {
}
