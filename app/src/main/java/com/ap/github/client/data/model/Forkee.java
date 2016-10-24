package com.ap.github.client.data.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Forkee
 * Created by SunHZ on 10/23/16.
 */
public class Forkee implements Serializable {

    @SerializedName("id")
    private int mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("full_name")
    private String mFullName;
    @SerializedName("owner")
    private User mOwner;
    @SerializedName("private")
    private boolean mPrivateX;
    @SerializedName("html_url")
    private String mHtmlUrl;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("fork")
    private boolean mFork;
    @SerializedName("url")
    private String mUrl;
    @SerializedName("forks_url")
    private String mForksUrl;
    @SerializedName("keys_url")
    private String mKeysUrl;
    @SerializedName("collaborators_url")
    private String mCollaboratorsUrl;
    @SerializedName("teams_url")
    private String mTeamsUrl;
    @SerializedName("hooks_url")
    private String mHooksUrl;
    @SerializedName("issue_events_url")
    private String mIssueEventsUrl;
    @SerializedName("events_url")
    private String mEventsUrl;
    @SerializedName("assignees_url")
    private String mAssigneesUrl;
    @SerializedName("branches_url")
    private String mBranchesUrl;
    @SerializedName("tags_url")
    private String mTagsUrl;
    @SerializedName("blobs_url")
    private String mBlobsUrl;
    @SerializedName("git_tags_url")
    private String mGitTagsUrl;
    @SerializedName("git_refs_url")
    private String mGitRefsUrl;
    @SerializedName("trees_url")
    private String mTreesUrl;
    @SerializedName("statuses_url")
    private String mStatusesUrl;
    @SerializedName("languages_url")
    private String mLanguagesUrl;
    @SerializedName("stargazers_url")
    private String mStargazersUrl;
    @SerializedName("contributors_url")
    private String mContributorsUrl;
    @SerializedName("subscribers_url")
    private String mSubscribersUrl;
    @SerializedName("subscription_url")
    private String mSubscriptionUrl;
    @SerializedName("commits_url")
    private String mCommitsUrl;
    @SerializedName("git_commits_url")
    private String mGitCommitsUrl;
    @SerializedName("comments_url")
    private String mCommentsUrl;
    @SerializedName("issue_comment_url")
    private String mIssueCommentUrl;
    @SerializedName("contents_url")
    private String mContentsUrl;
    @SerializedName("compare_url")
    private String mCompareUrl;
    @SerializedName("merges_url")
    private String mMergesUrl;
    @SerializedName("archive_url")
    private String mArchiveUrl;
    @SerializedName("downloads_url")
    private String mDownloadsUrl;
    @SerializedName("issues_url")
    private String mIssuesUrl;
    @SerializedName("pulls_url")
    private String mPullsUrl;
    @SerializedName("milestones_url")
    private String mMilestonesUrl;
    @SerializedName("notifications_url")
    private String mNotificationsUrl;
    @SerializedName("labels_url")
    private String mLabelsUrl;
    @SerializedName("releases_url")
    private String mReleasesUrl;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("pushed_at")
    private String mPushedAt;
    @SerializedName("git_url")
    private String mGitUrl;
    @SerializedName("ssh_url")
    private String mSshUrl;
    @SerializedName("clone_url")
    private String mCloneUrl;
    @SerializedName("svn_url")
    private String mSvnUrl;
    @SerializedName("homepage")
    private String mHomepage;
    @SerializedName("size")
    private int mSize;
    @SerializedName("stargazers_count")
    private int mStargazersCount;
    @SerializedName("watchers_count")
    private int mWatchersCount;
    @SerializedName("language")
    private String mLanguage;
    @SerializedName("has_issues")
    private boolean mHasIssues;
    @SerializedName("has_downloads")
    private boolean mHasDownloads;
    @SerializedName("has_wiki")
    private boolean mHasWiki;
    @SerializedName("has_pages")
    private boolean mHasPages;
    @SerializedName("forks_count")
    private int mForksCount;
    @SerializedName("mirror_url")
    private String mMirrorUrl;
    @SerializedName("open_issues_count")
    private int mOpenIssuesCount;
    @SerializedName("forks")
    private int mForks;
    @SerializedName("open_issues")
    private int mOpenIssues;
    @SerializedName("watchers")
    private int mWatchers;
    @SerializedName("default_branch")
    private String mDefaultBranch;
    @SerializedName("public")
    private boolean mPublic;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getFullName() {
        return mFullName;
    }

