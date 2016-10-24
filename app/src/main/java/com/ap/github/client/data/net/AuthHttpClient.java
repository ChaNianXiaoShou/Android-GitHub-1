package com.ap.github.client.data.net;

import android.text.TextUtils;
import android.util.Base64;

import com.ap.github.client.data.net.core.BaseOkHttpClient;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * auth http client
 * Created by SunHZ on 10/17/16.
 */
public class AuthHttpClient extends BaseOkHttpClient {

    private final String mUsername;
    private final String mPassword;

    public AuthHttpClient(String username, String password) {
        mUsername = username;
        mPassword = password;
    }

    @Override
    protected OkHttpClient.Builder customize(OkHttpClient.Builder builder) {
        if (!TextUtils.isEmpty(mUsername) && !TextUtils.isEmpty(mPassword)) {
            builder.addInterceptor(new UserLoginInterceptor(mUsername, mPassword));
        }
        return builder;
    }

    private static final class UserLoginInterceptor implements Interceptor {

        private final String mUsername;
        private final String mPassword;

        private UserLoginInterceptor(String username, String password) {
            mUsername = username;
            mPassword = password;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            String userCredentials = mUsername + ":" + mPassword;
            String basicAuth = "Basic " + new String(Base64.encode(userCredentials.getBytes(), Base64.DEFAULT));
            Request original = chain.request();
            Request.Builder builder = original.newBuilder();
            builder.header("Authorization", basicAuth.trim());
            Request request = builder.build();
            return chain.proceed(request);
        }
    }
}
