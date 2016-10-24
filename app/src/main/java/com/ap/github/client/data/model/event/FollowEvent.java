package com.ap.github.client.data.model.event;

import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> follow event
 * Created by SunHZ on 10/23/16.
 */
public class FollowEvent extends BasePayLoad {

    @SerializedName("target")
    private Object mTarget;

    public Object getTarget() {
        return mTarget;
    }

    public void setTarget(Object target) {
        mTarget = target;
    }

    @Override
    public String toString() {
        return "FollowEvent{"
                + "mTarget='" + mTarget
                + '\''
                + '}';
    }
}
