package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Comment;
import com.ap.github.client.data.model.Issue;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> issue comment event
 * Created by SunHZ on 10/23/16.
 */
public class IssueCommentEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("issue")
    private Issue mIssue;
    @SerializedName("comment")
    private Comment mComment;

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

    public Comment getComment() {
        return mComment;
    }

    public void setComment(Comment comment) {
        mComment = comment;
    }

    @Override
    public String toString() {
        return "IssueCommentEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mIssue=" + mIssue
                + ", mComment=" + mComment
                + '}';
    }
}
