package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Page
 * Created by SunHZ on 10/23/16.
 */
public class Page implements Serializable {

    @SerializedName("page_name")
    private String mPageName;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("summary")
    private String mSummary;
    @SerializedName("action")
    private String mAction;
    @SerializedName("sha")
    private String mSha;
    @SerializedName("html_url")
    private String mHtmlUrl;

    public String getPageName() {
        return mPageName;
    }

    public void setPageName(String pageName) {
        mPageName = pageName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public String getSha() {
        return mSha;
    }

    public void setSha(String sha) {
        mSha = sha;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    @Override
    public String toString() {
        return "Page{"
                + "mPageName='" + mPageName
                + '\''
                + ", mTitle='" + mTitle
                + '\''
                + ", mSummary=" + mSummary
                + ", mAction='" + mAction
                + '\''
                + ", mSha='" + mSha
                + '\''
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + '}';
    }
}
