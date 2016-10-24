package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Organization;
import com.ap.github.client.data.model.Team;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> team add event
 * Created by SunHZ on 10/23/16.
 */
public class TeamAddEvent extends BasePayLoad {

    @SerializedName("team")
    private Team mTeam;
    @SerializedName("organization")
    private Organization mOrganization;

    public Team getTeam() {
        return mTeam;
    }

    public void setTeam(Team team) {
        mTeam = team;
    }

    public Organization getOrganization() {
        return mOrganization;
    }

    public void setOrganization(Organization organization) {
        mOrganization = organization;
    }

    @Override
    public String toString() {
        return "TeamAddEvent{"
                + "mTeam=" + mTeam
                + ", mOrganization=" + mOrganization
                + '}';
    }
}
