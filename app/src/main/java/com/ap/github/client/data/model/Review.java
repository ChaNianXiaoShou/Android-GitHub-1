package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Review
 * Created by SunHZ on 10/23/16.
 */
public class Review implements Serializable {

    @SerializedName("id")
    private int mId;
    @SerializedName("user")
    private User mUser;
    @SerializedName("body")
    private String mBody;
    @SerializedName("submitted_at")
    private String mSubmittedAt;
    @SerializedName("state")
    private String mState;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("pull_request_url")
    private String mPullRequestUrl;
    @SerializedName("_links")
    private Links mLinks;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public String getSubmittedAt() {
        return mSubmittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        mSubmittedAt = submittedAt;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getPullRequestUrl() {
        return mPullRequestUrl;
    }

    public void setPullRequestUrl(String pullRequestUrl) {
        mPullRequestUrl = pullRequestUrl;
    }

    public Links getLinks() {
        return mLinks;
    }

    public void setLinks(Links links) {
        mLinks = links;
    }

    @Override
    public String toString() {
        return "Review{"
                + "mId=" + mId
                + ", mUser=" + mUser
                + ", mBody='" + mBody
                + '\''
                + ", mSubmittedAt='" + mSubmittedAt
                + '\''
                + ", mState='" + mState
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mPullRequestUrl='" + mPullRequestUrl
                + '\''
                + ", mLinks=" + mLinks
                + '}';
    }
}
