package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Repo
 * Created by SunHZ on 10/22/16.
 */
public class Repo implements Serializable {

    @SerializedName("id")
    private int mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("url")
    private String mUrl;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    @Override
    public String toString() {
        return "Repo{"
                + "mId=" + mId
                + ", mName='" + mName
                + '\''
                + ", mUrl='" + mUrl
                + '\''
                + '}';
    }
}
