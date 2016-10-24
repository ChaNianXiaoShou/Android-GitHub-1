package com.ap.github.client.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * app util
 * Created by SunHZ on 10/17/16.
 */
public final class AppUtil {

    private AppUtil() {
        // no instance
    }

    public static String getVersionName(Context context) {
        String versionName = "0.1";

        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return versionName;
    }

}
