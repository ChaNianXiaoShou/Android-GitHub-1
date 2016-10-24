package com.ap.github.client.module.account.view;

import com.ap.github.client.data.model.User;
import com.ap.github.client.mvp.lce.LoadView;

/**
 * login view
 * Created by SunHZ on 10/17/16.
 */
public interface LoginView extends LoadView {

    void loginSuccess(User user);
}
