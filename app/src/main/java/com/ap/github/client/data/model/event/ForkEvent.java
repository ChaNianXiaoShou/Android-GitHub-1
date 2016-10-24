package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Forkee;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> fork event
 * Created by SunHZ on 10/23/16.
 */
public class ForkEvent extends BasePayLoad {

    @SerializedName("forkee")
    private Forkee mForkee;

    public Forkee getForkee() {
        return mForkee;
    }

    public void setForkee(Forkee forkee) {
        mForkee = forkee;
    }

    @Override
    public String toString() {
        return "ForkEvent{"
                + "mForkee=" + mForkee
                + '}';
    }
}
