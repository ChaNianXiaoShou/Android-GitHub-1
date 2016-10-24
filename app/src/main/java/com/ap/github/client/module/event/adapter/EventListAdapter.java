package com.ap.github.client.module.event.adapter;

import android.graphics.Color;
import android.text.Html;
import android.text.TextUtils;

import com.ap.github.client.R;
import com.ap.github.client.common.util.ImageUtil;
import com.ap.github.client.data.model.Event;
import com.ap.github.client.data.model.Page;
import com.ap.github.client.data.model.event.CommitCommentEvent;
import com.ap.github.client.data.model.event.CreateEvent;
import com.ap.github.client.data.model.event.DeleteEvent;
import com.ap.github.client.data.model.event.ForkEvent;
import com.ap.github.client.data.model.event.GollumEvent;
import com.ap.github.client.data.model.event.IssueCommentEvent;
import com.ap.github.client.data.model.event.IssuesEvent;
import com.ap.github.client.data.model.event.MemberEvent;
import com.ap.github.client.data.model.event.PullRequestEvent;
import com.ap.github.client.data.model.event.PullRequestReviewCommentEvent;
import com.ap.github.client.data.model.event.PushEvent;
import com.ap.github.client.data.model.event.ReleaseEvent;
import com.ap.github.client.data.model.event.WatchEvent;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.octicons_typeface_library.Octicons;

import java.util.List;

/**
 * event list adapter
 * Created by SunHZ on 10/18/16.
 */
public class EventListAdapter extends BaseQuickAdapter<Event> {

    public EventListAdapter() {
        super(R.layout.item_event, null);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, Event event) {
        ImageUtil.loadImage(mContext, event.getActor().getAvatarUrl(), baseViewHolder.getView(R.id.iv_user_avatar),
                new IconicsDrawable(mContext)
                        .icon(Octicons.Icon.oct_person)
                        .color(Color.RED)
                        .sizeDp(50));
        baseViewHolder.setText(R.id.tv_event_desc, Html.fromHtml(getDesc(event)));
        baseViewHolder.setText(R.id.tv_event_date, event.getCreatedAt());
    }

    private String getDesc(Event event) {
        String desc;

        switch (event.getType()) {
            case CommitCommentEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + "commented on commit "
                        + "<b>"
                        + event.getRepo().getName()
                        + "@"
                        + ((CommitCommentEvent) event.getPayLoad()).getComment().getCommitId().substring(0, 10)
                        + "</b>";
                break;
            }

            case CreateEvent: {
                if (TextUtils.isEmpty(((CreateEvent) event.getPayLoad()).getRef())) {
                    desc = "<b>" + event.getActor().getLogin() + "</b>" + " " + "created repository" + " " + "<b>" + event.getRepo().getName() + "</b>";
                } else {
                    desc = "<b>"
                            + event.getActor().getLogin()
                            + "</b>"
                            + " "
                            + "created branch <b>"
                            + ((CreateEvent) event.getPayLoad()).getRef()
                            + "</b> on repository"
                            + " "
                            + "<b>"
                            + event.getRepo().getName()
                            + "</b>";
                }
                break;
            }

            case DeleteEvent: {
                String deletedThing = "repository";
                if (!TextUtils.isEmpty(((DeleteEvent) event.getPayLoad()).getRef())) {
                    deletedThing = "branch <b>" + ((DeleteEvent) event.getPayLoad()).getRef() + "</b> at ";
                }

                desc = "<b>" + event.getActor().getLogin() + "</b>" + " " + "deleted " + deletedThing + "<b>" + event.getRepo().getName() + "</b>";
                break;
            }

            case ForkEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + "forked"
                        + " <b>"
                        + event.getRepo().getName()
                        + "</b>"
                        + " "
                        + "to"
                        + " "
                        + "<b>"
                        + ((ForkEvent) event.getPayLoad()).getForkee().getFullName()
                        + "</b>";
                break;
            }

