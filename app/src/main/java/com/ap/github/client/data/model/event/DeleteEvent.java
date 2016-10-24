package com.ap.github.client.data.model.event;

import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> delete event
 * Created by SunHZ on 10/23/16.
 */
public class DeleteEvent extends BasePayLoad {

    @SerializedName("ref")
    private String mRef;
    @SerializedName("ref_type")
    private String mRefType;
    @SerializedName("pusher_type")
    private String mPusherType;

    public String getRef() {
        return mRef;
    }

    public void setRef(String ref) {
        mRef = ref;
    }

    public String getRefType() {
        return mRefType;
    }

    public void setRefType(String refType) {
        mRefType = refType;
    }

    public String getPusherType() {
        return mPusherType;
    }

    public void setPusherType(String pusherType) {
        mPusherType = pusherType;
    }

    @Override
    public String toString() {
        return "DeleteEvent{"
                + "mRef='" + mRef
                + '\''
                + ", mRefType='" + mRefType
                + '\''
                + ", mPusherType='" + mPusherType
                + '\''
                + '}';
    }
}