package com.ap.github.client.presenter.account;

import android.app.Application;

import com.ap.github.client.data.api.AccountApi;
import com.ap.github.client.data.pref.UserPref;
import com.ap.github.client.module.account.view.LoginView;
import com.ap.github.client.presenter.RxMvpPresenter;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * login presenter
 * Created by SunHZ on 10/17/16.
 */
public class LoginPresenter extends RxMvpPresenter<LoginView> {

    private final AccountApi mAccountApi;
    @Inject
    Application mApplication;

    @Inject
    public LoginPresenter(AccountApi accountApi) {
        mAccountApi = accountApi;
    }

    public void login(String username, String password) {
        mCompositeSubscription.add(mAccountApi.login(username, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(() -> getMvpView().showLoading())
                .doOnTerminate(() -> getMvpView().dismissLoading())
                .subscribe(user -> {
                            UserPref.saveLogonUser(mApplication, user);
                            getMvpView().loginSuccess(user);
                        }, throwable -> {
                            getMvpView().error(throwable);
                        }
                ));
    }
}
