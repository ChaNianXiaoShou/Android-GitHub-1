package com.ap.github.client.data.model.event;

import com.ap.github.client.data.model.Organization;
import com.ap.github.client.data.model.Team;
import com.ap.github.client.data.model.User;
import com.google.gson.annotations.SerializedName;

/**
 * event -> payload -> membership event
 * Created by SunHZ on 10/23/16.
 */
public class MembershipEvent extends BasePayLoad {

    @SerializedName("action")
    private String mAction;
    @SerializedName("scope")
    private String mScope;
    @SerializedName("member")
    private User mMember;
    @SerializedName("team")
    private Team mTeam;
    @SerializedName("organization")
    private Organization mOrganization;

    public String getAction() {
        return mAction;
    }

    public void setAction(String action) {
        mAction = action;
    }

    public String getScope() {
        return mScope;
    }

    public void setScope(String scope) {
        mScope = scope;
    }

    public User getMember() {
        return mMember;
    }

    public void setMember(User member) {
        mMember = member;
    }

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
        return "MembershipEvent{"
                + "mAction='" + mAction
                + '\''
                + ", mScope='" + mScope
                + '\''
                + ", mMember=" + mMember
                + ", mTeam=" + mTeam
                + ", mOrganization=" + mOrganization
                + '}';
    }
}
