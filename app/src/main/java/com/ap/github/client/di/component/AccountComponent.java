package com.ap.github.client.di.component;

import com.ap.github.client.di.PerActivity;
import com.ap.github.client.di.module.AccountModule;
import com.ap.github.client.di.module.ActivityModule;
import com.ap.github.client.ui.account.LoginActivity;

import dagger.Component;

/**
 * Account Component
 * Created by SunHZ on 10/17/16.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,
        modules = {ActivityModule.class, AccountModule.class})
public interface AccountComponent extends ActivityComponent {

    void inject(LoginActivity loginActivity);
}