package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Comment;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> commit comment event
 * Created by SunHZ on 10/23/16.
 */
public class CommitCommentEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("comment")
    private Comment mComment;

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

    @Override
    public String toString() {
        return "CommitCommentEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mComment=" + mComment
                + '}';
    }
}
