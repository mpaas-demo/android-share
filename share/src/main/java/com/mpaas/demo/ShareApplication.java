package com.mpaas.demo;

import android.app.Application;
import android.content.Context;

import com.alipay.mobile.framework.quinoxless.IInitCallback;
import com.alipay.mobile.framework.quinoxless.QuinoxlessFramework;

public class ShareApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QuinoxlessFramework.setup(this, new IInitCallback() {
            @Override
            public void onPostInit() {

            }
        });
        QuinoxlessFramework.init();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }
}
