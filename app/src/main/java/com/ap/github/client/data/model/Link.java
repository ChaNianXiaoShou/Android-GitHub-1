package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Link
 * Created by SunHZ on 10/23/16.
 */
public class Link implements Serializable {

    @SerializedName("href")
    private String mHref;

    public String getHref() {
        return mHref;
    }

    public void setHref(String href) {
        mHref = href;
    }

    @Override
    public String toString() {
        return "Link{"
                + "mHref='" + mHref
                + '\''
                + '}';
    }
}
