package com.ap.github.client.common.config;

import com.ap.github.client.BuildConfig;

/**
 * GitHub config
 * Created by SunHZ on 10/17/16.
 */
public final class GitHubConfig {

    public static final String CLIENT_ID = BuildConfig.GITHUB_CLIENT_ID;
    public static final String CLIENT_SECRET = BuildConfig.GITHUB_SECRET;
    public static final String[] SCOPES = {"user", "repo", "notifications", "gist", "admin:org"};
    public static final String NOTE = "Android-GitHub";
    public static final String AUTHOR_NAME = "ChinaSunHZ";

    private GitHubConfig() {
        // no instance.
    }
}
