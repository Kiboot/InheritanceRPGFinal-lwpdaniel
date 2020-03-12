package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 7000;

    ImageView logo;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.theLogo);
        title = findViewById(R.id.theTitle);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent inload = new Intent(MainActivity.this, Choosehere.class);
                startActivity(inload);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
