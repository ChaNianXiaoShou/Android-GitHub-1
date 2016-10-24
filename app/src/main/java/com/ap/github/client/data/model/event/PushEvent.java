package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Commit;
import com.ap.github.client.data.model.User;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * event -> payload -> push event
 * Created by SunHZ on 10/23/16.
 */
public class PushEvent extends BasePayLoad {

    @SerializedName("ref")
    private String mRef;
    @SerializedName("before")
    private String mBefore;
    @SerializedName("after")
    private String mAfter;
    @SerializedName("created")
    private boolean mCreated;
    @SerializedName("deleted")
    private boolean mDeleted;
    @SerializedName("forced")
    private boolean mForced;
    @SerializedName("base_ref")
    private String mBaseRef;
    @SerializedName("compare")
    private String mCompare;
    @SerializedName("commits")
    private List<Commit> mCommits;
    @SerializedName("head_commit")
    private Commit mHeadCommit;
    @SerializedName("pusher")
    private User mPusher;

    public String getRef() {
        return mRef;
    }

    public void setRef(String ref) {
        mRef = ref;
    }

    public String getBefore() {
        return mBefore;
    }

    public void setBefore(String before) {
        mBefore = before;
    }

    public String getAfter() {
        return mAfter;
    }

    public void setAfter(String after) {
        mAfter = after;
    }

    public boolean isCreated() {
        return mCreated;
    }

    public void setCreated(boolean created) {
        mCreated = created;
    }

    public boolean isDeleted() {
        return mDeleted;
    }

    public void setDeleted(boolean deleted) {
        mDeleted = deleted;
    }

    public boolean isForced() {
        return mForced;
    }

    public void setForced(boolean forced) {
        mForced = forced;
    }

    public String getBaseRef() {
        return mBaseRef;
    }

    public void setBaseRef(String baseRef) {
        mBaseRef = baseRef;
    }

    public String getCompare() {
        return mCompare;
    }

    public void setCompare(String compare) {
        mCompare = compare;
    }

    public List<Commit> getCommits() {
        return mCommits;
    }

    public void setCommits(List<Commit> commits) {
        mCommits = commits;
    }

    public Commit getHeadCommit() {
        return mHeadCommit;
    }

    public void setHeadCommit(Commit headCommit) {
        mHeadCommit = headCommit;
    }

    public User getPusher() {
        return mPusher;
    }

    public void setPusher(User pusher) {
        mPusher = pusher;
    }

    @Override
    public String toString() {
        return "PushEvent{"
                + "mRef='" + mRef
                + '\''
                + ", mBefore='" + mBefore
                + '\''
                + ", mAfter='" + mAfter
                + '\''
                + ", mCreated=" + mCreated
                + ", mDeleted=" + mDeleted
                + ", mForced=" + mForced
                + ", mBaseRef='" + mBaseRef
                + '\''
                + ", mCompare='" + mCompare
                + '\''
                + ", mCommits=" + mCommits
                + ", mHeadCommit=" + mHeadCommit
                + ", mPusher=" + mPusher
                + '}';
    }
}
