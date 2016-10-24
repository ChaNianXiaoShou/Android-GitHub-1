package com.ap.github.client.data.model;

import com.ap.github.client.common.util.GsonUtil;
import com.ap.github.client.data.model.event.EventType;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Event
 * Created by SunHZ on 10/17/16.
 */
public class Event implements Serializable {

    @SerializedName("id")
    private String mId;
    @SerializedName("type")
    private EventType mType;
    @SerializedName("actor")
    private User mActor;
    @SerializedName("repo")
    private Repo mRepo;
    @SerializedName("payload")
    private Object mPayLoad;
    @SerializedName("public")
    private boolean mPublic;
    @SerializedName("created_at")
    private String mCreatedAt;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public EventType getType() {
        return mType;
    }

    public void setType(EventType type) {
        mType = type;
    }

    public User getActor() {
        return mActor;
    }

    public void setActor(User actor) {
        mActor = actor;
    }

    public Repo getRepo() {
        return mRepo;
    }

    public void setRepo(Repo repo) {
        mRepo = repo;
    }

    public Object getPayLoad() {
        return GsonUtil.getGson().fromJson(GsonUtil.getGson().toJson(mPayLoad), mType.getClazz());
    }

    public void setPayLoad(String payLoad) {
        mPayLoad = payLoad;
    }

    public boolean isPublic() {
        return mPublic;
    }

    public void setPublic(boolean aPublic) {
        mPublic = aPublic;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    @Override
    public String toString() {
        return "Event{"
                + "mId='" + mId
                + '\''
                + ", mType='" + mType.name()
                + '\''
                + ", mActor=" + mActor
                + ", mRepo=" + mRepo
                + ", mPayload=" + mPayLoad
                + ", mPublic=" + mPublic
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + '}';
    }
}
