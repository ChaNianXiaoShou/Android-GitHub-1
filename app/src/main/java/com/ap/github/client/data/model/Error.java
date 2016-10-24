package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Error
 * Created by SunHZ on 10/23/16.
 */
public class Error implements Serializable {
    @SerializedName("message")
    private String mMessage;

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    @Override
    public String toString() {
        return "Error{"
                + "mMessage=" + mMessage
                + '}';
    }
}
