package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Label
 * Created by SunHZ on 10/23/16.
 */
public class Label implements Serializable {
    @SerializedName("url")
    private String mUrl;
    @SerializedName("name")
    private String mName;
    @SerializedName("color")
    private String mColor;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    @Override
    public String toString() {
        return "Label{"
                + "mUrl='" + mUrl
                + '\''
                + ", mName='" + mName
                + '\''
                + ", mColor='" + mColor
                + '\''
                + '}';
    }
}