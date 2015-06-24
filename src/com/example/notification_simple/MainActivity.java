package com.example.notification_simple;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{

	/**
	 * This works fine from API Level -14 i.e, ICE CREAM SANDWHICH and Later , for
	 * Previous Versions add support library
	 **/
	Button Send_Simple_Notification;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        Send_Simple_Notification =(Button)findViewById(R.id.button1);
        
        Send_Simple_Notification.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View arg0) 
			{
				// TODO Auto-generated method stub
				NotificationManager notificationManager= (NotificationManager)MainActivity.this.getSystemService(Context.NOTIFICATION_SERVICE);
				NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);
			
				builder.setContentTitle("Shiva");
				builder.setContentText("I have uploded this code in github");
				builder.setSmallIcon(android.R.drawable.alert_dark_frame);
				builder.setAutoCancel(true);
				
				int notify_ID=745;
				notificationManager.notify(notify_ID, builder.build());
				
			
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
