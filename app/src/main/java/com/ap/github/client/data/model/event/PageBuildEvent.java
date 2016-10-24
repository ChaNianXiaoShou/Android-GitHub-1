package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Build;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> page build event
 * Created by SunHZ on 10/23/16.
 */
public class PageBuildEvent extends BasePayLoad {

    @SerializedName("id")
    private String mId;
    @SerializedName("build")
    private Build mBuild;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Build getBuild() {
        return mBuild;
    }

    public void setBuild(Build build) {
        mBuild = build;
    }

    @Override
    public String toString() {
        return "PageBuildEvent{"
                + "mId='" + mId
                + '\''
                + ", mBuild=" + mBuild
                + '}';
    }
}
