package com.ap.github.client.data.net;

import android.app.Application;

import com.ap.github.client.data.pref.UserPref;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * GitHub http client
 * Created by SunHZ on 10/17/16.
 */
public class GitHubHttpClient extends CacheHttpClient {

    @Inject
    Application mApplication;

    @Inject
    public GitHubHttpClient() {
    }

    @Override
    protected OkHttpClient.Builder customize(OkHttpClient.Builder builder) {
        OkHttpClient.Builder temp = super.customize(builder);
        temp.addInterceptor(new CheckUserLogonInterceptor(mApplication));
        return temp;
    }

    private static final class CheckUserLogonInterceptor implements Interceptor {

        private final Application mApplication;

        private CheckUserLogonInterceptor(Application application) {
            mApplication = application;
        }

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request original = chain.request();
            Request.Builder builder = original.newBuilder();
            builder.header("Accept", getAcceptHeader());
            builder.header("User-Agent", "Android-GitHub");

            if (UserPref.isLogon(mApplication)) {
                builder.header("Authorization", "token " + UserPref.getLogonToken(mApplication));
            }

            Request request = builder.build();
            return chain.proceed(request);
        }

        public String getAcceptHeader() {
            return "application/vnd.github.v3.json";
        }
    }
}
