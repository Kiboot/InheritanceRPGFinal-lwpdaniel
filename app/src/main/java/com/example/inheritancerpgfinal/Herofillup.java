package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Herofillup extends AppCompatActivity {

    EditText namesu, levelsu;

    Spinner classsu;

    ImageView sub1su, sub2su, sub3su, sub4su, sub5su, sub6su, sub7su, sub8su, sub9su, sub10su;

    String classer, namer;
    int leveler;

    String ibaseHP, ibaseMP, ipAtk, imAtk, ipDef, imDef, iheroClass,iheroXP, ibaseSTR, ibaseAGI, ibaseINT;

    TextView name1, name2, name3, name4, name5, name6, name7, name8, name9, name10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herofillup);

        namesu = findViewById(R.id.theName);
        levelsu = findViewById(R.id.theLevel);
        classsu = findViewById(R.id.theClass);

        //Subclasses
        sub1su = findViewById(R.id.theSub1);
        sub2su = findViewById(R.id.theSub2);
        sub3su = findViewById(R.id.theSub3);
        sub4su = findViewById(R.id.theSub4);
        sub5su = findViewById(R.id.theSub5);
        sub6su = findViewById(R.id.theSub6);
        sub7su = findViewById(R.id.theSub7);
        sub8su = findViewById(R.id.theSub8);
        sub9su = findViewById(R.id.theSub9);
        sub10su = findViewById(R.id.theSub10);

        //Names
        name1 = findViewById(R.id.theName1);
        name2 = findViewById(R.id.theName2);
        name3 = findViewById(R.id.theName3);
        name4 = findViewById(R.id.theName4);
        name5 = findViewById(R.id.theName5);
        name6 = findViewById(R.id.theName6);
        name7 = findViewById(R.id.theName7);
        name8 = findViewById(R.id.theName8);
        name9 = findViewById(R.id.theName9);
        name10 = findViewById(R.id.theName10);

        //Visibility
        sub1su.setVisibility(View.GONE);
        sub2su.setVisibility(View.GONE);
        sub3su.setVisibility(View.GONE);
        sub4su.setVisibility(View.GONE);
        sub5su.setVisibility(View.GONE);
        sub6su.setVisibility(View.GONE);
        sub7su.setVisibility(View.GONE);
        sub8su.setVisibility(View.GONE);
        sub9su.setVisibility(View.GONE);
        sub10su.setVisibility(View.GONE);
        name1.setVisibility(View.GONE);
        name2.setVisibility(View.GONE);
        name3.setVisibility(View.GONE);
        name4.setVisibility(View.GONE);
        name5.setVisibility(View.GONE);
        name6.setVisibility(View.GONE);
        name7.setVisibility(View.GONE);
        name8.setVisibility(View.GONE);
        name9.setVisibility(View.GONE);
        name10.setVisibility(View.GONE);



        classsu.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        classer = classsu.getSelectedItem().toString();

                        switch (position) {
                            case 0:
                                sub1su.setVisibility(View.GONE);
                                sub2su.setVisibility(View.GONE);
                                sub3su.setVisibility(View.GONE);
                                sub4su.setVisibility(View.GONE);
                                sub5su.setVisibility(View.GONE);
                                sub6su.setVisibility(View.GONE);
                                sub7su.setVisibility(View.GONE);
                                sub8su.setVisibility(View.GONE);
                                sub9su.setVisibility(View.GONE);
                                sub10su.setVisibility(View.GONE);
                                name1.setVisibility(View.GONE);
                                name2.setVisibility(View.GONE);
                                name3.setVisibility(View.GONE);
                                name4.setVisibility(View.GONE);
                                name5.setVisibility(View.GONE);
                                name6.setVisibility(View.GONE);
                                name7.setVisibility(View.GONE);
                                name8.setVisibility(View.GONE);
                                name9.setVisibility(View.GONE);
                                name10.setVisibility(View.GONE);
                                break;
                            case 1:
                                sub1su.setVisibility(View.VISIBLE);
                                sub2su.setVisibility(View.VISIBLE);
                                sub3su.setVisibility(View.GONE);
                                sub4su.setVisibility(View.GONE);
                                sub5su.setVisibility(View.GONE);
                                sub6su.setVisibility(View.GONE);
                                sub7su.setVisibility(View.GONE);
                                sub8su.setVisibility(View.GONE);
                                sub9su.setVisibility(View.GONE);
                                sub10su.setVisibility(View.GONE);
                                name1.setVisibility(View.VISIBLE);
                                name2.setVisibility(View.VISIBLE);
                                name3.setVisibility(View.GONE);
                                name4.setVisibility(View.GONE);
                                name5.setVisibility(View.GONE);
                                name6.setVisibility(View.GONE);
                                name7.setVisibility(View.GONE);
                                name8.setVisibility(View.GONE);
                                name9.setVisibility(View.GONE);
                                name10.setVisibility(View.GONE);

                                break;
                            case 2:
                                sub1su.setVisibility(View.GONE);
                                sub2su.setVisibility(View.GONE);
                                sub3su.setVisibility(View.VISIBLE);
                                sub4su.setVisibility(View.VISIBLE);
                                sub5su.setVisibility(View.GONE);
                                sub6su.setVisibility(View.GONE);
                                sub7su.setVisibility(View.GONE);
                                sub8su.setVisibility(View.GONE);
                                sub9su.setVisibility(View.GONE);
                                sub10su.setVisibility(View.GONE);
                                name1.setVisibility(View.GONE);
                                name2.setVisibility(View.GONE);
                                name3.setVisibility(View.VISIBLE);
                                name4.setVisibility(View.VISIBLE);
                                name5.setVisibility(View.GONE);
                                name6.setVisibility(View.GONE);
                                name7.setVisibility(View.GONE);
                                name8.setVisibility(View.GONE);
                                name9.setVisibility(View.GONE);
                                name10.setVisibility(View.GONE);
                                break;
                            case 3:
                                sub1su.setVisibility(View.GONE);
                                sub2su.setVisibility(View.GONE);
                                sub3su.setVisibility(View.GONE);
                                sub4su.setVisibility(View.GONE);
                                sub5su.setVisibility(View.VISIBLE);
                                sub6su.setVisibility(View.VISIBLE);
                                sub7su.setVisibility(View.GONE);
                                sub8su.setVisibility(View.GONE);
                                sub9su.setVisibility(View.GONE);
                                sub10su.setVisibility(View.GONE);
                                name1.setVisibility(View.GONE);
                                name2.setVisibility(View.GONE);
                                name3.setVisibility(View.GONE);
                                name4.setVisibility(View.GONE);
                                name5.setVisibility(View.VISIBLE);
                                name6.setVisibility(View.VISIBLE);
                                name7.setVisibility(View.GONE);
                                name8.setVisibility(View.GONE);
                                name9.setVisibility(View.GONE);
                                name10.setVisibility(View.GONE);
                                break;
                            case 4:
                                sub1su.setVisibility(View.GONE);
                                sub2su.setVisibility(View.GONE);
                                sub3su.setVisibility(View.GONE);
                                sub4su.setVisibility(View.GONE);
                                sub5su.setVisibility(View.GONE);
                                sub6su.setVisibility(View.GONE);
                                sub7su.setVisibility(View.VISIBLE);
                                sub8su.setVisibility(View.VISIBLE);
                                sub9su.setVisibility(View.GONE);
                                sub10su.setVisibility(View.GONE);
                                name1.setVisibility(View.GONE);
                                name2.setVisibility(View.GONE);
                                name3.setVisibility(View.GONE);
                                name4.setVisibility(View.GONE);
                                name5.setVisibility(View.GONE);
                                name6.setVisibility(View.GONE);
                                name7.setVisibility(View.VISIBLE);
                                name8.setVisibility(View.VISIBLE);
                                name9.setVisibility(View.GONE);
                                name10.setVisibility(View.GONE);
                                break;
                            case 5:
                                sub1su.setVisibility(View.GONE);
                                sub2su.setVisibility(View.GONE);
                                sub3su.setVisibility(View.GONE);
                                sub4su.setVisibility(View.GONE);
                                sub5su.setVisibility(View.GONE);
                                sub6su.setVisibility(View.GONE);
                                sub7su.setVisibility(View.GONE);
                                sub8su.setVisibility(View.GONE);
                                sub9su.setVisibility(View.VISIBLE);
                                sub10su.setVisibility(View.VISIBLE);
                                name1.setVisibility(View.GONE);
                                name2.setVisibility(View.GONE);
                                name3.setVisibility(View.GONE);
                                name4.setVisibility(View.GONE);
                                name5.setVisibility(View.GONE);
                                name6.setVisibility(View.GONE);
                                name7.setVisibility(View.GONE);
                                name8.setVisibility(View.GONE);
                                name9.setVisibility(View.VISIBLE);
                                name10.setVisibility(View.VISIBLE);
                                break;


                        }

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );



        sub1su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero dawnbringer = new Hero(
                        1,
                        523,
                        375,
                        50,
                        32,
                        75,
                        30,
                        "DawnBringer",
                        0,
                        18,
                        16,
                        14,
                        leveler,
                        2.2,
                        1.6,
                        3.3
                );


                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(dawnbringer.baseHPwSTR());
                ibaseMP = String.valueOf(dawnbringer.baseMPwINT());
                ipAtk = String.valueOf(dawnbringer.pAtkGrowth());
                ipDef = String.valueOf(dawnbringer.pDefGrowth());
                imAtk = String.valueOf(dawnbringer.mAtkGrowth());
                imDef = String.valueOf(dawnbringer.mDefGrowth());
                iheroClass = String.valueOf(dawnbringer.getHeroClass());
                iheroXP = String.valueOf(dawnbringer.getHeroXP());
                ibaseSTR = String.valueOf(dawnbringer.strGrowthwLvl());
                ibaseAGI = String.valueOf(dawnbringer.agiGrowthwLvl());
                ibaseINT = String.valueOf(dawnbringer.intGrowthwLvl());


                if(leveler<=99 && leveler>=1) {
                    Intent insub1 = new Intent(Herofillup.this, Herores.class);
                    insub1.putExtra("baseHPres", ibaseHP);
                    insub1.putExtra("baseMPres", ibaseMP);
                    insub1.putExtra("pAtkres", ipAtk);
                    insub1.putExtra("pDefres", ipDef);
                    insub1.putExtra("mAtkres", imAtk);
                    insub1.putExtra("mDefres", imDef);
                    insub1.putExtra("heroClassres", iheroClass);
                    insub1.putExtra("heroXPres", iheroXP);
                    insub1.putExtra("baseSTRres", ibaseSTR);
                    insub1.putExtra("baseAGIres", ibaseAGI);
                    insub1.putExtra("baseINTres", ibaseINT);
                    insub1.putExtra("levelres", leveler);
                    insub1.putExtra("nameres", namer);
                    insub1.putExtra("EXTRA_IMAGEVIEW_URL", R.id.theSub1);
                    startActivity(insub1);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }


            }
        });
        sub2su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero nightbringer = new Hero(
                        2,
                        200,
                        75,
                        60,
                        30,
                        20,
                        30,
                        "NightBringer",
                        0,
                        20,
                        23,
                        30,
                        leveler,
                        2.4,
                        1.8,
                        3.7
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(nightbringer.baseHPwSTR());
                ibaseMP = String.valueOf(nightbringer.baseMPwINT());
                ipAtk = String.valueOf(nightbringer.pAtkGrowth());
                ipDef = String.valueOf(nightbringer.pDefGrowth());
                imAtk = String.valueOf(nightbringer.mAtkGrowth());
                imDef = String.valueOf(nightbringer.mDefGrowth());
                iheroClass = String.valueOf(nightbringer.getHeroClass());
                iheroXP = String.valueOf(nightbringer.getHeroXP());
                ibaseSTR = String.valueOf(nightbringer.strGrowthwLvl());
                ibaseAGI = String.valueOf(nightbringer.agiGrowthwLvl());
                ibaseINT = String.valueOf(nightbringer.intGrowthwLvl());


                if(leveler<=99 && leveler>=1) {
                    Intent insub2 = new Intent(Herofillup.this, Herores.class);
                    insub2.putExtra("baseHPres", ibaseHP);
                    insub2.putExtra("baseMPres", ibaseMP);
                    insub2.putExtra("pAtkres", ipAtk);
                    insub2.putExtra("pDefres", ipDef);
                    insub2.putExtra("mAtkres", imAtk);
                    insub2.putExtra("mDefres", imDef);
                    insub2.putExtra("heroClassres", iheroClass);
                    insub2.putExtra("heroXPres", iheroXP);
                    insub2.putExtra("baseSTRres", ibaseSTR);
                    insub2.putExtra("baseAGIres", ibaseAGI);
                    insub2.putExtra("baseINTres", ibaseINT);
                    insub2.putExtra("levelres", leveler);
                    insub2.putExtra("nameres", namer);
                    startActivity(insub2);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }


            }
        });
        sub3su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero darkstar = new Hero(
                        3,
                        490,
                        480,
                        54,
                        19,
                        80,
                        30,
                        "Darkstar",
                        0,
                        18,
                        14,
                        15,
                        leveler,
                        2.4,
                        1.9,
                        4.6
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(darkstar.baseHPwSTR());
                ibaseMP = String.valueOf(darkstar.baseMPwINT());
                ipAtk = String.valueOf(darkstar.pAtkGrowth());
                ipDef = String.valueOf(darkstar.pDefGrowth());
                imAtk = String.valueOf(darkstar.mAtkGrowth());
                imDef = String.valueOf(darkstar.mDefGrowth());
                iheroClass = String.valueOf(darkstar.getHeroClass());
                iheroXP = String.valueOf(darkstar.getHeroXP());
                ibaseSTR = String.valueOf(darkstar.strGrowthwLvl());
                ibaseAGI = String.valueOf(darkstar.agiGrowthwLvl());
                ibaseINT = String.valueOf(darkstar.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub3 = new Intent(Herofillup.this, Herores.class);
                    insub3.putExtra("baseHPres", ibaseHP);
                    insub3.putExtra("baseMPres", ibaseMP);
                    insub3.putExtra("pAtkres", ipAtk);
                    insub3.putExtra("pDefres", ipDef);
                    insub3.putExtra("mAtkres", imAtk);
                    insub3.putExtra("mDefres", imDef);
                    insub3.putExtra("heroClassres", iheroClass);
                    insub3.putExtra("heroXPres", iheroXP);
                    insub3.putExtra("baseSTRres", ibaseSTR);
                    insub3.putExtra("baseAGIres", ibaseAGI);
                    insub3.putExtra("baseINTres", ibaseINT);
                    insub3.putExtra("levelres", leveler);
                    insub3.putExtra("nameres", namer);
                    startActivity(insub3);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub4su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero cosmic = new Hero(
                        4,
                        539,
                        280,
                        61,
                        26,
                        20,
                        30,
                        "Cosmic",
                        0,
                        18,
                        20,
                        15,
                        leveler,
                        1.9,
                        2.9,
                        1.4
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(cosmic.baseHPwSTR());
                ibaseMP = String.valueOf(cosmic.baseMPwINT());
                ipAtk = String.valueOf(cosmic.pAtkGrowth());
                ipDef = String.valueOf(cosmic.pDefGrowth());
                imAtk = String.valueOf(cosmic.mAtkGrowth());
                imDef = String.valueOf(cosmic.mDefGrowth());
                iheroClass = String.valueOf(cosmic.getHeroClass());
                iheroXP = String.valueOf(cosmic.getHeroXP());
                ibaseSTR = String.valueOf(cosmic.strGrowthwLvl());
                ibaseAGI = String.valueOf(cosmic.agiGrowthwLvl());
                ibaseINT = String.valueOf(cosmic.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub4 = new Intent(Herofillup.this, Herores.class);
                    insub4.putExtra("baseHPres", ibaseHP);
                    insub4.putExtra("baseMPres", ibaseMP);
                    insub4.putExtra("pAtkres", ipAtk);
                    insub4.putExtra("pDefres", ipDef);
                    insub4.putExtra("mAtkres", imAtk);
                    insub4.putExtra("mDefres", imDef);
                    insub4.putExtra("heroClassres", iheroClass);
                    insub4.putExtra("heroXPres", iheroXP);
                    insub4.putExtra("baseSTRres", ibaseSTR);
                    insub4.putExtra("baseAGIres", ibaseAGI);
                    insub4.putExtra("baseINTres", ibaseINT);
                    insub4.putExtra("levelres", leveler);
                    insub4.putExtra("nameres", namer);
                    startActivity(insub4);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub5su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero chaos = new Hero(
                        5,
                        582,
                        263,
                        64,
                        39,
                        25,
                        32,
                        "Chaos",
                        0,
                        25,
                        20,
                        18,
                        leveler,
                        3.6,
                        2.2,
                        1.6
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(chaos.baseHPwSTR());
                ibaseMP = String.valueOf(chaos.baseMPwINT());
                ipAtk = String.valueOf(chaos.pAtkGrowth());
                ipDef = String.valueOf(chaos.pDefGrowth());
                imAtk = String.valueOf(chaos.mAtkGrowth());
                imDef = String.valueOf(chaos.mDefGrowth());
                iheroClass = String.valueOf(chaos.getHeroClass());
                iheroXP = String.valueOf(chaos.getHeroXP());
                ibaseSTR = String.valueOf(chaos.strGrowthwLvl());
                ibaseAGI = String.valueOf(chaos.agiGrowthwLvl());
                ibaseINT = String.valueOf(chaos.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub5 = new Intent(Herofillup.this, Herores.class);
                    insub5.putExtra("baseHPres", ibaseHP);
                    insub5.putExtra("baseMPres", ibaseMP);
                    insub5.putExtra("pAtkres", ipAtk);
                    insub5.putExtra("pDefres", ipDef);
                    insub5.putExtra("mAtkres", imAtk);
                    insub5.putExtra("mDefres", imDef);
                    insub5.putExtra("heroClassres", iheroClass);
                    insub5.putExtra("heroXPres", iheroXP);
                    insub5.putExtra("baseSTRres", ibaseSTR);
                    insub5.putExtra("baseAGIres", ibaseAGI);
                    insub5.putExtra("baseINTres", ibaseINT);
                    insub5.putExtra("levelres", leveler);
                    insub5.putExtra("nameres", namer);
                    startActivity(insub5);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub6su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero orders = new Hero(
                        6,
                        620,
                        535,
                        66,
                        36,
                        28,
                        32,
                        "Orders",
                        0,
                        20,
                        23,
                        30,
                        leveler,
                        2.4,
                        1.8,
                        3.7
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(orders.baseHPwSTR());
                ibaseMP = String.valueOf(orders.baseMPwINT());
                ipAtk = String.valueOf(orders.pAtkGrowth());
                ipDef = String.valueOf(orders.pDefGrowth());
                imAtk = String.valueOf(orders.mAtkGrowth());
                imDef = String.valueOf(orders.mDefGrowth());
                iheroClass = String.valueOf(orders.getHeroClass());
                iheroXP = String.valueOf(orders.getHeroXP());
                ibaseSTR = String.valueOf(orders.strGrowthwLvl());
                ibaseAGI = String.valueOf(orders.agiGrowthwLvl());
                ibaseINT = String.valueOf(orders.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub6 = new Intent(Herofillup.this, Herores.class);
                    insub6.putExtra("baseHPres", ibaseHP);
                    insub6.putExtra("baseMPres", ibaseMP);
                    insub6.putExtra("pAtkres", ipAtk);
                    insub6.putExtra("pDefres", ipDef);
                    insub6.putExtra("mAtkres", imAtk);
                    insub6.putExtra("mDefres", imDef);
                    insub6.putExtra("heroClassres", iheroClass);
                    insub6.putExtra("heroXPres", iheroXP);
                    insub6.putExtra("baseSTRres", ibaseSTR);
                    insub6.putExtra("baseAGIres", ibaseAGI);
                    insub6.putExtra("baseINTres", ibaseINT);
                    insub6.putExtra("levelres", leveler);
                    insub6.putExtra("nameres", namer);
                    startActivity(insub6);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub7su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero blossom = new Hero(
                        7,
                        573,
                        327,
                        63,
                        36,
                        60,
                        32,
                        "Blossom",
                        0,
                        16,
                        14,
                        13,
                        leveler,
                        2,
                        3.6,
                        1.8
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(blossom.baseHPwSTR());
                ibaseMP = String.valueOf(blossom.baseMPwINT());
                ipAtk = String.valueOf(blossom.pAtkGrowth());
                ipDef = String.valueOf(blossom.pDefGrowth());
                imAtk = String.valueOf(blossom.mAtkGrowth());
                imDef = String.valueOf(blossom.mDefGrowth());
                iheroClass = String.valueOf(blossom.getHeroClass());
                iheroXP = String.valueOf(blossom.getHeroXP());
                ibaseSTR = String.valueOf(blossom.strGrowthwLvl());
                ibaseAGI = String.valueOf(blossom.agiGrowthwLvl());
                ibaseINT = String.valueOf(blossom.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub7 = new Intent(Herofillup.this, Herores.class);
                    insub7.putExtra("baseHPres", ibaseHP);
                    insub7.putExtra("baseMPres", ibaseMP);
                    insub7.putExtra("pAtkres", ipAtk);
                    insub7.putExtra("pDefres", ipDef);
                    insub7.putExtra("mAtkres", imAtk);
                    insub7.putExtra("mDefres", imDef);
                    insub7.putExtra("heroClassres", iheroClass);
                    insub7.putExtra("heroXPres", iheroXP);
                    insub7.putExtra("baseSTRres", ibaseSTR);
                    insub7.putExtra("baseAGIres", ibaseAGI);
                    insub7.putExtra("baseINTres", ibaseINT);
                    insub7.putExtra("levelres", leveler);
                    insub7.putExtra("nameres", namer);
                    startActivity(insub7);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub8su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero sworn = new Hero(
                        8,
                        602,
                        358,
                        58,
                        28,
                        70,
                        32,
                        "Sworn",
                        0,
                        21,
                        23,
                        15,
                        leveler,
                        2.2,
                        3.4,
                        1.4
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(sworn.baseHPwSTR());
                ibaseMP = String.valueOf(sworn.baseMPwINT());
                ipAtk = String.valueOf(sworn.pAtkGrowth());
                ipDef = String.valueOf(sworn.pDefGrowth());
                imAtk = String.valueOf(sworn.mAtkGrowth());
                imDef = String.valueOf(sworn.mDefGrowth());
                iheroClass = String.valueOf(sworn.getHeroClass());
                iheroXP = String.valueOf(sworn.getHeroXP());
                ibaseSTR = String.valueOf(sworn.strGrowthwLvl());
                ibaseAGI = String.valueOf(sworn.agiGrowthwLvl());
                ibaseINT = String.valueOf(sworn.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub8 = new Intent(Herofillup.this, Herores.class);
                    insub8.putExtra("baseHPres", ibaseHP);
                    insub8.putExtra("baseMPres", ibaseMP);
                    insub8.putExtra("pAtkres", ipAtk);
                    insub8.putExtra("pDefres", ipDef);
                    insub8.putExtra("mAtkres", imAtk);
                    insub8.putExtra("mDefres", imDef);
                    insub8.putExtra("heroClassres", iheroClass);
                    insub8.putExtra("heroXPres", iheroXP);
                    insub8.putExtra("baseSTRres", ibaseSTR);
                    insub8.putExtra("baseAGIres", ibaseAGI);
                    insub8.putExtra("baseINTres", ibaseINT);
                    insub8.putExtra("levelres", leveler);
                    insub8.putExtra("nameres", namer);
                    startActivity(insub8);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub9su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero bloodmoon = new Hero(
                        9,
                        556,
                        300,
                        59,
                        24,
                        45,
                        30,
                        "Bloodmoon",
                        0,
                        19,
                        21,
                        15,
                        leveler,
                        1.7,
                        3.4,
                        2.6
                );

                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(bloodmoon.baseHPwSTR());
                ibaseMP = String.valueOf(bloodmoon.baseMPwINT());
                ipAtk = String.valueOf(bloodmoon.pAtkGrowth());
                ipDef = String.valueOf(bloodmoon.pDefGrowth());
                imAtk = String.valueOf(bloodmoon.mAtkGrowth());
                imDef = String.valueOf(bloodmoon.mDefGrowth());
                iheroClass = String.valueOf(bloodmoon.getHeroClass());
                iheroXP = String.valueOf(bloodmoon.getHeroXP());
                ibaseSTR = String.valueOf(bloodmoon.strGrowthwLvl());
                ibaseAGI = String.valueOf(bloodmoon.agiGrowthwLvl());
                ibaseINT = String.valueOf(bloodmoon.intGrowthwLvl());

                if(leveler<=99 && leveler>=1) {
                    Intent insub9 = new Intent(Herofillup.this, Herores.class);
                    insub9.putExtra("baseHPres", ibaseHP);
                    insub9.putExtra("baseMPres", ibaseMP);
                    insub9.putExtra("pAtkres", ipAtk);
                    insub9.putExtra("pDefres", ipDef);
                    insub9.putExtra("mAtkres", imAtk);
                    insub9.putExtra("mDefres", imDef);
                    insub9.putExtra("heroClassres", iheroClass);
                    insub9.putExtra("heroXPres", iheroXP);
                    insub9.putExtra("baseSTRres", ibaseSTR);
                    insub9.putExtra("baseAGIres", ibaseAGI);
                    insub9.putExtra("baseINTres", ibaseINT);
                    insub9.putExtra("levelres", leveler);
                    insub9.putExtra("nameres", namer);
                    startActivity(insub9);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });
        sub10su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                leveler = Integer.valueOf(levelsu.getText().toString());

                Hero arclight = new Hero(
                        10,
                        520,
                        496,
                        57,
                        22,
                        80,
                        30,
                        "Arclight",
                        0,
                        27,
                        10,
                        26,
                        leveler,
                        3,
                        1.2,
                        3.2
                );


                namer = String.valueOf(namesu.getText());
                ibaseHP = String.valueOf(arclight.baseHPwSTR());
                ibaseMP = String.valueOf(arclight.baseMPwINT());
                ipAtk = String.valueOf(arclight.pAtkGrowth());
                ipDef = String.valueOf(arclight.pDefGrowth());
                imAtk = String.valueOf(arclight.mAtkGrowth());
                imDef = String.valueOf(arclight.mDefGrowth());
                iheroClass = String.valueOf(arclight.getHeroClass());
                iheroXP = String.valueOf(arclight.getHeroXP());
                ibaseSTR = String.valueOf(arclight.strGrowthwLvl());
                ibaseAGI = String.valueOf(arclight.agiGrowthwLvl());
                ibaseINT = String.valueOf(arclight.intGrowthwLvl());


                if(leveler<=99 && leveler>=1) {
                    Intent insub10 = new Intent(Herofillup.this, Herores.class);
                    insub10.putExtra("baseHPres", ibaseHP);
                    insub10.putExtra("baseMPres", ibaseMP);
                    insub10.putExtra("pAtkres", ipAtk);
                    insub10.putExtra("pDefres", ipDef);
                    insub10.putExtra("mAtkres", imAtk);
                    insub10.putExtra("mDefres", imDef);
                    insub10.putExtra("heroClassres", iheroClass);
                    insub10.putExtra("heroXPres", iheroXP);
                    insub10.putExtra("baseSTRres", ibaseSTR);
                    insub10.putExtra("baseAGIres", ibaseAGI);
                    insub10.putExtra("baseINTres", ibaseINT);
                    insub10.putExtra("levelres", leveler);
                    insub10.putExtra("nameres", namer);
                    startActivity(insub10);
                }
                else if(leveler>=100) {
                    Toast.makeText(Herofillup.this, "Limit level is 99", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
