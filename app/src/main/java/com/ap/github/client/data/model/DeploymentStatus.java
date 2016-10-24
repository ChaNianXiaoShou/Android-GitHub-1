package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * DeploymentStatus
 * Created by SunHZ on 10/23/16.
 */
public class DeploymentStatus implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("state")
    private String mState;
    @SerializedName("creator")
    private User mCreator;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("target_url")
    private String mTargetUrl;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("deployment_url")
    private String mDeploymentUrl;
    @SerializedName("repository_url")
    private String mRepositoryUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public User getCreator() {
        return mCreator;
    }

    public void setCreator(User creator) {
        mCreator = creator;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getTargetUrl() {
        return mTargetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        mTargetUrl = targetUrl;
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

    public String getDeploymentUrl() {
        return mDeploymentUrl;
    }

    public void setDeploymentUrl(String deploymentUrl) {
        mDeploymentUrl = deploymentUrl;
    }

    public String getRepositoryUrl() {
        return mRepositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        mRepositoryUrl = repositoryUrl;
    }

    @Override
    public String toString() {
        return "DeploymentStatus{"
                + "mUrl='" + mUrl
                + '\''
                + ", mId=" + mId
                + ", mState='" + mState
                + '\''
                + ", mCreator=" + mCreator
                + ", mDescription='" + mDescription
                + '\''
                + ", mTargetUrl='" + mTargetUrl
                + '\''
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mDeploymentUrl='" + mDeploymentUrl
                + '\''
                + ", mRepositoryUrl='" + mRepositoryUrl
                + '\''
                + '}';
    }
}
