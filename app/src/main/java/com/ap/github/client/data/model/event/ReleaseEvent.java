package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Release;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> release event
 * Created by SunHZ on 10/23/16.
 */
public class ReleaseEvent extends BasePayLoad {
    @SerializedName("action")
    private String mAction;
    @SerializedName("release")
    private Release mRelease;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public Release getRelease() {
        return mRelease;
    }

    public void setRelease(Release release) {
        mRelease = release;
    }

    @Override
    public String toString() {
        return "ReleaseEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mRelease=" + mRelease
                + '}';
    }
}
