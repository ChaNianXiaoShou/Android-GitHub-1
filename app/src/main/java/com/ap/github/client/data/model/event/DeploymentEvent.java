package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Deployment;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> deployment event
 * Created by SunHZ on 10/23/16.
 */
public class DeploymentEvent extends BasePayLoad {

    @SerializedName("deployment")
    private Deployment mDeployment;

    public Deployment getDeployment() {
        return mDeployment;
    }

    public void setDeployment(Deployment deployment) {
        mDeployment = deployment;
    }

    @Override
    public String toString() {
        return "DeploymentEvent{"
                + "mDeployment=" + mDeployment
                + '}';
    }
}
