package com.ap.github.client.data.model.event;

import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> create event
 * Created by SunHZ on 10/23/16.
 */
public class CreateEvent extends BasePayLoad {

    @SerializedName("ref")
    private String mRef;
    @SerializedName("ref_type")
    private String mRefType;
    @SerializedName("master_branch")
    private String mMasterBranch;
    @SerializedName("description")
    private String mDescription;
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

    public String getMasterBranch() {
        return mMasterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        mMasterBranch = masterBranch;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getPusherType() {
        return mPusherType;
    }

    public void setPusherType(String pusherType) {
        mPusherType = pusherType;
    }

    @Override
    public String toString() {
        return "CreateEvent{"
                + "mRef='" + mRef
                + '\''
                + ", mRefType='" + mRefType
                + '\''
                + ", mMasterBranch='" + mMasterBranch
                + '\''
                + ", mDescription='" + mDescription
                + '\''
                + ", mPusherType='" + mPusherType
                + '\''
                + '}';
    }
}
