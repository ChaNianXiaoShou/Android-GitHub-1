package com.ap.github.client.data.pref;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * app preference
 * Created by SunHZ on 10/17/16.
 */
public final class AppPref {

    private static final String KEY_APP_PREF = "app_pref.xml";
    private static final String KEY_IS_FIRST_RUNNING = "is_first_running";

    private AppPref() {
        // no instance.
    }

    private static SharedPreferences getPreferences(Context context) {
        return context.getApplicationContext().getSharedPreferences(KEY_APP_PREF, Context.MODE_PRIVATE);
    }

    public static void setAlreadyRun(Context context) {
        getPreferences(context).edit().putBoolean(KEY_IS_FIRST_RUNNING, false).apply();
    }

    public static boolean isFirstRunning(Context context) {
        return getPreferences(context).getBoolean(KEY_IS_FIRST_RUNNING, true);
    }

}
