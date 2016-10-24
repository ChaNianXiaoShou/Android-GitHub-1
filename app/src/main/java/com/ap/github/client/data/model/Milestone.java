package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Milestone
 * Created by SunHZ on 10/23/16.
 */
public class Milestone implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("labels_url")
    private String mLabelsUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("number")
    private int mNumber;
    @SerializedName("state")
    private String mState;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("creator")
    private User mCreator;
    @SerializedName("open_issues")
    private int mOpenIssues;
    @SerializedName("closed_issues")
    private int mClosedIssues;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("closed_at")
    private String mClosedAt;
    @SerializedName("due_on")
    private String mDueOn;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        mLabelsUrl = labelsUrl;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
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

    public int getOpenIssues() {
        return mOpenIssues;
    }

    public void setOpenIssues(int openIssues) {
        mOpenIssues = openIssues;
    }

    public int getClosedIssues() {
        return mClosedIssues;
    }

    public void setClosedIssues(int closedIssues) {
        mClosedIssues = closedIssues;
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

    public String getClosedAt() {
        return mClosedAt;
    }

    public void setClosedAt(String closedAt) {
        mClosedAt = closedAt;
    }

    public String getDueOn() {
        return mDueOn;
    }

    public void setDueOn(String dueOn) {
        mDueOn = dueOn;
    }

    @Override
    public String toString() {
        return "Milestone{"
                + "mUrl='" + mUrl
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mLabelsUrl='" + mLabelsUrl
                + '\''
                + ", mId=" + mId
                + ", mNumber=" + mNumber
                + ", mState='" + mState
                + '\''
                + ", mTitle='" + mTitle
                + '\''
                + ", mDescription='" + mDescription
                + '\''
                + ", mCreator=" + mCreator
                + ", mOpenIssues=" + mOpenIssues
                + ", mClosedIssues=" + mClosedIssues
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mClosedAt='" + mClosedAt
                + '\''
                + ", mDueOn='" + mDueOn
                + '\''
                + '}';
    }
}
