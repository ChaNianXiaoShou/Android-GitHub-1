package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.User;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> member event
 * Created by SunHZ on 10/23/16.
 */
public class MemberEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("member")
    private User mMember;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public User getMember() {
        return mMember;
    }

    public void setMember(User member) {
        mMember = member;
    }

    @Override
    public String toString() {
        return "MemberEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mMember=" + mMember
                + '}';
    }
}
