package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * GitCommit
 * Created by SunHZ on 10/23/16.
 */
public class GitCommit implements Serializable {
    @SerializedName("author")
    private User mAuthor;
    @SerializedName("committer")
    private User mCommitter;
    @SerializedName("message")
    private String mMessage;
    @SerializedName("tree")
    private SimpleCommit mTree;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("comment_count")
    private int mCommentCount;

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

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public SimpleCommit getTree() {
        return mTree;
    }

    public void setTree(SimpleCommit tree) {
        mTree = tree;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public int getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(int commentCount) {
        mCommentCount = commentCount;
    }

    @Override
    public String toString() {
        return "GitCommit{"
                + "mAuthor=" + mAuthor
                + ", mCommitter=" + mCommitter
                + ", mMessage='" + mMessage
                + '\''
                + ", mTree=" + mTree
                + ", mUrl='" + mUrl
                + '\''
                + ", mCommentCount=" + mCommentCount
                + '}';
    }
}
