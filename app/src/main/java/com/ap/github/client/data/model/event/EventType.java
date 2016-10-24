package com.ap.github.client.data.model.event;

/**
 * EventType
 *
 * @link https://developer.github.com/v3/activity/events/types/
 * Created by SunHZ on 10/23/16.
 */
public enum EventType {

    // used
    CommitCommentEvent(CommitCommentEvent.class),
    CreateEvent(CreateEvent.class),
    DeleteEvent(DeleteEvent.class),
    ForkEvent(ForkEvent.class),
    GollumEvent(GollumEvent.class),
    IssueCommentEvent(IssueCommentEvent.class),
    IssuesEvent(IssuesEvent.class),
    MemberEvent(MemberEvent.class),
    PublicEvent(PublicEvent.class),
    PullRequestEvent(PullRequestEvent.class),
    PullRequestReviewCommentEvent(PullRequestReviewCommentEvent.class),
    PushEvent(PushEvent.class),
    ReleaseEvent(ReleaseEvent.class),
    WatchEvent(WatchEvent.class),

    // not used
    RepositoryEvent(RepositoryEvent.class),
    StatusEvent(StatusEvent.class),
    TeamAddEvent(TeamAddEvent.class),
    PullRequestReviewEvent(PullRequestReviewEvent.class),
    MembershipEvent(MembershipEvent.class),
    PageBuildEvent(PageBuildEvent.class),
    ForkApplyEvent(ForkApplyEvent.class),
    GistEvent(GistEvent.class),
    DeploymentEvent(DeploymentEvent.class),
    DeploymentStatusEvent(DeploymentStatusEvent.class),
    DownloadEvent(DownloadEvent.class),
    FollowEvent(FollowEvent.class),


    CommonEvent(BasePayLoad.class);

    private final Class mClazz;

    EventType(Class clazz) {
        mClazz = clazz;
    }

    public Class getClazz() {
        return mClazz;
    }
}
