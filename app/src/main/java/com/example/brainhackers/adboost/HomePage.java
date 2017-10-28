package com.example.brainhackers.adboost;

/**
 * Created by shivang on 28/10/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class HomePage extends AppCompatActivity {
    TextView tvHeading;
    Button btn1, btn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tvHeading = (TextView) findViewById(R.id.tvHeading);

        btn1.setText("SHOW FACIAL DETECTION");
        btn2.setText("SHOW TARGET ANALYSIS");
        tvHeading.setText("Options");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, MainActivity.class);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, Main2Activity.class);
                startActivity(i);
            }
        });
    }
}

