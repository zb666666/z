package com.example.zhoubo30110.myapp;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by zhoubo30110 on 2018/6/22.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
         CrashReport.initCrashReport(getApplicationContext(), "7ced9988b2", true);
    }
}
