package com.ap.github.client;

import android.app.Application;
import android.content.Context;

import com.ap.github.client.di.component.ApplicationComponent;
import com.ap.github.client.di.component.DaggerApplicationComponent;
import com.ap.github.client.di.module.ApplicationModule;

/**
 * Android GitHub client application
 * Created by SunHZ on 10/17/16.
 */
public class ClientApplication extends Application {

    ApplicationComponent mApplicationComponent;

    public static ClientApplication get(Context context) {
        return (ClientApplication) context.getApplicationContext();
    }

    public ApplicationComponent getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        }
        return mApplicationComponent;
    }

    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
