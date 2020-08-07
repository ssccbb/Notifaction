package com.sung.notifaction;

import android.app.Application;

/**
 * Create by sung at 2020/8/7
 *
 * @desc:
 * @notice:
 */
public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        NotificationChannels.createAllNotificationChannels(this);
    }
}
