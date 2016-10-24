package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Links
 * Created by SunHZ on 10/23/16.
 */
public class Links implements Serializable {

    @SerializedName("self")
    private Link mSelf;
    @SerializedName("html")
    private Link mHtml;
    @SerializedName("issue")
    private Link mIssue;
    @SerializedName("comments")
    private Link mComments;
    @SerializedName("review_comments")
    private Link mReviewComments;
    @SerializedName("review_comment")
    private Link mReviewComment;
    @SerializedName("commits")
    private Link mCommits;
    @SerializedName("statuses")
    private Link mStatuses;
    @SerializedName("pull_request")
    private Link mPullRequest;

    public Link getSelf() {
        return mSelf;
    }

    public void setSelf(Link self) {
        mSelf = self;
    }

    public Link getHtml() {
        return mHtml;
    }

    public void setHtml(Link html) {
        mHtml = html;
    }

    public Link getIssue() {
        return mIssue;
    }

    public void setIssue(Link issue) {
        mIssue = issue;
    }

    public Link getComments() {
        return mComments;
    }

    public void setComments(Link comments) {
        mComments = comments;
    }

    public Link getReviewComments() {
        return mReviewComments;
    }

    public void setReviewComments(Link reviewComments) {
        mReviewComments = reviewComments;
    }

    public Link getReviewComment() {
        return mReviewComment;
    }

    public void setReviewComment(Link reviewComment) {
        mReviewComment = reviewComment;
    }

    public Link getCommits() {
        return mCommits;
    }

    public void setCommits(Link commits) {
        mCommits = commits;
    }

    public Link getStatuses() {
        return mStatuses;
    }

    public void setStatuses(Link statuses) {
        mStatuses = statuses;
    }

    public Link getPullRequest() {
        return mPullRequest;
    }

    public void setPullRequest(Link pullRequest) {
        mPullRequest = pullRequest;
    }

    @Override
    public String toString() {
        return "Links{"
                + "mSelf=" + mSelf
                + ", mHtml=" + mHtml
                + ", mIssue=" + mIssue
                + ", mComments=" + mComments
                + ", mReviewComments=" + mReviewComments
                + ", mReviewComment=" + mReviewComment
                + ", mCommits=" + mCommits
                + ", mStatuses=" + mStatuses
                + ", mPullRequest=" + mPullRequest
                + '}';
    }
}
