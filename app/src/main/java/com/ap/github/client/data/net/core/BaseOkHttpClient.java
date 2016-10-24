package com.ap.github.client.data.net.core;

import com.ap.github.client.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * base okhttp
 * Created by SunHZ on 10/17/16.
 */
public abstract class BaseOkHttpClient {

    private static final int CONNECTION_TIMEOUT = 30 * 1000;

    public OkHttpClient get() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(CONNECTION_TIMEOUT, TimeUnit.MILLISECONDS)
                .addInterceptor(new HttpLoggingInterceptor()
                        .setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE));

        builder = customize(builder);

        return builder.build();
    }

    protected abstract OkHttpClient.Builder customize(OkHttpClient.Builder builder);
}
