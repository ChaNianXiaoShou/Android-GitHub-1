package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Assets
 * Created by SunHZ on 10/23/16.
 */
public class Assets implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("browser_download_url")
    private String mBrowserDownloadUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("label")
    private String mLabel;
    @SerializedName("state")
    private String mState;
    @SerializedName("content_type")
    private String mContentType;
    @SerializedName("size")
    private int mSize;
    @SerializedName("download_count")
    private int mDownloadCount;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("uploader")
    private User mUploader;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getBrowserDownloadUrl() {
        return mBrowserDownloadUrl;
    }

    public void setBrowserDownloadUrl(String browserDownloadUrl) {
        mBrowserDownloadUrl = browserDownloadUrl;
    }

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

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getContentType() {
        return mContentType;
    }

    public void setContentType(String contentType) {
        mContentType = contentType;
    }

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        mSize = size;
    }

    public int getDownloadCount() {
        return mDownloadCount;
    }

    public void setDownloadCount(int downloadCount) {
        mDownloadCount = downloadCount;
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

    public User getUploader() {
        return mUploader;
    }

    public void setUploader(User uploader) {
        mUploader = uploader;
    }

    @Override
    public String toString() {
        return "Assets{"
                + "mUrl='" + mUrl
                + '\''
                + ", mBrowserDownloadUrl='" + mBrowserDownloadUrl
                + '\''
                + ", mId=" + mId
                + ", mName='" + mName
                + '\''
                + ", mLabel='" + mLabel
                + '\''
                + ", mState='" + mState
                + '\''
                + ", mContentType='" + mContentType
                + '\''
                + ", mSize=" + mSize
                + ", mDownloadCount=" + mDownloadCount
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mUploader=" + mUploader
                + '}';
    }
}
