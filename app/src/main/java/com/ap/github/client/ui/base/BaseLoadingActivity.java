package com.ap.github.client.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;

import com.ap.github.client.mvp.lce.LoadView;
import com.ap.github.client.widget.loading.LoadingView;

/**
 * base loading activity
 * Created by SunHZ on 10/17/16.
 */
public abstract class BaseLoadingActivity extends BaseActivity implements LoadView {

    private LoadingView mLoadingView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLoadingView = new LoadingView(this, getLoadingMessage());
    }

    public String getLoadingMessage() {
        return null;
    }

    @Override
    public void showLoading() {
        mLoadingView.show();
    }

    @Override
    public void dismissLoading() {
        mLoadingView.dismiss();
    }

    @Override
    public void error(Throwable e) {
        Snackbar.make(getWindow().getDecorView(), e.getMessage(), Snackbar.LENGTH_SHORT).show();
    }
}
