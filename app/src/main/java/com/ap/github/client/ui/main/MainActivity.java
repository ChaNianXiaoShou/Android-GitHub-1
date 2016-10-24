package com.ap.github.client.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.ap.github.client.ClientApplication;
import com.ap.github.client.R;
import com.ap.github.client.data.model.Event;
import com.ap.github.client.data.pref.AppPref;
import com.ap.github.client.di.HasComponent;
import com.ap.github.client.di.component.DaggerRepoComponent;
import com.ap.github.client.di.component.RepoComponent;
import com.ap.github.client.di.module.ActivityModule;
import com.ap.github.client.di.module.RepoModule;
import com.ap.github.client.module.event.adapter.EventListAdapter;
import com.ap.github.client.mvp.lce.LceView;
import com.ap.github.client.presenter.event.EventPresenter;
import com.ap.github.client.ui.base.BaseLoadingActivity;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseLoadingActivity implements HasComponent<RepoComponent>, LceView<List<Event>> {

    final EventListAdapter mEventListAdapter = new EventListAdapter();
    @BindView(R.id.rl_content_list)
    RecyclerView mRlContentList;
    @BindView(R.id.srl_refresh)
    SwipeRefreshLayout mSrlRefresh;
    @Inject
    EventPresenter mEventPresenter;

    public static void launch(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getComponent().inject(this);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mEventPresenter.attachView(this);

        initView();

        AppPref.setAlreadyRun(mContext);

        mEventPresenter.getPublicEvent();
    }

    private void initView() {
        mRlContentList.setLayoutManager(new LinearLayoutManager(mContext));
        mRlContentList.setAdapter(mEventListAdapter);
    }

    @Override
    protected void onDestroy() {
        mEventPresenter.detachView();
        super.onDestroy();
    }

    @Override
    public RepoComponent getComponent() {
        return DaggerRepoComponent.builder()
                .applicationComponent(ClientApplication.get(mContext).getComponent())
                .activityModule(new ActivityModule(this))
                .repoModule(new RepoModule())
                .build();
    }

    @Override
    public void showContent(List<Event> data) {
        mEventListAdapter.setNewData(data);
    }

    @Override
    public void showError(Throwable e) {
        Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showEmpty() {
    }
}