package com.ap.github.client.data.net;

import com.ap.github.client.data.net.core.ApiEndpoint;
import com.ap.github.client.data.net.core.BaseRetrofit;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

/**
 * GitHub repo
 * Created by SunHZ on 10/17/16.
 */

public class GitHubRepoRetrofit extends BaseRetrofit {

    private static final String END_POINT = "https://api.github.com/";

    private final GitHubHttpClient mGitHubHttpClient;

    @Inject
    public GitHubRepoRetrofit(GitHubHttpClient gitHubHttpClient) {
        mGitHubHttpClient = gitHubHttpClient;
    }

    @Override
    protected ApiEndpoint getApiEndpoint() {
        return new ApiEndpoint(END_POINT);
    }

    @Override
    protected OkHttpClient getClient() {
        return mGitHubHttpClient.get();
    }
}
