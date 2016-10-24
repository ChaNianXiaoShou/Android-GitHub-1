package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Commit
 * Created by SunHZ on 10/23/16.
 */
public class Commit {

    @SerializedName("id")
    private String mId;
    @SerializedName("tree_id")
    private String mTreeId;
    @SerializedName("distinct")
    private boolean mDistinct;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("timestamp")
    private String mTimestamp;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("author")
    private User mAuthor;
    @SerializedName("committer")
    private User mCommitter;
    @SerializedName("added")
    private List<String> mAdded;
    @SerializedName("removed")
    private List<String> mRemoved;
    @SerializedName("modified")
    private List<String> mModified;
    @SerializedName("sha")
    private String mSha;
    @SerializedName("commit")
    private GitCommit mCommit;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("parents")
    private List<?> mParents;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getTreeId() {
        return mTreeId;
    }

    public void setTreeId(String treeId) {
        mTreeId = treeId;
    }

    public boolean isDistinct() {
        return mDistinct;
    }

    public void setDistinct(boolean distinct) {
        mDistinct = distinct;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(String timestamp) {
        mTimestamp = timestamp;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public User getAuthor() {
        return mAuthor;
    }

    public void setAuthor(User author) {
        mAuthor = author;
    }

    public User getCommitter() {
        return mCommitter;
    }

    public void setCommitter(User committer) {
        mCommitter = committer;
    }

    public List<String> getAdded() {
        return mAdded;
    }

    public void setAdded(List<String> added) {
        mAdded = added;
    }

    public List<String> getRemoved() {
        return mRemoved;
    }

    public void setRemoved(List<String> removed) {
        mRemoved = removed;
    }

    public List<String> getModified() {
        return mModified;
    }

    public void setModified(List<String> modified) {
        mModified = modified;
    }

    public String getSha() {
        return mSha;
    }

    public void setSha(String sha) {
        mSha = sha;
    }

    public GitCommit getCommit() {
        return mCommit;
    }

    public void setCommit(GitCommit commit) {
        mCommit = commit;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public List<?> getParents() {
        return mParents;
    }

    public void setParents(List<?> parents) {
        mParents = parents;
    }

    @Override
    public String toString() {
        return "Commit{"
                + "mId='" + mId
                + '\''
                + ", mTreeId='" + mTreeId
                + '\''
                + ", mDistinct=" + mDistinct
                + ", mMessage='" + mMessage
                + '\''
                + ", mTimestamp='" + mTimestamp
                + '\''
                + ", mUrl='" + mUrl
                + '\''
                + ", mAuthor=" + mAuthor
                + ", mCommitter=" + mCommitter
                + ", mAdded=" + mAdded
                + ", mRemoved=" + mRemoved
                + ", mModified=" + mModified
                + ", mSha='" + mSha
                + '\''
                + ", mCommit=" + mCommit
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mCommentsUrl='" + mCommentsUrl
                + '\''
                + ", mParents=" + mParents
                + '}';
    }
}
