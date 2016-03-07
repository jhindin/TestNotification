package com.jhindin.testnotification;

import android.app.NotificationManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void normalNotifciation(View view) {
        Toast.makeText(this, "Creating normal notification", Toast.LENGTH_LONG).show();

        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.mono_sms2gmail_small)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");
        int mNotificationId = 1;
// Gets an instance of the NotificationManager service
        NotificationManager   mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
    }

    public void errorNotifciation(View view) {
        Toast.makeText(this, "Creating error notification", Toast.LENGTH_LONG).show();

        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.mono_sms_broken)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");
        int mNotificationId = 1;
// Gets an instance of the NotificationManager service
        NotificationManager   mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
    }
}
