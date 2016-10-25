package com.ap.github.client.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ap.github.client.ClientApplication;
import com.ap.github.client.data.model.Event;
import com.ap.github.client.data.pref.AppPref;
import com.ap.github.client.di.HasComponent;
import com.ap.github.client.di.component.DaggerRepoComponent;
import com.ap.github.client.di.component.RepoComponent;
import com.ap.github.client.di.module.ActivityModule;
import com.ap.github.client.di.module.RepoModule;
import com.ap.github.client.module.event.adapter.EventListAdapter;
import com.ap.github.client.presenter.event.EventPresenter;
import com.ap.github.client.ui.base.BaseListActivity;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends BaseListActivity<List<Event>> implements HasComponent<RepoComponent> {

    public static void launch(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Inject
    EventPresenter mEventPresenter;

    final EventListAdapter mEventListAdapter = new EventListAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getComponent().inject(this);
        mEventPresenter.attachView(this);
        mEventPresenter.getPublicEvent();

        AppPref.setAlreadyRun(mContext);
    }

    @Override
    protected RecyclerView.Adapter createAdapter() {
        return mEventListAdapter;
    }

    @Override
    protected void onDestroy() {
        mEventPresenter.detachView();
        super.onDestroy();
    }

    @Override
    public void onRefresh() {
        mEventPresenter.getPublicEvent();
    }

    @Override
    public void reloadData(View emptyRootView) {
        mEventPresenter.getPublicEvent();
    }

    @Override
    public void showContent(List<Event> data) {
        super.showContent(data);
        mEventListAdapter.setNewData(data);
    }

    @Override
    public void showError(Throwable e) {
        super.showError(e);
        Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
    }


    @Override
    public RepoComponent getComponent() {
        return DaggerRepoComponent.builder()
                .applicationComponent(ClientApplication.get(mContext).getComponent())
                .activityModule(new ActivityModule(this))
                .repoModule(new RepoModule())
                .build();
    }
}