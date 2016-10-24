package com.ap.github.client.data.datasource;

import android.app.Application;

import com.ap.github.client.common.config.GitHubConfig;
import com.ap.github.client.data.api.AccountApi;
import com.ap.github.client.data.model.User;
import com.ap.github.client.data.net.GitHubAuthRetrofit;
import com.ap.github.client.data.pref.UserPref;
import com.ap.github.client.data.request.CreateAuthorization;
import com.ap.github.client.data.response.AuthorizationResp;
import com.ap.github.client.data.service.AccountService;

import javax.inject.Inject;

import rx.Observable;
import rx.functions.Func1;

/**
 * account data source
 * Created by SunHZ on 10/17/16.
 */
public class AccountDataSource implements AccountApi {

    @Inject
    GitHubAuthRetrofit mGitHubAuthRetrofit;

    @Inject
    Application mApplication;

    @Inject
    public AccountDataSource() {
    }

    @Override
    public Observable<User> login(String username, String password) {
        mGitHubAuthRetrofit.setAuthInfo(username, password);
        final AccountService accountService = mGitHubAuthRetrofit.get().create(AccountService.class);

        CreateAuthorization createAuthorization = new CreateAuthorization();
        createAuthorization.note = GitHubConfig.NOTE;
        createAuthorization.client_id = GitHubConfig.CLIENT_ID;
        createAuthorization.client_secret = GitHubConfig.CLIENT_SECRET;
        createAuthorization.scopes = GitHubConfig.SCOPES;

        return accountService.createAuthorization(createAuthorization)
                .flatMap(new Func1<AuthorizationResp, Observable<User>>() {
                    @Override
                    public Observable<User> call(AuthorizationResp authorizationResp) {
                        String token = authorizationResp.getToken();

                        UserPref.saveLogonToken(mApplication, token);

                        return accountService.getUser(token);
                    }
                });
    }
}
