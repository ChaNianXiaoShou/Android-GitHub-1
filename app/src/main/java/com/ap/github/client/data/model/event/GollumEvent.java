package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Page;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * event -> payload -> gollum event
 * Created by SunHZ on 10/23/16.
 */
public class GollumEvent extends BasePayLoad {

    @SerializedName("pages")
    private List<Page> mPages;

    public List<Page> getPages() {
        return mPages;
    }

    public void setPages(List<Page> pages) {
        mPages = pages;
    }

    @Override
    public String toString() {
        return "GollumEvent{"
                + "mPages=" + mPages
                + '}';
    }
}
