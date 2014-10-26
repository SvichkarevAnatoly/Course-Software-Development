package com.example.TestAndroidCrashingApp;

import android.app.Activity;
import android.os.Bundle;
import ru.share_apps.ShareAppsAndroidLibrary.ShareApps;

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        ShareApps.startWithKey("0011-0021-22001");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        throw new NullPointerException("PRIVET ot exception");
    }
}
