package com.ap.github.client.ui.base;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ap.github.client.R;
import com.ap.github.client.mvp.lce.LceView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * base loading activity
 * Created by SunHZ on 10/17/16.
 */
public abstract class BaseListActivity<M> extends BaseActivity implements LceView<M>, SwipeRefreshLayout.OnRefreshListener {

    @BindView(R.id.rv_data_list)
    RecyclerView mRvDataList;
    @BindView(R.id.srl_root_view)
    SwipeRefreshLayout mSrlRootView;
    @BindView(R.id.iv_empty_image)
    ImageView mIvEmptyImage;
    @BindView(R.id.tv_empty_text)
    TextView mTvEmptyText;
    @BindView(R.id.ll_empty)
    LinearLayout mLlEmpty;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_base_list);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        mSrlRootView.setOnRefreshListener(this);

        mRvDataList.setLayoutManager(new LinearLayoutManager(mContext));
        mRvDataList.setAdapter(createAdapter());
    }

    protected abstract RecyclerView.Adapter createAdapter();

    @OnClick(R.id.ll_empty)
    public abstract void reloadData(View emptyRootView);

    @Override
    public void showLoading() {
        mSrlRootView.post(() -> mSrlRootView.setRefreshing(true));
    }

    @Override
    public void dismissLoading() {
        mSrlRootView.post(() -> mSrlRootView.setRefreshing(false));
    }

    @CallSuper
    @Override
    public void showContent(M data) {
        dismissLoading();
        hideEmptyView();
    }

    @CallSuper
    @Override
    public void showError(Throwable e) {
        dismissLoading();

    }


    @CallSuper
    @Override
    public void showEmpty() {
        dismissLoading();

        setEmptyText();
        setEmptyDrawable();

        showEmptyView();
    }

    private void showEmptyView() {
        mLlEmpty.setVisibility(View.VISIBLE);
    }

    private void hideEmptyView() {
        mLlEmpty.setVisibility(View.GONE);
    }

    private void setEmptyText() {
        if (!TextUtils.isEmpty(getEmptyText())) {
            mTvEmptyText.setText(getEmptyText());
        } else if (getEmptyTextRes() != 0) {
            mTvEmptyText.setText(getEmptyTextRes());
        }
    }

    private void setEmptyDrawable() {
        if (getEmptyDrawable() != null) {
            mIvEmptyImage.setBackgroundDrawable(getEmptyDrawable());
        } else if (getEmptyDrawableRes() != 0) {
            mIvEmptyImage.setBackgroundResource(getEmptyDrawableRes());
        }
    }

    public String getEmptyText() {
        return null;
    }

    public Drawable getEmptyDrawable() {
        return null;
    }

    @StringRes
    public int getEmptyTextRes() {
        return 0;
    }

    @DrawableRes
    public int getEmptyDrawableRes() {
        return 0;
    }
}
