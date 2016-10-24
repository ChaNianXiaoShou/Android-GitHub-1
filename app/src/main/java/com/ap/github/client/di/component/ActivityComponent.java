package com.ap.github.client.di.component;

import android.app.Activity;

import com.ap.github.client.di.PerActivity;
import com.ap.github.client.di.module.ActivityModule;

import dagger.Component;

/**
 * activity component
 * Created by SunHZ on 10/17/16.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

    Activity activity();

}
