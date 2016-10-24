package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Team
 * Created by SunHZ on 10/23/16.
 */
public class Team implements Serializable {

    @SerializedName("name")
    private String mName;
    @SerializedName("id")
    private int mId;
    @SerializedName("slug")
    private String mSlug;
    @SerializedName("permission")
    private String mPermission;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("members_url")
    private String mMembersUrl;
    @SerializedName("repositories_url")
    private String mRepositoriesUrl;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String slug) {
        mSlug = slug;
    }

    public String getPermission() {
        return mPermission;
    }

    public void setPermission(String permission) {
        mPermission = permission;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getMembersUrl() {
        return mMembersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        mMembersUrl = membersUrl;
    }

    public String getRepositoriesUrl() {
        return mRepositoriesUrl;
    }

    public void setRepositoriesUrl(String repositoriesUrl) {
        mRepositoriesUrl = repositoriesUrl;
    }

    @Override
    public String toString() {
        return "Team{"
                + "mName='" + mName
                + '\''
                + ", mId=" + mId
                + ", mSlug='" + mSlug
                + '\''
                + ", mPermission='" + mPermission
                + '\''
                + ", mUrl='" + mUrl
                + '\''
                + ", mMembersUrl='" + mMembersUrl
                + '\''
                + ", mRepositoriesUrl='" + mRepositoriesUrl
                + '\''
                + '}';
    }
}
