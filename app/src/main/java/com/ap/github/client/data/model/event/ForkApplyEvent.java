package com.ap.github.client.data.model.event;

import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> fork apply event
 * Created by SunHZ on 10/23/16.
 */
public class ForkApplyEvent extends BasePayLoad {

    @SerializedName("head")
    private String mHead;
    @SerializedName("before")
    private String mBefore;
    @SerializedName("after")
    private String mAfter;

    public String getHead() {
        return mHead;
    }

    public void setHead(String head) {
        mHead = head;
    }

    public String getBefore() {
        return mBefore;
    }

    public void setBefore(String before) {
        mBefore = before;
    }

    public String getAfter() {
        return mAfter;
    }

    public void setAfter(String after) {
        mAfter = after;
    }

    @Override
    public String toString() {
        return "ForkApplyEvent{"
                + "mHead='" + mHead
                + '\''
                + ", mBefore='" + mBefore
                + '\''
                + ", mAfter='" + mAfter
                + '\''
                + '}';
    }
}
