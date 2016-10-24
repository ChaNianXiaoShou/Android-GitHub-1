package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.PullRequest;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> pull request event
 * Created by SunHZ on 10/23/16.
 */
public class PullRequestEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("number")
    private int mNumber;
    @SerializedName("pull_request")
    private PullRequest mPullRequest;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }

    public PullRequest getPullRequest() {
        return mPullRequest;
    }

    public void setPullRequest(PullRequest pullRequest) {
        mPullRequest = pullRequest;
    }

    @Override
    public String toString() {
        return "PullRequestEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mNumber=" + mNumber
                + ", mPullRequest=" + mPullRequest
                + '}';
    }
}
