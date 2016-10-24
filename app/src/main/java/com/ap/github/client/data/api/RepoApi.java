package com.ap.github.client.data.api;

import com.ap.github.client.data.model.Event;

import java.util.List;

import rx.Observable;

/**
 * event api
 * Created by SunHZ on 10/18/16.
 */
public interface RepoApi {

    Observable<List<Event>> getPublicEvent();
}
