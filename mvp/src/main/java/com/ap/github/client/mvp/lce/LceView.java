package com.ap.github.client.mvp.lce;

import android.support.annotation.UiThread;

import com.ap.github.client.mvp.MvpView;

/**
 * lce view
 * Created by SunHZ on 10/17/16.
 */
public interface LceView<M> extends MvpView {

    @UiThread
    void showLoading();

    @UiThread
    void dismissLoading();

    @UiThread
    void showContent(M data);

    @UiThread
    void showError(Throwable e);

    @UiThread
    void showEmpty();

}
