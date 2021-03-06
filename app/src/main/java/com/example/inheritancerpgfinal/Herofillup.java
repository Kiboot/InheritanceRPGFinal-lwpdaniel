package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

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
                ibaseHP = String.valueOf(Math.round(dawnbringer.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(dawnbringer.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(dawnbringer.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(dawnbringer.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(dawnbringer.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(dawnbringer.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(dawnbringer.getHeroClass());
                iheroXP = String.valueOf(dawnbringer.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(dawnbringer.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(dawnbringer.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(dawnbringer.intGrowthwLvl()*100.0/100.0));


                if(leveler<=99 && leveler>=1) {
                    Intent insub1 = new Intent(Herofillup.this, ZDawnBringer.class);
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
                ibaseHP = String.valueOf(Math.round(nightbringer.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(nightbringer.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(nightbringer.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(nightbringer.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(nightbringer.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(nightbringer.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(nightbringer.getHeroClass());
                iheroXP = String.valueOf(nightbringer.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(nightbringer.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(nightbringer.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(nightbringer.intGrowthwLvl()*100.0/100.0));


                if(leveler<=99 && leveler>=1) {
                    Intent insub2 = new Intent(Herofillup.this, ZNightBringer.class);
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
                ibaseHP = String.valueOf(Math.round(darkstar.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(darkstar.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(darkstar.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(darkstar.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(darkstar.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(darkstar.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(darkstar.getHeroClass());
                iheroXP = String.valueOf(darkstar.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(darkstar.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(darkstar.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(darkstar.intGrowthwLvl()*100.0/100.0));

                if(leveler<=99 && leveler>=1) {
                    Intent insub3 = new Intent(Herofillup.this, ZDarkStar.class);
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
                ibaseHP = String.valueOf(Math.round(cosmic.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(cosmic.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(cosmic.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(cosmic.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(cosmic.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(cosmic.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(cosmic.getHeroClass());
                iheroXP = String.valueOf(cosmic.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(cosmic.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(cosmic.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(cosmic.intGrowthwLvl()*100.0/100.0));


                if(leveler<=99 && leveler>=1) {
                    Intent insub4 = new Intent(Herofillup.this, ZCosmic.class);
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
                ibaseHP = String.valueOf(Math.round(chaos.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(chaos.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(chaos.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(chaos.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(chaos.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(chaos.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(chaos.getHeroClass());
                iheroXP = String.valueOf(chaos.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(chaos.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(chaos.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(chaos.intGrowthwLvl()*100.0/100.0));

                if(leveler<=99 && leveler>=1) {
                    Intent insub5 = new Intent(Herofillup.this, ZChaos.class);
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
                ibaseHP = String.valueOf(Math.round(orders.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(orders.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(orders.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(orders.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(orders.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(orders.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(orders.getHeroClass());
                iheroXP = String.valueOf(orders.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(orders.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(orders.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(orders.intGrowthwLvl()*100.0/100.0));

                if(leveler<=99 && leveler>=1) {
                    Intent insub6 = new Intent(Herofillup.this, ZOrders.class);
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
                ibaseHP = String.valueOf(Math.round(blossom.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(blossom.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(blossom.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(blossom.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(blossom.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(blossom.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(blossom.getHeroClass());
                iheroXP = String.valueOf(blossom.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(blossom.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(blossom.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(blossom.intGrowthwLvl()*100.0/100.0));

                if(leveler<=99 && leveler>=1) {
                    Intent insub7 = new Intent(Herofillup.this, ZBlossom.class);
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
                ibaseHP = String.valueOf(Math.round(sworn.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(sworn.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(sworn.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(sworn.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(sworn.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(sworn.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(sworn.getHeroClass());
                iheroXP = String.valueOf(sworn.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(sworn.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(sworn.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(sworn.intGrowthwLvl()*100.0/100.0));

                if(leveler<=99 && leveler>=1) {
                    Intent insub8 = new Intent(Herofillup.this, ZSworn.class);
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
                ibaseHP = String.valueOf(Math.round(bloodmoon.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(bloodmoon.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(bloodmoon.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(bloodmoon.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(bloodmoon.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(bloodmoon.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(bloodmoon.getHeroClass());
                iheroXP = String.valueOf(bloodmoon.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(bloodmoon.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(bloodmoon.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(bloodmoon.intGrowthwLvl()*100.0/100.0));

                if(leveler<=99 && leveler>=1) {
                    Intent insub9 = new Intent(Herofillup.this, ZBloodMoon.class);
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
                ibaseHP = String.valueOf(Math.round(arclight.baseHPwSTR()*100.0/100.0));
                ibaseMP = String.valueOf(Math.round(arclight.baseMPwINT()*100.0/100.0));
                ipAtk = String.valueOf(Math.round(arclight.pAtkGrowth()*100.0/100.0));
                ipDef = String.valueOf(Math.round(arclight.pDefGrowth()*100.0/100.0));
                imAtk = String.valueOf(Math.round(arclight.mAtkGrowth()*100.0/100.0));
                imDef = String.valueOf(Math.round(arclight.mDefGrowth()*100.0/100.0));
                iheroClass = String.valueOf(arclight.getHeroClass());
                iheroXP = String.valueOf(arclight.getHeroXP());
                ibaseSTR = String.valueOf(Math.round(arclight.strGrowthwLvl()*100.0/100.0));
                ibaseAGI = String.valueOf(Math.round(arclight.agiGrowthwLvl()*100.0/100.0));
                ibaseINT = String.valueOf(Math.round(arclight.intGrowthwLvl()*100.0/100.0));


                if(leveler<=99 && leveler>=1) {
                    Intent insub10 = new Intent(Herofillup.this, ZArcLight.class);
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
