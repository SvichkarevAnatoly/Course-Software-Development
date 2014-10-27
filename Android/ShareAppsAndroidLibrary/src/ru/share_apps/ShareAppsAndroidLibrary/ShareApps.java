package ru.share_apps.ShareAppsAndroidLibrary;

import android.util.Log;

public class ShareApps {
    public static final String TAG = "ShareApps";

    private static String startingKey;

    private static Thread.UncaughtExceptionHandler oldHandler;

    public static void startWithKey(String key) {
        startingKey = key;

        oldHandler = Thread.getDefaultUncaughtExceptionHandler();

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, final Throwable throwable) {
                simpleLogError(throwable);

                if (oldHandler != null) {
                    oldHandler.uncaughtException(thread, throwable);
                }
            }
        });
    }

    private static void simpleLogError(Throwable e) {
        final String CATCHING_HEADER = "Catching error: ";
        final String errorMessage = e.toString();

        final String msg = CATCHING_HEADER + errorMessage;

        Log.e(TAG, msg);
    }

    public static void log(String msg) {
        // TODO: log msg
    }
}
