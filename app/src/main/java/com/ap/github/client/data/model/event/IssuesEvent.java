package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Issue;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> issue event
 * Created by SunHZ on 10/23/16.
 */
public class IssuesEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("issue")
    private Issue mIssue;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public Issue getIssue() {
        return mIssue;
    }

    public void setIssue(Issue issue) {
        mIssue = issue;
    }

    @Override
    public String toString() {
        return "IssuesEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mIssue=" + mIssue
                + '}';
    }
}
