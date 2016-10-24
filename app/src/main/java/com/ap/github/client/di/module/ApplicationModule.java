package com.ap.github.client.di.module;

import android.app.Application;
import android.content.Context;

import com.ap.github.client.data.net.GitHubRepoRetrofit;
import com.ap.github.client.data.service.RepoService;
import com.ap.github.client.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * application module
 * Created by SunHZ on 10/17/16.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    RepoService provideRepoService(GitHubRepoRetrofit gitHubRepoRetrofit) {
        return gitHubRepoRetrofit.get().create(RepoService.class);
    }
}
