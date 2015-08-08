package com.example.chen.finder;

import android.app.Application;

/**
 * Created by chen on 8/7/2015.
 */
public class Myapplication extends Application {
    private static Myapplication sCurrentApplication = null;
    public void onCreate() {
        super.onCreate();

        sCurrentApplication = this;
    }
    public static Myapplication get() {
        return sCurrentApplication;
    }
}