            case GollumEvent: {
                GollumEvent gollumEvent = (GollumEvent) event.getPayLoad();
                if (gollumEvent.getPages() != null) {
                    List<Page> pages = gollumEvent.getPages();
                    if (pages.size() == 1) {
                        desc = "<b>" + event.getActor().getLogin() + "</b>" + " " + pages.get(0).getAction() + " the <b>" + event.getRepo().getName() + "</b> wiki";
                    } else {
                        desc = "<b>" + event.getActor().getLogin() + "</b>" + " updated the <b>" + event.getRepo().getName() + "</b> wiki";
                    }
                } else {
                    desc = "<b>" + event.getActor().getLogin() + "</b>";
                }
                break;
            }

            case IssueCommentEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + "commented on issue"
                        + " "
                        + "<b>"
                        + event.getActor().getName()
                        + "#"
                        + ((IssueCommentEvent) event.getPayLoad()).getIssue().getNumber()
                        + "</b>";
                break;
            }

            case IssuesEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + ((IssuesEvent) event.getPayLoad()).getAction()
                        + " "
                        + "<b>"
                        + event.getRepo().getName()
                        + "#"
                        + ((IssuesEvent) event.getPayLoad()).getIssue().getNumber()
                        + "</b>";
                break;
            }

            case MemberEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + ((MemberEvent) event.getPayLoad()).getAction()
                        + " "
                        + "<b>"
                        + ((MemberEvent) event.getPayLoad()).getMember().getLogin()
                        + "</b>"
                        + " "
                        + " to "
                        + event.getRepo().getName();
                break;
            }

            case PublicEvent:
                if (event.getRepo() != null) {
                    desc = "<b>" + event.getActor().getLogin() + "</b>" + " " + "made <b>" + event.getRepo().getName() + "</b> public";
                } else {
                    desc = getCommonDesc(event);
                }
                break;

            case PullRequestEvent: {
                PullRequestEvent pullRequestEvent = (PullRequestEvent) event.getPayLoad();
                String action = pullRequestEvent.getAction();

                if (pullRequestEvent.getPullRequest().isMerged()) {
                    action = "merged";
                }

                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + action
                        + " pull request"
                        + " "
                        + "<b>"
                        + event.getRepo().getName()
                        + "#"
                        + pullRequestEvent.getPullRequest().getNumber()
                        + "</b>";
                break;
            }

            case PullRequestReviewCommentEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + "commented on "
                        + " "
                        + "<b>"
                        + event.getRepo().getName()
                        + "#"
                        + ((PullRequestReviewCommentEvent) event.getPayLoad()).getPullRequest().getNumber()
                        + "</b>";
                break;
            }

            case PushEvent: {

                String ref = ((PushEvent) event.getPayLoad()).getRef();
                String[] refs = ref.split("/");
                if (refs.length > 1) {
                    ref = refs[refs.length - 1];
                } else if (refs.length == 1) {
                    ref = refs[0];
                }

                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + "pushed to"
                        + " "
                        + "<b>"
                        + ref
                        + "</b>"
                        + " "
                        + "at"
                        + " "
                        + "<b>"
                        + event.getRepo().getName()
                        + "</b>";
                break;
            }

            case ReleaseEvent: {
                desc = "<b>"
                        + event.getActor().getLogin()
                        + "</b>"
                        + " "
                        + ((ReleaseEvent) event.getPayLoad()).getAction()
                        + " "
                        + "<b>"
                        + ((ReleaseEvent) event.getPayLoad()).getRelease().getTagName()
                        + "</b>"
                        + " "
                        + "at"
                        + " "
                        + "<b>"
                        + event.getRepo().getName()
                        + "</b>";
                break;
            }

            case WatchEvent: {
                if (((WatchEvent) event.getPayLoad()).getAction().equalsIgnoreCase("started")) {
                    desc = "<b>" + event.getActor().getLogin() + "</b>" + " " + "starred " + "<b>" + event.getRepo().getName() + "</b>";
                } else {
                    desc = "<b>" + event.getActor().getLogin() + "</b>" + " " + "watched " + "<b>" + event.getRepo().getName() + "</b>";
                }
                break;
            }

            default:
                desc = getCommonDesc(event);
                break;
        }

        return desc;
    }

    private String getCommonDesc(Event event) {
        return "<b>" + event.getActor().getLogin() + "</b>" + " " + "operates on " + "<b>" + event.getRepo().getName() + "</b>";
    }
}
