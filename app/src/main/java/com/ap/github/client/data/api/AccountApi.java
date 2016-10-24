package com.ap.github.client.data.api;

import com.ap.github.client.data.model.User;

import rx.Observable;

/**
 * account api
 * Created by SunHZ on 10/17/16.
 */
public interface AccountApi {

    /**
     * login
     */
    Observable<User> login(String username, String password);
}
