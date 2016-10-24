package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * PullRequest
 * Created by SunHZ on 10/23/16.
 */
public class PullRequest implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("diff_url")
    private String mDiffUrl;
    @SerializedName("patch_url")
    private String mPatchUrl;
    @SerializedName("issue_url")
    private String mIssueUrl;
    @SerializedName("number")
    private int mNumber;
    @SerializedName("state")
    private String mState;
    @SerializedName("locked")
    private boolean mLocked;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("user")
    private User mUser;
    @SerializedName("body")
    private String mBody;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("closed_at")
    private String mClosedAt;
    @SerializedName("merged_at")
    private String mMergedAt;
    @SerializedName("merge_commit_sha")
    private String mMergeCommitSha;
    @SerializedName("assignee")
    private String mAssignee;
    @SerializedName("milestone")
    private String mMilestone;
    @SerializedName("commits_url")
    private String mCommitsUrl;
    @SerializedName("review_comments_url")
    private String mReviewCommentsUrl;
    @SerializedName("review_comment_url")
    private String mReviewCommentUrl;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("statuses_url")
    private String mStatusesUrl;
    @SerializedName("head")
    private PrHead mPrHead;
    @SerializedName("base")
    private PrBase mBase;
    @SerializedName("_links")
    private Links mLinks;
    @SerializedName("merged")
    private boolean mMerged;
    @SerializedName("mergeable")
    private String mMergeable;
    @SerializedName("mergeable_state")
    private String mMergeableState;
    @SerializedName("merged_by")
    private User mMergedBy;
    @SerializedName("comments")
    private int mComments;
    @SerializedName("review_comments")
    private int mReviewComments;
    @SerializedName("commits")
    private int mCommits;
    @SerializedName("additions")
    private int mAdditions;
    @SerializedName("deletions")
    private int mDeletions;
    @SerializedName("changed_files")
    private int mChangedFiles;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getDiffUrl() {
        return mDiffUrl;
    }

    public void setDiffUrl(String diffUrl) {
        mDiffUrl = diffUrl;
    }

    public String getPatchUrl() {
        return mPatchUrl;
    }

    public void setPatchUrl(String patchUrl) {
        mPatchUrl = patchUrl;
    }

    public String getIssueUrl() {
        return mIssueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        mIssueUrl = issueUrl;
    }

    public int getNumber() {
        return mNumber;
    }

    public void setNumber(int number) {
        mNumber = number;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public boolean isLocked() {
        return mLocked;
    }

    public void setLocked(boolean locked) {
        mLocked = locked;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
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

    public String getClosedAt() {
        return mClosedAt;
    }

    public void setClosedAt(String closedAt) {
        mClosedAt = closedAt;
    }

    public String getMergedAt() {
        return mMergedAt;
    }

    public void setMergedAt(String mergedAt) {
        mMergedAt = mergedAt;
    }

    public String getMergeCommitSha() {
        return mMergeCommitSha;
    }

    public void setMergeCommitSha(String mergeCommitSha) {
        mMergeCommitSha = mergeCommitSha;
    }

    public String getAssignee() {
        return mAssignee;
    }

    public void setAssignee(String assignee) {
        mAssignee = assignee;
    }

    public String getMilestone() {
        return mMilestone;
    }

    public void setMilestone(String milestone) {
        mMilestone = milestone;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        mCommitsUrl = commitsUrl;
    }

    public String getReviewCommentsUrl() {
        return mReviewCommentsUrl;
    }

    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        mReviewCommentsUrl = reviewCommentsUrl;
    }

    public String getReviewCommentUrl() {
        return mReviewCommentUrl;
    }

    public void setReviewCommentUrl(String reviewCommentUrl) {
        mReviewCommentUrl = reviewCommentUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        mStatusesUrl = statusesUrl;
    }

    public PrHead getPrHead() {
        return mPrHead;
    }

    public void setPrHead(PrHead prHead) {
        mPrHead = prHead;
    }

    public PrBase getBase() {
        return mBase;
    }

    public void setBase(PrBase base) {
        mBase = base;
    }

    public Links getLinks() {
        return mLinks;
    }

    public void setLinks(Links links) {
        mLinks = links;
    }

    public boolean isMerged() {
        return mMerged;
    }

    public void setMerged(boolean merged) {
        mMerged = merged;
    }

    public String getMergeable() {
        return mMergeable;
    }

    public void setMergeable(String mergeable) {
        mMergeable = mergeable;
    }

    public String getMergeableState() {
        return mMergeableState;
    }

    public void setMergeableState(String mergeableState) {
        mMergeableState = mergeableState;
    }

    public User getMergedBy() {
        return mMergedBy;
    }

    public void setMergedBy(User mergedBy) {
        mMergedBy = mergedBy;
    }

    public int getComments() {
        return mComments;
    }

    public void setComments(int comments) {
        mComments = comments;
    }

    public int getReviewComments() {
        return mReviewComments;
    }

    public void setReviewComments(int reviewComments) {
        mReviewComments = reviewComments;
    }

    public int getCommits() {
        return mCommits;
    }

    public void setCommits(int commits) {
        mCommits = commits;
    }

    public int getAdditions() {
        return mAdditions;
    }

    public void setAdditions(int additions) {
        mAdditions = additions;
    }

    public int getDeletions() {
        return mDeletions;
    }

    public void setDeletions(int deletions) {
        mDeletions = deletions;
    }

    public int getChangedFiles() {
        return mChangedFiles;
    }

    public void setChangedFiles(int changedFiles) {
        mChangedFiles = changedFiles;
    }

    @Override
    public String toString() {
        return "PullRequest{"
                + "mUrl='" + mUrl
                + '\''
                + ", mId=" + mId
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mDiffUrl='" + mDiffUrl
                + '\''
                + ", mPatchUrl='" + mPatchUrl
                + '\''
                + ", mIssueUrl='" + mIssueUrl
                + '\''
                + ", mNumber=" + mNumber
                + ", mState='" + mState
                + '\''
                + ", mLocked=" + mLocked
                + ", mTitle='" + mTitle
                + '\''
                + ", mUser=" + mUser
                + ", mBody='" + mBody
                + '\''
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mClosedAt=" + mClosedAt
                + ", mMergedAt=" + mMergedAt
                + ", mMergeCommitSha=" + mMergeCommitSha
                + ", mAssignee=" + mAssignee
                + ", mMilestone=" + mMilestone
                + ", mCommitsUrl='" + mCommitsUrl
                + '\''
                + ", mReviewCommentsUrl='" + mReviewCommentsUrl
                + '\''
                + ", mReviewCommentUrl='" + mReviewCommentUrl
                + '\''
                + ", mCommentsUrl='" + mCommentsUrl
                + '\''
                + ", mStatusesUrl='" + mStatusesUrl
                + '\''
                + ", mPrHead=" + mPrHead
                + ", mBase=" + mBase
                + ", mLinks=" + mLinks
                + ", mMerged=" + mMerged
                + ", mMergeable=" + mMergeable
                + ", mMergeableState='" + mMergeableState
                + '\''
                + ", mMergedBy=" + mMergedBy
                + ", mComments=" + mComments
                + ", mReviewComments=" + mReviewComments
                + ", mCommits=" + mCommits
                + ", mAdditions=" + mAdditions
                + ", mDeletions=" + mDeletions
                + ", mChangedFiles=" + mChangedFiles
                + '}';
    }
}
