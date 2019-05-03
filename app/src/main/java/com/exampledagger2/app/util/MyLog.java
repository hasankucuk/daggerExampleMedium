package com.exampledagger2.app.util;


import android.util.Log;

import com.exampledagger2.app.BuildConfig;


public final class MyLog {
    /**
     * The Constant TAG.
     */
    public static final String TAG = "DaggerExample";

    /**
     * The debug.
     */
    public static boolean debug = BuildConfig.DEBUG;

    public static synchronized void log(String tag, String message) {
        if (debug) {
            if (message == null)
                return;
            Log.i(tag, message);
        }
    }

    public static synchronized void log(Throwable t) {
        if (t != null) {
            if (debug) {
                Log.i(TAG, "Error", t);
            }
        }
    }

    public static synchronized void log(String message, Exception t) {
        if (debug) {
            if (message == null)
                return;
            Log.e(TAG, message, t);
        }
    }

    public static synchronized void log(String message) {
        if (debug) {
            if (message == null)
                return;
            Log.i(TAG, message);
        }
    }

    public static synchronized void log(Exception t) {
        if (t != null) {
            if (debug) {
                Log.i(TAG, "Error", t);
            }
        }
    }
}
