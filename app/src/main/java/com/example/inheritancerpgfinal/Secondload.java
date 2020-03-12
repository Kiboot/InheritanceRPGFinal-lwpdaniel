package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class Secondload extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1500;

    ImageView logo2, logo3;
    TextView title2, title3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondload);

        logo2 = findViewById(R.id.theLogo2);
        title2 = findViewById(R.id.theTitle2);

        logo3 = findViewById(R.id.theLogo3);
        title3 = findViewById(R.id.theTitle3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent inload = new Intent(Secondload.this, Choosehere.class);
                startActivity(inload);
                finish();
            }

        },SPLASH_TIME_OUT);
    }
}
