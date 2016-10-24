package com.ap.github.client.data.net;

import com.ap.github.client.data.net.core.ApiEndpoint;
import com.ap.github.client.data.net.core.BaseRetrofit;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * GitHub auth retrofit
 * Created by SunHZ on 10/17/16.
 */
public class GitHubAuthRetrofit extends BaseRetrofit {

    private static final String END_POINT = "https://api.github.com/";

    private String mUsername;
    private String mPassword;

    @Inject
    public GitHubAuthRetrofit() {
    }

    public void setAuthInfo(String username, String password) {
        mUsername = username;
        mPassword = password;
    }

    @Override
    protected ApiEndpoint getApiEndpoint() {
        return new ApiEndpoint(END_POINT);
    }

    @Override
    protected OkHttpClient getClient() {
        return new AuthHttpClient(mUsername, mPassword).get();
    }
}
