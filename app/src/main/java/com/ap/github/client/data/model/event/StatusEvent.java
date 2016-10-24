package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Branch;
import com.ap.github.client.data.model.Commit;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * event -> payload -> status event
 * Created by SunHZ on 10/23/16.
 */
public class StatusEvent extends BasePayLoad {

    @SerializedName("id")
    private int mId;
    @SerializedName("sha")
    private String mSha;
    @SerializedName("name")
    private String mName;
    @SerializedName("target_url")
    private String mTargetUrl;
    @SerializedName("context")
    private String mContext;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("state")
    private String mState;
    @SerializedName("commit")
    private Commit mCommit;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("branches")
    private List<Branch> mBranches;

}
