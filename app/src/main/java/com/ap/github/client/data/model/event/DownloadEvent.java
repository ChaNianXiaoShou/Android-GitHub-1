package com.ap.github.client.data.model.event;

import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> download event
 * Created by SunHZ on 10/23/16.
 */
public class DownloadEvent extends BasePayLoad {

    @SerializedName("download")
    private Object mDownload;

    public Object getDownload() {
        return mDownload;
    }

    public void setDownload(Object download) {
        mDownload = download;
    }

    @Override
    public String toString() {
        return "DownloadEvent{"
                + "mDownload='" + mDownload
                + '\''
                + '}';
    }
}
