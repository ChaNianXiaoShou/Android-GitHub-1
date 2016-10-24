package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Map;

/**
 * Gist
 * Created by SunHZ on 10/23/16.
 */
public class Gist implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("forks_url")
    private String mForksUrl;
    @SerializedName("commits_url")
    private String mCommitsUrl;
    @SerializedName("id")
    private String mId;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("public")
    private boolean mPublicX;
    @SerializedName("owner")
    private User mOwner;
    @SerializedName("user")
    private String mUser;
    @SerializedName("files")
    private Map<String, GistFile> mFiles;
    @SerializedName("truncated")
    private boolean mTruncated;
    @SerializedName("comments")
    private int mComments;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("git_pull_url")
    private String mGitPullUrl;
    @SerializedName("git_push_url")
    private String mGitPushUrl;
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

    public String getForksUrl() {
        return mForksUrl;
    }

    public void setForksUrl(String forksUrl) {
        mForksUrl = forksUrl;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        mCommitsUrl = commitsUrl;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isPublicX() {
        return mPublicX;
    }

    public void setPublicX(boolean publicX) {
        mPublicX = publicX;
    }

    public User getOwner() {
        return mOwner;
    }

    public void setOwner(User owner) {
        mOwner = owner;
    }

    public String getUser() {
        return mUser;
    }

    public void setUser(String user) {
        mUser = user;
    }

    public Map<String, GistFile> getFiles() {
        return mFiles;
    }

    public void setFiles(Map<String, GistFile> files) {
        mFiles = files;
    }

    public boolean isTruncated() {
        return mTruncated;
    }

    public void setTruncated(boolean truncated) {
        mTruncated = truncated;
    }

    public int getComments() {
        return mComments;
    }

    public void setComments(int comments) {
        mComments = comments;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getGitPullUrl() {
        return mGitPullUrl;
    }

    public void setGitPullUrl(String gitPullUrl) {
        mGitPullUrl = gitPullUrl;
    }

    public String getGitPushUrl() {
        return mGitPushUrl;
    }

    public void setGitPushUrl(String gitPushUrl) {
        mGitPushUrl = gitPushUrl;
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
        return "Gist{"
                + "mUrl='" + mUrl
                + '\''
                + ", mForksUrl='" + mForksUrl
                + '\''
                + ", mCommitsUrl='" + mCommitsUrl
                + '\''
                + ", mId='" + mId
                + '\''
                + ", mDescription='" + mDescription
                + '\''
                + ", mPublicX=" + mPublicX
                + ", mOwner=" + mOwner
                + ", mUser='" + mUser
                + '\''
                + ", mFiles=" + mFiles
                + ", mTruncated=" + mTruncated
                + ", mComments=" + mComments
                + ", mCommentsUrl='" + mCommentsUrl
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mGitPullUrl='" + mGitPullUrl
                + '\''
                + ", mGitPushUrl='" + mGitPushUrl
                + '\''
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + '}';
    }
}
