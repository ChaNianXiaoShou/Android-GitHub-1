package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Issue
 * Created by SunHZ on 10/23/16.
 */
public class Issue implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("labels_url")
    private String mLabelsUrl;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("number")
    private int mNumber;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("user")
    private User mUser;
    @SerializedName("state")
    private String mState;
    @SerializedName("locked")
    private boolean mLocked;
    @SerializedName("assignee")
    private User mAssignee;
    @SerializedName("milestone")
    private Milestone mMilestone;
    @SerializedName("comments")
    private int mComments;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("closed_at")
    private String mClosedAt;
    @SerializedName("body")
    private String mBody;
    @SerializedName("labels")
    private List<Label> mLabels;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        mLabelsUrl = labelsUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
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

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public boolean isLocked() {
        return mLocked;
    }

    public void setLocked(boolean locked) {
        mLocked = locked;
    }

    public User getAssignee() {
        return mAssignee;
    }

    public void setAssignee(User assignee) {
        mAssignee = assignee;
    }

    public Milestone getMilestone() {
        return mMilestone;
    }

    public void setMilestone(Milestone milestone) {
        mMilestone = milestone;
    }

    public int getComments() {
        return mComments;
    }

    public void setComments(int comments) {
        mComments = comments;
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

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public List<Label> getLabels() {
        return mLabels;
    }

    public void setLabels(List<Label> labels) {
        mLabels = labels;
    }

    @Override
    public String toString() {
        return "Issue{"
                + "mUrl='" + mUrl
                + '\''
                + ", mLabelsUrl='" + mLabelsUrl
                + '\''
                + ", mCommentsUrl='" + mCommentsUrl
                + '\''
                + ", mEventsUrl='" + mEventsUrl
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mId=" + mId
                + ", mNumber=" + mNumber
                + ", mTitle='" + mTitle
                + '\''
                + ", mUser=" + mUser
                + ", mState='" + mState
                + '\''
                + ", mLocked=" + mLocked
                + ", mAssignee=" + mAssignee
                + ", mMilestone=" + mMilestone
                + ", mComments=" + mComments
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mClosedAt=" + mClosedAt
                + ", mBody='" + mBody
                + '\''
                + ", mLabels=" + mLabels
                + '}';
    }
}
