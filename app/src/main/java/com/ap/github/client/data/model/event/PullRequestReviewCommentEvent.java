package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Comment;
import com.ap.github.client.data.model.PullRequest;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> pull request review comment event
 * Created by SunHZ on 10/23/16.
 */
public class PullRequestReviewCommentEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("comment")
    private Comment mComment;
    @SerializedName("pull_request")
    private PullRequest mPullRequest;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public Comment getComment() {
        return mComment;
    }

    public void setComment(Comment comment) {
        mComment = comment;
    }

    public PullRequest getPullRequest() {
        return mPullRequest;
    }

    public void setPullRequest(PullRequest pullRequest) {
        mPullRequest = pullRequest;
    }

    @Override
    public String toString() {
        return "PullRequestReviewCommentEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mComment=" + mComment
                + ", mPullRequest=" + mPullRequest
                + '}';
    }
}
