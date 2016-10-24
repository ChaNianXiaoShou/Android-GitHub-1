package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Deployment;
import com.ap.github.client.data.model.DeploymentStatus;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> deployment status event
 * Created by SunHZ on 10/23/16.
 */
public class DeploymentStatusEvent extends BasePayLoad {

    @SerializedName("deployment_status")
    private DeploymentStatus mDeploymentStatus;
    @SerializedName("deployment")
    private Deployment mDeployment;

    public DeploymentStatus getDeploymentStatus() {
        return mDeploymentStatus;
    }

    public void setDeploymentStatus(DeploymentStatus deploymentStatus) {
        mDeploymentStatus = deploymentStatus;
    }

    public Deployment getDeployment() {
        return mDeployment;
    }

    public void setDeployment(Deployment deployment) {
        mDeployment = deployment;
    }

    @Override
    public String toString() {
        return "DeploymentStatusEvent{"
                + "mDeploymentStatus=" + mDeploymentStatus
                + ", mDeployment=" + mDeployment
                + '}';
    }
}
