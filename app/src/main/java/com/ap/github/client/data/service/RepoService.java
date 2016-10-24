package com.ap.github.client.data.service;

import com.ap.github.client.data.model.Event;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * event service
 * Created by SunHZ on 10/18/16.
 */
public interface RepoService {

    @GET("/events")
    Observable<List<Event>> getPublicEvent();

}
