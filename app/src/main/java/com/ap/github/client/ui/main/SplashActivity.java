package com.ap.github.client.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.ap.github.client.data.pref.AppPref;
import com.ap.github.client.ui.base.BaseActivity;

/**
 * splash activity
 * Created by SunHZ on 10/17/16.
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (AppPref.isFirstRunning(this)) {
            IntroduceActivity.launch(this);
        } else {
            MainActivity.launch(this);
        }

        finish();
    }
}
