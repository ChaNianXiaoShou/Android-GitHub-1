package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Gist;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> gist event
 * Created by SunHZ on 10/23/16.
 */
public class GistEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("gist")
    private Gist mGist;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public Gist getGist() {
        return mGist;
    }

    public void setGist(Gist gist) {
        mGist = gist;
    }

    @Override
    public String toString() {
        return "GistEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mGist=" + mGist
                + '}';
    }
}
