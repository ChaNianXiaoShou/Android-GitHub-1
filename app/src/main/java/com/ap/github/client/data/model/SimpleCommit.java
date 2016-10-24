package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * SimpleCommit
 * Created by SunHZ on 10/23/16.
 */
public class SimpleCommit {

    @SerializedName("sha")
    private String mSha;
    @SerializedName("url")
    private String mUrl;

    public String getSha() {
        return mSha;
    }

    public void setSha(String sha) {
        mSha = sha;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @Override
    public String toString() {
        return "SimpleCommit{"
                + "mSha='" + mSha
                + '\''
                + ", mUrl='" + mUrl
                + '\''
                + '}';
    }
}
