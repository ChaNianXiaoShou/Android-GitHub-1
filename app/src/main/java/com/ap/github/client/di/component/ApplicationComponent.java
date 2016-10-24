package com.ap.github.client.di.component;

import android.app.Application;
import android.content.Context;

import com.ap.github.client.data.service.RepoService;
import com.ap.github.client.di.ApplicationContext;
import com.ap.github.client.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * application component
 * Created by SunHZ on 10/17/16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    @ApplicationContext
    Context context();

    Application application();

    RepoService repoService();
}
