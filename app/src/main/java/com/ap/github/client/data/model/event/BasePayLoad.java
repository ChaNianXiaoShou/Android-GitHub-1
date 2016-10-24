package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Repository;
import com.ap.github.client.data.model.User;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * base pay load
 * Created by SunHZ on 10/22/16.
 */
public class BasePayLoad implements Serializable {

    @SerializedName("sender")
    protected User mSender;
    @SerializedName("repository")
    protected Repository mRepository;

    public User getSender() {
        return mSender;
    }

    public void setSender(User sender) {
        mSender = sender;
    }

    public Repository getRepository() {
        return mRepository;
    }

    public void setRepository(Repository repository) {
        mRepository = repository;
    }

    @Override
    public String toString() {
        return "BasePayLoad{"
                + "mSender=" + mSender
                + ", mRepository=" + mRepository
                + '}';
    }
}
