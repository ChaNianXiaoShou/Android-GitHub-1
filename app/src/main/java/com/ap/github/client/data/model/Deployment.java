package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Deployment
 * Created by SunHZ on 10/23/16.
 */
public class Deployment implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("sha")
    private String mSha;
    @SerializedName("ref")
    private String mRef;
    @SerializedName("task")
    private String mTask;
    @SerializedName("environment")
    private String mEnvironment;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("creator")
    private User mCreator;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("statuses_url")
    private String mStatusesUrl;
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

    public String getSha() {
        return mSha;
    }

    public void setSha(String sha) {
        mSha = sha;
    }

    public String getRef() {
        return mRef;
    }

    public void setRef(String ref) {
        mRef = ref;
    }

    public String getTask() {
        return mTask;
    }

    public void setTask(String task) {
        mTask = task;
    }

    public String getEnvironment() {
        return mEnvironment;
    }

    public void setEnvironment(String environment) {
        mEnvironment = environment;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public User getCreator() {
        return mCreator;
    }

    public void setCreator(User creator) {
        mCreator = creator;
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

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        mStatusesUrl = statusesUrl;
    }

    public String getRepositoryUrl() {
        return mRepositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        mRepositoryUrl = repositoryUrl;
    }

    @Override
    public String toString() {
        return "Deployment{"
                + "mUrl='" + mUrl
                + '\''
                + ", mId=" + mId
                + ", mSha='" + mSha
                + '\''
                + ", mRef='" + mRef
                + '\''
                + ", mTask='" + mTask
                + '\''
                + ", mEnvironment='" + mEnvironment
                + '\''
                + ", mDescription=" + mDescription
                + ", mCreator=" + mCreator
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mStatusesUrl='" + mStatusesUrl
                + '\''
                + ", mRepositoryUrl='" + mRepositoryUrl
                + '\''
                + '}';
    }
}
