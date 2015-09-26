package com.spranga.layoutcasttest;

import android.app.Application;

import com.github.mmin18.layoutcast.LayoutCast;

/**
 * Created by Luigi Papino on 26/09/15.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            LayoutCast.init(this);
        }
    }
}
