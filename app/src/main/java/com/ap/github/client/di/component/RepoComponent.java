package com.ap.github.client.di.component;

import com.ap.github.client.di.PerActivity;
import com.ap.github.client.di.module.ActivityModule;
import com.ap.github.client.di.module.RepoModule;
import com.ap.github.client.ui.main.MainActivity;

import dagger.Component;

/**
 * Repo Component
 * Created by SunHZ on 10/18/16.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,
        modules = {ActivityModule.class, RepoModule.class})
public interface RepoComponent extends ActivityComponent {

    void inject(MainActivity mainActivity);
}