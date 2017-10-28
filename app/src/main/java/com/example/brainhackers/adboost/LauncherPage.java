package com.example.brainhackers.adboost;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LauncherPage extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(LauncherPage.this, HomePage.class);
                startActivity(home);
                finish();

            }
        }, SPLASH_TIME_OUT);

        ImageView imageView = (ImageView) findViewById(R.id.iv1);


    }
}
