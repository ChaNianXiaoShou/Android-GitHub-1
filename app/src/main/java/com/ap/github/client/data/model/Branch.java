package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Branch
 * Created by SunHZ on 10/23/16.
 */
public class Branch implements Serializable {
    @SerializedName("name")
    private String mName;
    @SerializedName("commit")
    private SimpleCommit mCommit;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public SimpleCommit getCommit() {
        return mCommit;
    }

    public void setCommit(SimpleCommit commit) {
        mCommit = commit;
    }

    @Override
    public String toString() {
        return "Branch{"
                + "mName='" + mName
                + '\''
                + ", mCommit=" + mCommit
                + '}';
    }
}
