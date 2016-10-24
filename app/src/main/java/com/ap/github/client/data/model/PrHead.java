package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Pr Head
 * Created by SunHZ on 10/23/16.
 */
public class PrHead implements Serializable {

    @SerializedName("label")
    private String mLabel;
    @SerializedName("ref")
    private String mRef;
    @SerializedName("sha")
    private String mSha;
    @SerializedName("user")
    private User mUser;
    @SerializedName("repo")
    private Repository mRepo;

    public String getLabel() {
        return mLabel;
    }

    public void setLabel(String label) {
        mLabel = label;
    }

    public String getRef() {
        return mRef;
    }

    public void setRef(String ref) {
        mRef = ref;
    }

    public String getSha() {
        return mSha;
    }

    public void setSha(String sha) {
        mSha = sha;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public Repository getRepo() {
        return mRepo;
    }

    public void setRepo(Repository repo) {
        mRepo = repo;
    }

    @Override
    public String toString() {
        return "PrHead{"
                + "mLabel='" + mLabel
                + '\''
                + ", mRef='" + mRef
                + '\''
                + ", mSha='" + mSha
                + '\''
                + ", mUser=" + mUser
                + ", mRepo=" + mRepo
                + '}';
    }
}
