package me.jakir.backgroundapp;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;


/**
 * Created by Jack on 2/26/2015.
 */
public class BackgroundService extends Service {
    @Override
    public IBinder onBind(Intent intent){

        return  null;

    }

    @Override
    public  int onStartCommand(Intent intent, int flags, int startID){
        Toast.makeText(this, "Service started", Toast.LENGTH_LONG).show();
        return  START_STICKY;
    }



    @Override
    public  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_LONG).show();

    }

}
