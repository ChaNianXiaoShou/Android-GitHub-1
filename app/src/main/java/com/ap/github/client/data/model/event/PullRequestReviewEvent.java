package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.PullRequest;
import com.ap.github.client.data.model.Review;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> pull request review event
 * Created by SunHZ on 10/23/16.
 */
public class PullRequestReviewEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("review")
    private Review mReview;
    @SerializedName("pull_request")
    private PullRequest mPullRequest;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public Review getReview() {
        return mReview;
    }

    public void setReview(Review review) {
        mReview = review;
    }

    public PullRequest getPullRequest() {
        return mPullRequest;
    }

    public void setPullRequest(PullRequest pullRequest) {
        mPullRequest = pullRequest;
    }

    @Override
    public String toString() {
        return "PullRequestReviewEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mReview=" + mReview
                + ", mPullRequest=" + mPullRequest
                + '}';
    }
}
