package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class Herores extends AppCompatActivity {

    String yesClass, yesHp, yesMp, yesPhysdmg, yesMgcdmg, yesPhysdef, yesMgcdef, yesXp, yesStr, yesAgi, yesInt, yesName;
    int yesLevel;

    TextView saClass, saLevel, saHp, saMp, saPhysdmg, saMgcdmg, saPhysdef, saMgcdef, saXp, saStr, saAgi, saInt, saName;
    TextView inClass, inLevel, inHp, inMp, inPhysdmg, inMgcdmg, inPhysdef, inMgcdef, inXp, inStr, inAgi, inInt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herores);


        //Indicator Textview
        inClass = findViewById(R.id.tClass);
        inLevel = findViewById(R.id.tLevel);
        inHp = findViewById(R.id.tHP);
        inMp = findViewById(R.id.tMP);
        inPhysdmg = findViewById(R.id.tPhysDMG);
        inMgcdmg = findViewById(R.id.tMgcDMG);
        inPhysdef = findViewById(R.id.tPhysDEF);
        inMgcdef = findViewById(R.id.tMgcDEF);
        inXp = findViewById(R.id.tXP);
        inStr = findViewById(R.id.tSTR);
        inAgi = findViewById(R.id.tAGI);
        inInt = findViewById(R.id.tINT);

        //Output TextView
        saClass = findViewById(R.id.AngClass);
        saLevel = findViewById(R.id.AngLevel);
        saHp = findViewById(R.id.AngHP);
        saMp = findViewById(R.id.AngMP);
        saPhysdmg = findViewById(R.id.AngPhysDMG);
        saMgcdmg = findViewById(R.id.AngMgcDMG);
        saPhysdef = findViewById(R.id.AngPhysDEF);
        saMgcdef = findViewById(R.id.AngMgcDEF);
        saXp = findViewById(R.id.AngXP);
        saStr = findViewById(R.id.AngSTR);
        saAgi = findViewById(R.id.AngAGI);
        saInt = findViewById(R.id.AngINT);
        saName = findViewById(R.id.AngName);

        //GetIntent
        yesClass = getIntent().getStringExtra("heroClassres");
        yesLevel = getIntent().getIntExtra("levelres",0);
        yesHp = getIntent().getStringExtra("baseHPres");
        yesMp = getIntent().getStringExtra("baseMPres");
        yesPhysdmg = getIntent().getStringExtra("pAtkres");
        yesPhysdef = getIntent().getStringExtra("pDefres");
        yesMgcdmg = getIntent().getStringExtra("mAtkres");
        yesMgcdef = getIntent().getStringExtra("mDefres");
        yesXp = getIntent().getStringExtra("heroXPres");
        yesStr = getIntent().getStringExtra("baseSTRres");
        yesAgi = getIntent().getStringExtra("baseAGIres");
        yesInt = getIntent().getStringExtra("baseINTres");
        yesName = getIntent().getStringExtra("nameres");

        //Set text
        saClass.setText(yesClass);
        saLevel.setText(String.valueOf(yesLevel));
        saName.setText(String.valueOf(yesName));
        saHp.setText(yesHp);
        saMp.setText(yesMp);
        saPhysdmg.setText(yesPhysdmg);
        saMgcdmg.setText(yesMgcdmg);
        saPhysdef.setText(yesPhysdef);
        saMgcdef.setText(yesMgcdef);
        saXp.setText(yesXp);
        saStr.setText(yesStr);
        saAgi.setText(yesAgi);
        saInt.setText(yesInt);


    }
}
