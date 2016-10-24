package com.ap.github.client.data.model.event;

import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> watch event
 * Created by SunHZ on 10/23/16.
 */
public class WatchEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    @Override
    public String toString() {
        return "WatchEvent{"
                + "mAction='" + mAction
                + '\''
                + '}';
    }
}
