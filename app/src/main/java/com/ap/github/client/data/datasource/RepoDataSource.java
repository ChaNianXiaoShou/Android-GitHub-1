package com.ap.github.client.data.datasource;

import com.ap.github.client.data.api.RepoApi;
import com.ap.github.client.data.model.Event;
import com.ap.github.client.data.service.RepoService;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

/**
 * event data source
 * Created by SunHZ on 10/18/16.
 */
public class RepoDataSource implements RepoApi {

    private final RepoService mRepoService;

    @Inject
    public RepoDataSource(RepoService repoService) {
        mRepoService = repoService;
    }

    @Override
    public Observable<List<Event>> getPublicEvent() {
        return mRepoService.getPublicEvent();
    }
}
