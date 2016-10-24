package com.ap.github.client.presenter;

import com.ap.github.client.mvp.BaseMvpPresenter;
import com.ap.github.client.mvp.MvpView;

import rx.subscriptions.CompositeSubscription;

/**
 * rx mvp presenter
 * Created by SunHZ on 10/17/16.
 */
public class RxMvpPresenter<V extends MvpView> extends BaseMvpPresenter<V> {

    protected CompositeSubscription mCompositeSubscription;

    @Override
    public void attachView(V mvpView) {
        super.attachView(mvpView);

        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void detachView() {
        super.detachView();

        mCompositeSubscription.clear();
        mCompositeSubscription = null;
    }
}
