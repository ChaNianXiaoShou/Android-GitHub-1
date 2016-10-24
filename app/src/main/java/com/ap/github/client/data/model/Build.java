package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Build
 * Created by SunHZ on 10/23/16.
 */
public class Build implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("error")
    private Error mError;
    @SerializedName("pusher")
    private User mPusher;
    @SerializedName("commit")
    private String mCommit;
    @SerializedName("duration")
    private int mDuration;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public Error getError() {
        return mError;
    }

    public void setError(Error error) {
        mError = error;
    }

    public User getPusher() {
        return mPusher;
    }

    public void setPusher(User pusher) {
        mPusher = pusher;
    }

    public String getCommit() {
        return mCommit;
    }

    public void setCommit(String commit) {
        mCommit = commit;
    }

    public int getDuration() {
        return mDuration;
    }

    public void setDuration(int duration) {
        mDuration = duration;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Build{"
                + "mUrl='" + mUrl
                + '\''
                + ", mStatus='" + mStatus
                + '\''
                + ", mError=" + mError
                + ", mPusher=" + mPusher
                + ", mCommit='" + mCommit
                + '\''
                + ", mDuration=" + mDuration
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + '}';
    }
}
