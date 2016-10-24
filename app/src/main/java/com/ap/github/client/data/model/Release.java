package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Release
 * Created by SunHZ on 10/23/16.
 */
public class Release implements Serializable {

    @SerializedName("url")
    private String mUrl;
    @SerializedName("assets_url")
    private String mAssetsUrl;
    @SerializedName("upload_url")
    private String mUploadUrl;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("id")
    private int mId;
    @SerializedName("tag_name")
    private String mTagName;
    @SerializedName("target_commitish")
    private String mTargetCommitish;
    @SerializedName("name")
    private String mName;
    @SerializedName("draft")
    private boolean mDraft;
    @SerializedName("author")
    private User mAuthor;
    @SerializedName("prerelease")
    private boolean mPrerelease;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("published_at")
    private String mPublishedAt;
    @SerializedName("tarball_url")
    private String mTarballUrl;
    @SerializedName("zipball_url")
    private String mZipballUrl;
    @SerializedName("body")
    private String mBody;
    @SerializedName("assets")
    private List<Assets> mAssets;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getAssetsUrl() {
        return mAssetsUrl;
    }

    public void setAssetsUrl(String assetsUrl) {
        mAssetsUrl = assetsUrl;
    }

    public String getUploadUrl() {
        return mUploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        mUploadUrl = uploadUrl;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getTagName() {
        return mTagName;
    }

    public void setTagName(String tagName) {
        mTagName = tagName;
    }

    public String getTargetCommitish() {
        return mTargetCommitish;
    }

    public void setTargetCommitish(String targetCommitish) {
        mTargetCommitish = targetCommitish;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public boolean isDraft() {
        return mDraft;
    }

    public void setDraft(boolean draft) {
        mDraft = draft;
    }

    public User getAuthor() {
        return mAuthor;
    }

    public void setAuthor(User author) {
        mAuthor = author;
    }

    public boolean isPrerelease() {
        return mPrerelease;
    }

    public void setPrerelease(boolean prerelease) {
        mPrerelease = prerelease;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getPublishedAt() {
        return mPublishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        mPublishedAt = publishedAt;
    }

    public String getTarballUrl() {
        return mTarballUrl;
    }

    public void setTarballUrl(String tarballUrl) {
        mTarballUrl = tarballUrl;
    }

    public String getZipballUrl() {
        return mZipballUrl;
    }

    public void setZipballUrl(String zipballUrl) {
        mZipballUrl = zipballUrl;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String body) {
        mBody = body;
    }

    public List<Assets> getAssets() {
        return mAssets;
    }

    public void setAssets(List<Assets> assets) {
        mAssets = assets;
    }

    @Override
    public String toString() {
        return "Release{"
                + "mUrl='" + mUrl
                + '\''
                + ", mAssetsUrl='" + mAssetsUrl
                + '\''
                + ", mUploadUrl='" + mUploadUrl
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mId=" + mId
                + ", mTagName='" + mTagName
                + '\''
                + ", mTargetCommitish='" + mTargetCommitish
                + '\''
                + ", mName='" + mName
                + '\''
                + ", mDraft=" + mDraft
                + ", mAuthor=" + mAuthor
                + ", mPrerelease=" + mPrerelease
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mPublishedAt='" + mPublishedAt
                + '\''
                + ", mTarballUrl='" + mTarballUrl
                + '\''
                + ", mZipballUrl='" + mZipballUrl
                + '\''
                + ", mBody='" + mBody
                + '\''
                + ", mAssets=" + mAssets
                + '}';
    }
}
