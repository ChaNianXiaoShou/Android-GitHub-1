package com.ap.github.client.common.util;

import com.google.gson.Gson;

/**
 * Gson util
 * Created by SunHZ on 10/23/16.
 */
public final class GsonUtil {

    private static final Gson GSON = new Gson();

    private GsonUtil() {
        // no instance
    }

    public static Gson getGson() {
        return GSON;
    }
}
