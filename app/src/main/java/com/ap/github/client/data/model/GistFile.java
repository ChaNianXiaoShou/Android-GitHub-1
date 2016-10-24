package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * GistFile
 * Created by SunHZ on 10/23/16.
 */
public class GistFile implements Serializable {

    @SerializedName("size")
    private int mSize;
    @SerializedName("raw_url")
    private String mRawUrl;
    @SerializedName("type")
    private String mType;
    @SerializedName("truncated")
    private boolean mTruncated;
    @SerializedName("language")
    private String mLanguage;

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        mSize = size;
    }

    public String getRawUrl() {
        return mRawUrl;
    }

    public void setRawUrl(String rawUrl) {
        mRawUrl = rawUrl;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public boolean isTruncated() {
        return mTruncated;
    }

    public void setTruncated(boolean truncated) {
        mTruncated = truncated;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }
}
