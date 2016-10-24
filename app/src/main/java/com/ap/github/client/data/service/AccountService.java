package com.ap.github.client.data.service;

import com.ap.github.client.data.model.User;
import com.ap.github.client.data.request.CreateAuthorization;
import com.ap.github.client.data.response.AuthorizationResp;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * account service
 * Created by SunHZ on 10/17/16.
 */
public interface AccountService {

    @POST("/authorizations")
    Observable<AuthorizationResp> createAuthorization(@Body CreateAuthorization createAuthorization);

    @GET("/user")
    Observable<User> getUser(@Query("access_token") String accessToken);
}
