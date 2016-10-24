package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Comment
 * Created by SunHZ on 10/22/16.
 */
public class Comment implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("user")
    private User mUser;
    @SerializedName("issue_url")
    private String mIssueUrl;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("body")
    private String mBody;
    @SerializedName("diff_hunk")
    private String mDiffHunk;
    @SerializedName("path")
    private String mPath;
    @SerializedName("position")
    private int mPosition;
    @SerializedName("original_position")
    private int mOriginalPosition;
    @SerializedName("commit_id")
    private String mCommitId;
    @SerializedName("original_commit_id")
    private String mOriginalCommitId;
    @SerializedName("pull_request_url")
    private String mPullRequestUrl;
    @SerializedName("_links")
    private Links mLinks;

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

    public String getIssueUrl() {
        return mIssueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        mIssueUrl = issueUrl;
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

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public String getDiffHunk() {
        return mDiffHunk;
    }

    public void setDiffHunk(String diffHunk) {
        mDiffHunk = diffHunk;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {
        mPath = path;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int position) {
        mPosition = position;
    }

    public int getOriginalPosition() {
        return mOriginalPosition;
    }

    public void setOriginalPosition(int originalPosition) {
        mOriginalPosition = originalPosition;
    }

    public String getCommitId() {
        return mCommitId;
    }

    public void setCommitId(String commitId) {
        mCommitId = commitId;
    }

    public String getOriginalCommitId() {
        return mOriginalCommitId;
    }

    public void setOriginalCommitId(String originalCommitId) {
        mOriginalCommitId = originalCommitId;
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
        return "Comment{"
                + "mUrl='" + mUrl
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mId=" + mId
                + ", mUser=" + mUser
                + ", mIssueUrl='" + mIssueUrl
                + '\''
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mBody='" + mBody
                + '\''
                + ", mDiffHunk='" + mDiffHunk
                + '\''
                + ", mPath='" + mPath
                + '\''
                + ", mPosition=" + mPosition
                + ", mOriginalPosition=" + mOriginalPosition
                + ", mCommitId='" + mCommitId
                + '\''
                + ", mOriginalCommitId='" + mOriginalCommitId
                + '\''
                + ", mPullRequestUrl='" + mPullRequestUrl
                + '\''
                + ", mLinks=" + mLinks
                + '}';
    }
}
