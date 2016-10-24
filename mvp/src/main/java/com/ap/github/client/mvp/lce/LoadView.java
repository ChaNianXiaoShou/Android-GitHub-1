package com.ap.github.client.mvp.lce;

import android.support.annotation.UiThread;

import com.ap.github.client.mvp.MvpView;

/**
 * load view
 * Created by SunHZ on 10/17/16.
 */
public interface LoadView extends MvpView {

    @UiThread
    void showLoading();

    @UiThread
    void dismissLoading();

    @UiThread
    void error(Throwable e);

}
