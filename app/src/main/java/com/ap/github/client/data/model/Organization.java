package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Organization
 * Created by SunHZ on 10/23/16.
 */
public class Organization implements Serializable {

    @SerializedName("login")
    private String mLogin;
    @SerializedName("id")
    private int mId;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("repos_url")
    private String mReposUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("members_url")
    private String mMembersUrl;
    @SerializedName("public_members_url")
    private String mPublicMembersUrl;
    @SerializedName("avatar_url")
    private String mAvatarUrl;

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getReposUrl() {
        return mReposUrl;
    }

    public void setReposUrl(String reposUrl) {
        mReposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public String getMembersUrl() {
        return mMembersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        mMembersUrl = membersUrl;
    }

    public String getPublicMembersUrl() {
        return mPublicMembersUrl;
    }

    public void setPublicMembersUrl(String publicMembersUrl) {
        mPublicMembersUrl = publicMembersUrl;
    }

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    @Override
    public String toString() {
        return "Organization{"
                + "mLogin='" + mLogin
                + '\''
                + ", mId=" + mId
                + ", mUrl='" + mUrl
                + '\''
                + ", mReposUrl='" + mReposUrl
                + '\''
                + ", mEventsUrl='" + mEventsUrl
                + '\''
                + ", mMembersUrl='" + mMembersUrl
                + '\''
                + ", mPublicMembersUrl='" + mPublicMembersUrl
                + '\''
                + ", mAvatarUrl='" + mAvatarUrl
                + '\''
                + '}';
    }
}
