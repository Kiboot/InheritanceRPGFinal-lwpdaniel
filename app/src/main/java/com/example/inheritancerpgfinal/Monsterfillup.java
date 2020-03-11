package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Monsterfillup extends AppCompatActivity {

    ImageView monsu1, monsu2, monsu3, monsu4, monsu5;

    String imHP, imMP, imPatk, imMatk, imPdef, imMdef, imDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsterfillup);

        //ImageView
        monsu1 = findViewById(R.id.theMon1);
        monsu2 = findViewById(R.id.theMon2);
        monsu3 = findViewById(R.id.theMon3);
        monsu4 = findViewById(R.id.theMon4);
        monsu5 = findViewById(R.id.theMon5);


        //ButtonImage
        monsu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Monster brambleback = new Monster(
                        11,
                        3675,
                        532,
                        82,
                        25,
                        50,
                        47,
                        "One giant tree-like monster"
                        );

                imHP = String.valueOf(brambleback.getBaseHP());
                imMP = String.valueOf(brambleback.getBaseMP());
                imPatk = String.valueOf(brambleback.getPAtk());
                imMatk = String.valueOf(brambleback.getMAtk());
                imPdef = String.valueOf(brambleback.getPDef());
                imMdef = String.valueOf(brambleback.getMDef());
                imDes = brambleback.getDescription();

                Intent inmon1 = new Intent(Monsterfillup.this, Herores.class);
                inmon1.putExtra("mHPres", imHP);
                inmon1.putExtra("mMPres", imMP);
                inmon1.putExtra("mPatkres", imPatk);
                inmon1.putExtra("mPdefres", imPdef);
                inmon1.putExtra("mMatkres", imMatk);
                inmon1.putExtra("mMdefres", imMdef);

                startActivity(inmon1);



            }
        });
        monsu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Monster sentinel = new Monster(
                        11,
                        2100,
                        1226,
                        36,
                        90,
                        33,
                        65,
                        "One giant stone-like monster"
                );

                imHP = String.valueOf(sentinel.getBaseHP());
                imMP = String.valueOf(sentinel.getBaseMP());
                imPatk = String.valueOf(sentinel.getPAtk());
                imMatk = String.valueOf(sentinel.getMAtk());
                imPdef = String.valueOf(sentinel.getPDef());
                imMdef = String.valueOf(sentinel.getMDef());
                imDes = sentinel.getDescription();

                Intent inmon2 = new Intent(Monsterfillup.this, Herores.class);
                inmon2.putExtra("mHPres", imHP);
                inmon2.putExtra("mMPres", imMP);
                inmon2.putExtra("mPatkres", imPatk);
                inmon2.putExtra("mPdefres", imPdef);
                inmon2.putExtra("mMatkres", imMatk);
                inmon2.putExtra("mMdefres", imMdef);

                startActivity(inmon2);

            }
        });
        monsu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Monster baron = new Monster(
                        11,
                        9000,
                        900,
                        15,
                        10,
                        15,
                        15,
                        "An Octopus-snake-alien?"
                );

                imHP = String.valueOf(baron.getBaseHP());
                imMP = String.valueOf(baron.getBaseMP());
                imPatk = String.valueOf(baron.getPAtk());
                imMatk = String.valueOf(baron.getMAtk());
                imPdef = String.valueOf(baron.getPDef());
                imMdef = String.valueOf(baron.getMDef());
                imDes = baron.getDescription();

                Intent inmon3 = new Intent(Monsterfillup.this, Herores.class);
                inmon3.putExtra("mHPres", imHP);
                inmon3.putExtra("mMPres", imMP);
                inmon3.putExtra("mPatkres", imPatk);
                inmon3.putExtra("mPdefres", imPdef);
                inmon3.putExtra("mMatkres", imMatk);
                inmon3.putExtra("mMdefres", imMdef);

                startActivity(inmon3);

            }
        });
        monsu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Monster drake = new Monster(
                        11,
                        1500,
                        433,
                        435,
                        225,
                        9,
                        12,
                        "Just a dragon"
                );

                imHP = String.valueOf(drake.getBaseHP());
                imMP = String.valueOf(drake.getBaseMP());
                imPatk = String.valueOf(drake.getPAtk());
                imMatk = String.valueOf(drake.getMAtk());
                imPdef = String.valueOf(drake.getPDef());
                imMdef = String.valueOf(drake.getMDef());
                imDes = drake.getDescription();

                Intent inmon4 = new Intent(Monsterfillup.this, Herores.class);
                inmon4.putExtra("mHPres", imHP);
                inmon4.putExtra("mMPres", imMP);
                inmon4.putExtra("mPatkres", imPatk);
                inmon4.putExtra("mPdefres", imPdef);
                inmon4.putExtra("mMatkres", imMatk);
                inmon4.putExtra("mMdefres", imMdef);

                startActivity(inmon4);

            }
        });
        monsu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Monster gromp = new Monster(
                        11,
                        600,
                        200,
                        5,
                        10,
                        232,
                        152,
                        "Unbeatable frog"
                );

                imHP = String.valueOf(gromp.getBaseHP());
                imMP = String.valueOf(gromp.getBaseMP());
                imPatk = String.valueOf(gromp.getPAtk());
                imMatk = String.valueOf(gromp.getMAtk());
                imPdef = String.valueOf(gromp.getPDef());
                imMdef = String.valueOf(gromp.getMDef());
                imDes = gromp.getDescription();

                Intent inmon5 = new Intent(Monsterfillup.this, Herores.class);
                inmon5.putExtra("mHPres", imHP);
                inmon5.putExtra("mMPres", imMP);
                inmon5.putExtra("mPatkres", imPatk);
                inmon5.putExtra("mPdefres", imPdef);
                inmon5.putExtra("mMatkres", imMatk);
                inmon5.putExtra("mMdefres", imMdef);

                startActivity(inmon5);

            }
        });


    }
}
