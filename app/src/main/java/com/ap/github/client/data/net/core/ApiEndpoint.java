package com.ap.github.client.data.net.core;

/**
 * api endpoint
 * Created by SunHZ on 10/17/16.
 */
public class ApiEndpoint {

    private String mApiEndpoint;

    public ApiEndpoint(String apiEndpoint) {
        mApiEndpoint = apiEndpoint;
    }

    public String getApiEndpoint() {
        return mApiEndpoint;
    }

    public void setApiEndpoint(String apiEndpoint) {
        mApiEndpoint = apiEndpoint;
    }
}
