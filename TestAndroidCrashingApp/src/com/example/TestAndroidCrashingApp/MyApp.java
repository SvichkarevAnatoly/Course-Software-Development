package com.example.TestAndroidCrashingApp;

import android.app.Application;
import ru.share_apps.ShareAppsAndroidLibrary.ShareApps;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        ShareApps.startWithKey("0011-0021-22001");

        super.onCreate();
    }
}
