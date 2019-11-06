package com.xx.composite;

import android.util.Log;

import com.xx.base.BaseApplication;


public class AppApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Application", "AppApplication");
    }
}