    public void setFullName(String fullName) {
        mFullName = fullName;
    }

    public User getOwner() {
        return mOwner;
    }

    public void setOwner(User owner) {
        mOwner = owner;
    }

    public boolean isPrivateX() {
        return mPrivateX;
    }

    public void setPrivateX(boolean privateX) {
        mPrivateX = privateX;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public boolean isFork() {
        return mFork;
    }

    public void setFork(boolean fork) {
        mFork = fork;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getForksUrl() {
        return mForksUrl;
    }

    public void setForksUrl(String forksUrl) {
        mForksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return mKeysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        mKeysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return mCollaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        mCollaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return mTeamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        mTeamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return mHooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        mHooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return mIssueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        mIssueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return mAssigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        mAssigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return mBranchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        mBranchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return mTagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        mTagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return mBlobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        mBlobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return mGitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        mGitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return mGitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        mGitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return mTreesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        mTreesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return mStatusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        mStatusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return mLanguagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        mLanguagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return mStargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        mStargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return mContributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        mContributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return mSubscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        mSubscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return mSubscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        mSubscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return mCommitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        mCommitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return mGitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        mGitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return mCommentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        mCommentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return mIssueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        mIssueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return mContentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        mContentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return mCompareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        mCompareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mMergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        mMergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return mArchiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        mArchiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return mDownloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        mDownloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return mIssuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        mIssuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return mPullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        mPullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return mMilestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        mMilestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return mNotificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        mNotificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return mLabelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        mLabelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return mReleasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        mReleasesUrl = releasesUrl;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String getPushedAt() {
        return mPushedAt;
    }

    public void setPushedAt(String pushedAt) {
        mPushedAt = pushedAt;
    }

    public String getGitUrl() {
        return mGitUrl;
    }

    public void setGitUrl(String gitUrl) {
        mGitUrl = gitUrl;
    }

    public String getSshUrl() {
        return mSshUrl;
    }

    public void setSshUrl(String sshUrl) {
        mSshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return mCloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        mCloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return mSvnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        mSvnUrl = svnUrl;
    }

    public String getHomepage() {
        return mHomepage;
    }

    public void setHomepage(String homepage) {
        mHomepage = homepage;
    }

    public int getSize() {
        return mSize;
    }

    public void setSize(int size) {
        mSize = size;
    }

    public int getStargazersCount() {
        return mStargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        mStargazersCount = stargazersCount;
    }

    public int getWatchersCount() {
        return mWatchersCount;
    }

    public void setWatchersCount(int watchersCount) {
        mWatchersCount = watchersCount;
    }

    public String getLanguage() {
        return mLanguage;
    }

    public void setLanguage(String language) {
        mLanguage = language;
    }

    public boolean isHasIssues() {
        return mHasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        mHasIssues = hasIssues;
    }

    public boolean isHasDownloads() {
        return mHasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        mHasDownloads = hasDownloads;
    }

    public boolean isHasWiki() {
        return mHasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        mHasWiki = hasWiki;
    }

    public boolean isHasPages() {
        return mHasPages;
    }

    public void setHasPages(boolean hasPages) {
        mHasPages = hasPages;
    }

    public int getForksCount() {
        return mForksCount;
    }

    public void setForksCount(int forksCount) {
        mForksCount = forksCount;
    }

    public String getMirrorUrl() {
        return mMirrorUrl;
    }

    public void setMirrorUrl(String mirrorUrl) {
        mMirrorUrl = mirrorUrl;
    }

    public int getOpenIssuesCount() {
        return mOpenIssuesCount;
    }

    public void setOpenIssuesCount(int openIssuesCount) {
        mOpenIssuesCount = openIssuesCount;
    }

    public int getForks() {
        return mForks;
    }

    public void setForks(int forks) {
        mForks = forks;
    }

    public int getOpenIssues() {
        return mOpenIssues;
    }

    public void setOpenIssues(int openIssues) {
        mOpenIssues = openIssues;
    }

    public int getWatchers() {
        return mWatchers;
    }

    public void setWatchers(int watchers) {
        mWatchers = watchers;
    }

    public String getDefaultBranch() {
        return mDefaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        mDefaultBranch = defaultBranch;
    }

    public boolean isPublic() {
        return mPublic;
    }

    public void setPublic(boolean aPublic) {
        mPublic = aPublic;
    }

    @Override
    public String toString() {
        return "ForkEvent{"
                + "mId=" + mId
                + ", mName='" + mName
                + '\''
                + ", mFullName='" + mFullName
                + '\''
                + ", mOwner=" + mOwner
                + ", mPrivateX=" + mPrivateX
                + ", mHtmlUrl='" + mHtmlUrl
                + '\''
                + ", mDescription='" + mDescription
                + '\''
                + ", mFork=" + mFork
                + ", mUrl='" + mUrl
                + '\''
                + ", mForksUrl='" + mForksUrl
                + '\''
                + ", mKeysUrl='" + mKeysUrl
                + '\''
                + ", mCollaboratorsUrl='" + mCollaboratorsUrl
                + '\''
                + ", mTeamsUrl='" + mTeamsUrl
                + '\''
                + ", mHooksUrl='" + mHooksUrl
                + '\''
                + ", mIssueEventsUrl='" + mIssueEventsUrl
                + '\''
                + ", mEventsUrl='" + mEventsUrl
                + '\''
                + ", mAssigneesUrl='" + mAssigneesUrl
                + '\''
                + ", mBranchesUrl='" + mBranchesUrl
                + '\''
                + ", mTagsUrl='" + mTagsUrl
                + '\''
                + ", mBlobsUrl='" + mBlobsUrl
                + '\''
                + ", mGitTagsUrl='" + mGitTagsUrl
                + '\''
                + ", mGitRefsUrl='" + mGitRefsUrl
                + '\''
                + ", mTreesUrl='" + mTreesUrl
                + '\''
                + ", mStatusesUrl='" + mStatusesUrl
                + '\''
                + ", mLanguagesUrl='" + mLanguagesUrl
                + '\''
                + ", mStargazersUrl='" + mStargazersUrl
                + '\''
                + ", mContributorsUrl='" + mContributorsUrl
                + '\''
                + ", mSubscribersUrl='" + mSubscribersUrl
                + '\''
                + ", mSubscriptionUrl='" + mSubscriptionUrl
                + '\''
                + ", mCommitsUrl='" + mCommitsUrl
                + '\''
                + ", mGitCommitsUrl='" + mGitCommitsUrl
                + '\''
                + ", mCommentsUrl='" + mCommentsUrl
                + '\''
                + ", mIssueCommentUrl='" + mIssueCommentUrl
                + '\''
                + ", mContentsUrl='" + mContentsUrl
                + '\''
                + ", mCompareUrl='" + mCompareUrl
                + '\''
                + ", mMergesUrl='" + mMergesUrl
                + '\''
                + ", mArchiveUrl='" + mArchiveUrl
                + '\''
                + ", mDownloadsUrl='" + mDownloadsUrl
                + '\''
                + ", mIssuesUrl='" + mIssuesUrl
                + '\''
                + ", mPullsUrl='" + mPullsUrl
                + '\''
                + ", mMilestonesUrl='" + mMilestonesUrl
                + '\''
                + ", mNotificationsUrl='" + mNotificationsUrl
                + '\''
                + ", mLabelsUrl='" + mLabelsUrl
                + '\''
                + ", mReleasesUrl='" + mReleasesUrl
                + '\''
                + ", mCreatedAt='" + mCreatedAt
                + '\''
                + ", mUpdatedAt='" + mUpdatedAt
                + '\''
                + ", mPushedAt='" + mPushedAt
                + '\''
                + ", mGitUrl='" + mGitUrl
                + '\''
                + ", mSshUrl='" + mSshUrl
                + '\''
                + ", mCloneUrl='" + mCloneUrl
                + '\''
                + ", mSvnUrl='" + mSvnUrl
                + '\''
                + ", mHomepage='" + mHomepage
                + '\''
                + ", mSize=" + mSize
                + ", mStargazersCount=" + mStargazersCount
                + ", mWatchersCount=" + mWatchersCount
                + ", mLanguage='" + mLanguage
                + '\''
                + ", mHasIssues=" + mHasIssues
                + ", mHasDownloads=" + mHasDownloads
                + ", mHasWiki=" + mHasWiki
                + ", mHasPages=" + mHasPages
                + ", mForksCount=" + mForksCount
                + ", mMirrorUrl='" + mMirrorUrl
                + '\''
                + ", mOpenIssuesCount=" + mOpenIssuesCount
                + ", mForks=" + mForks
                + ", mOpenIssues=" + mOpenIssues
                + ", mWatchers=" + mWatchers
                + ", mDefaultBranch='" + mDefaultBranch
                + '\''
                + ", mPublic=" + mPublic
                + '}';
    }

}
