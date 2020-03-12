package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.TextView;

public class Choosehere extends AppCompatActivity {

    ImageView monstersu, herosu;

    TextView one, two, three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosehere);

        monstersu = findViewById(R.id.chooseMonster);
        herosu = findViewById(R.id.chooseHero);
        one = findViewById(R.id.textView);
        two = findViewById(R.id.textView2);
        three = findViewById(R.id.textView3);

        monstersu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent monsterin = new Intent(Choosehere.this, Monsterfillup.class);
                startActivity(monsterin);

            }
        });

        herosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent heroin = new Intent(Choosehere.this, Herofillup.class);
                startActivity(heroin);

            }
        });

    }
}

