package com.example.android.iakedittext.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.iakedittext.MainActivity;
import com.example.android.iakedittext.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread waktu = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(500);
                }
            catch (InterruptedException e){
                e.printStackTrace();
            }
                finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        waktu.start();
    }
}
