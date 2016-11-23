package com.example.ipsenspiegel.notificationmanager;

/**
 * Created by A5Alumno on 23/11/2016.
 */
import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

public class AlternativeNotificationActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);
        mNotificationManager.cancel(MainActivity.CUSTOM_NOTIFICATION_ID);
    }
}