package com.example.user.projectstart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends Activity {


    long delay =1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Timer runsplash = new Timer();
        TimerTask showsplash = new TimerTask() {
            @Override
            public void run() {

                Intent intent =new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        runsplash.schedule(showsplash,delay);

    }




}
