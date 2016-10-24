package com.ap.github.client.di.module;

import com.ap.github.client.data.api.AccountApi;
import com.ap.github.client.data.datasource.AccountDataSource;

import dagger.Module;
import dagger.Provides;

/**
 * account module
 * Created by SunHZ on 10/17/16.
 */
@Module
public class AccountModule {

    @Provides
    AccountApi provideAccountApi(AccountDataSource accountDataSource) {
        return accountDataSource;
    }
}