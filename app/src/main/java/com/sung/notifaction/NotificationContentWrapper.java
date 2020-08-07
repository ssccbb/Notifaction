package com.sung.notifaction;

import android.graphics.Bitmap;

/**
 * Create by sung at 2020/8/7
 *
 * @desc:
 * @notice:
 */
public class NotificationContentWrapper {
    public Bitmap bitmap;
    public String title;
    public String summery;

    public NotificationContentWrapper(Bitmap bitmap, String title, String summery) {
        this.bitmap = bitmap;
        this.title = title;
        this.summery = summery;
    }
}