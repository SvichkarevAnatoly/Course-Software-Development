package ru.share_apps.ShareAppsAndroidLibrary;

import android.util.Log;

public class ShareApps {
    public static final String TAG = "ShareApps";

    private static String startingKey;

    public static void startWithKey(String key) {
        startingKey = key;

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread paramThread, final Throwable e) {
                final String CATCHING_HEADER = "Catching error: ";
                final String errorMessage = e.getCause().getMessage();

                final String msg = CATCHING_HEADER + errorMessage;

                Log.e(TAG, msg);
            }

        });
    }

    public static void log(String msg) {
        // TODO: log msg
    }
}
