package com.ap.github.client.data.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.ap.github.client.data.model.User;
import com.ap.github.client.ui.account.LoginActivity;
import com.google.gson.Gson;

/**
 * user preference
 * Created by SunHZ on 10/17/16.
 */
public final class UserPref {

    private static final String KEY_USER_PREF = "user_pref.xml";

    private static final String KEY_LOGON_TOKEN = "logon_token";
    private static final String KEY_LOGON_USER = "logon_user";

    private UserPref() {
        // no instance.
    }

    private static SharedPreferences getPreference(Context context) {
        return context.getApplicationContext().getSharedPreferences(KEY_USER_PREF, Context.MODE_PRIVATE);
    }

    public static void saveLogonToken(Context context, String userToken) {
        getPreference(context).edit().putString(KEY_LOGON_TOKEN, userToken).apply();
    }

    public static String getLogonToken(Context context) {
        return getPreference(context).getString(KEY_LOGON_TOKEN, "");
    }

    public static void saveLogonUser(Context context, User user) {
        String userJson = new Gson().toJson(user);
        getPreference(context).edit().putString(KEY_LOGON_USER, userJson).apply();
    }

    public static User getLogonUser(Context context) {
        User user = null;
        String userJson = getPreference(context).getString(KEY_LOGON_USER, "");
        if (!TextUtils.isEmpty(userJson)) {
            user = new Gson().fromJson(userJson, User.class);
        }
        return user;
    }

    public static void removeLogonUser(Context context) {
        getPreference(context).edit().remove(KEY_LOGON_USER).apply();
    }

    public static boolean isLogon(Context context) {
        return getLogonUser(context) != null && !TextUtils.isEmpty(getLogonToken(context));
    }

    public static boolean checkLogon(Context context) {
        if (!isLogon(context)) {
            LoginActivity.launch(context);
            return false;
        }
        return true;
    }

    public static boolean isSelf(Context context, String username) {
        User user = getLogonUser(context);
        return user != null && !TextUtils.isEmpty(getLogonToken(context)) && !TextUtils.isEmpty(username) && username.equals(user.getLogin());
    }

}
