package com.ap.github.client.ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.Toast;

import com.ap.github.client.BuildConfig;
import com.ap.github.client.ClientApplication;
import com.ap.github.client.R;
import com.ap.github.client.data.model.User;
import com.ap.github.client.di.HasComponent;
import com.ap.github.client.di.component.AccountComponent;
import com.ap.github.client.di.component.DaggerAccountComponent;
import com.ap.github.client.di.module.AccountModule;
import com.ap.github.client.di.module.ActivityModule;
import com.ap.github.client.module.account.view.LoginView;
import com.ap.github.client.presenter.account.LoginPresenter;
import com.ap.github.client.ui.base.BaseLoadingActivity;
import com.ap.github.client.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * login activity
 * Created by SunHZ on 10/17/16.
 */
public class LoginActivity extends BaseLoadingActivity implements HasComponent<AccountComponent>, LoginView {

    @Inject
    LoginPresenter mLoginPresenter;
    @BindView(R.id.btn_login)
    Button mBtnLogin;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getComponent().inject(this);

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        mLoginPresenter.attachView(this);

    }

    @Override
    protected void onDestroy() {
        mLoginPresenter.detachView();
        super.onDestroy();
    }

    @OnClick(R.id.btn_login)
    void login() {
        mLoginPresenter.login(BuildConfig.TEST_GITHUB_USERNAME, BuildConfig.TEST_GITHUB_PASSWORD);
    }

    @Override
    public AccountComponent getComponent() {
        return DaggerAccountComponent.builder()
                .applicationComponent(ClientApplication.get(this).getComponent())
                .activityModule(new ActivityModule(this))
                .accountModule(new AccountModule())
                .build();
    }

    @Override
    public void loginSuccess(User user) {
        MainActivity.launch(mContext);
    }

    @Override
    public void error(Throwable e) {
        Toast.makeText(mContext, e.getMessage(), Toast.LENGTH_SHORT).show();
    }
}
