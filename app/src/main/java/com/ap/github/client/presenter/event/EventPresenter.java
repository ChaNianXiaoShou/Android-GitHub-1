package com.ap.github.client.presenter.event;

import com.ap.github.client.data.api.RepoApi;
import com.ap.github.client.data.model.Event;
import com.ap.github.client.mvp.lce.LceView;
import com.ap.github.client.presenter.RxMvpPresenter;

import java.util.List;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * event persenter
 * Created by SunHZ on 10/18/16.
 */
public class EventPresenter extends RxMvpPresenter<LceView<List<Event>>> {

    private final RepoApi mRepoApi;

    @Inject
    public EventPresenter(RepoApi repoApi) {
        mRepoApi = repoApi;
    }

    public void getPublicEvent() {
        mCompositeSubscription.add(mRepoApi.getPublicEvent()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(() -> getMvpView().showLoading())
                .doOnTerminate(() -> getMvpView().dismissLoading())
                .subscribe(events -> {
                            if (events == null || events.isEmpty()) {
                                getMvpView().showEmpty();
                            } else {
                                getMvpView().showContent(events);
                            }
                        }, throwable -> {
                            getMvpView().showError(throwable);
                        }
                ));
    }
}
