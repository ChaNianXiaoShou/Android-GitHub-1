package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Organization;
import com.ap.github.client.data.model.Repository;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> repository event
 * Created by SunHZ on 10/23/16.
 */
public class RepositoryEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("repository")
    private Repository mRepository;
    @SerializedName("organization")
    private Organization mOrganization;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    @Override
    public Repository getRepository() {
        return mRepository;
    }

    @Override
    public void setRepository(Repository repository) {
        mRepository = repository;
    }

    public Organization getOrganization() {
        return mOrganization;
    }

    public void setOrganization(Organization organization) {
        mOrganization = organization;
    }

    @Override
    public String toString() {
        return "RepositoryEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mRepository=" + mRepository
                + ", mOrganization=" + mOrganization
                + '}';
    }
}
