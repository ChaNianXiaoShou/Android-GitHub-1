package com.ap.github.client.di.module;

import com.ap.github.client.data.api.RepoApi;
import com.ap.github.client.data.datasource.RepoDataSource;

import dagger.Module;
import dagger.Provides;

/**
 * event module
 * Created by SunHZ on 10/18/16.
 */
@Module
public class RepoModule {

    @Provides
    RepoApi provideEventApi(RepoDataSource repoDataSource) {
        return repoDataSource;
    }
}
