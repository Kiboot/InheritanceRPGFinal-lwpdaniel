package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ZOrders extends AppCompatActivity {

    String dbyesClass, dbyesHp, dbyesMp, dbyesPhysdmg, dbyesMgcdmg, dbyesPhysdef, dbyesMgcdef, dbyesXp, dbyesStr, dbyesAgi,
            dbyesInt, dbyesName;
    int dbyesLevel;

    TextView dbsaClass, dbsaLevel, dbsaHp, dbsaMp, dbsaPhysdmg, dbsaMgcdmg, dbsaPhysdef, dbsaMgcdef, dbsaXp, dbsaStr, dbsaAgi, dbsaInt, dbsaName;
    TextView dbinHp, dbinMp, dbinPhysdmg, dbinMgcdmg, dbinPhysdef, dbinMgcdef, dbinXp, dbinStr, dbinAgi, dbinInt;

    ImageView ocharpic;
    ImageView dbim1, dbim2, dbim3, dbim4, dbim5, dbim6, dbim7, dbim8, dbim9, dbim10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_z_orders);

        //Indicator Textview
        dbinHp = findViewById(R.id.tHP);
        dbinMp = findViewById(R.id.tMP);
        dbinPhysdmg = findViewById(R.id.tPhysDMG);
        dbinMgcdmg = findViewById(R.id.tMgcDMG);
        dbinPhysdef = findViewById(R.id.tPhysDEF);
        dbinMgcdef = findViewById(R.id.tMgcDEF);
        dbinXp = findViewById(R.id.tXP);
        dbinStr = findViewById(R.id.tSTR);
        dbinAgi = findViewById(R.id.tAGI);
        dbinInt = findViewById(R.id.tINT);

        //Image Indicator
        dbim1 = findViewById(R.id.imaHp);
        dbim2 = findViewById(R.id.imaMp);
        dbim3 = findViewById(R.id.imaAtk);
        dbim4 = findViewById(R.id.imaDef);
        dbim5 = findViewById(R.id.imaMgc);
        dbim6 = findViewById(R.id.imaMgcdef);
        dbim7 = findViewById(R.id.imaXp);
        dbim8 = findViewById(R.id.imaStr);
        dbim9 = findViewById(R.id.imaAgi);
        dbim10 = findViewById(R.id.imaInt);

        //Output TextView
        dbsaClass = findViewById(R.id.AngClass);
        dbsaLevel = findViewById(R.id.AngLevel);
        dbsaHp = findViewById(R.id.AngHP);
        dbsaMp = findViewById(R.id.AngMP);
        dbsaPhysdmg = findViewById(R.id.AngPhysDMG);
        dbsaMgcdmg = findViewById(R.id.AngMgcDMG);
        dbsaPhysdef = findViewById(R.id.AngPhysDEF);
        dbsaMgcdef = findViewById(R.id.AngMgcDEF);
        dbsaXp = findViewById(R.id.AngXP);
        dbsaStr = findViewById(R.id.AngSTR);
        dbsaAgi = findViewById(R.id.AngAGI);
        dbsaInt = findViewById(R.id.AngINT);
        dbsaName = findViewById(R.id.AngName);
        ocharpic = findViewById(R.id.OImage);

        //GetIntent
        dbyesClass = getIntent().getStringExtra("heroClassres");
        dbyesLevel = getIntent().getIntExtra("levelres",0);
        dbyesHp = getIntent().getStringExtra("baseHPres");
        dbyesMp = getIntent().getStringExtra("baseMPres");
        dbyesPhysdmg = getIntent().getStringExtra("pAtkres");
        dbyesPhysdef = getIntent().getStringExtra("pDefres");
        dbyesMgcdmg = getIntent().getStringExtra("mAtkres");
        dbyesMgcdef = getIntent().getStringExtra("mDefres");
        dbyesXp = getIntent().getStringExtra("heroXPres");
        dbyesStr = getIntent().getStringExtra("baseSTRres");
        dbyesAgi = getIntent().getStringExtra("baseAGIres");
        dbyesInt = getIntent().getStringExtra("baseINTres");
        dbyesName = getIntent().getStringExtra("nameres");

        //Set text
        dbsaClass.setText(dbyesClass);
        dbsaLevel.setText(String.valueOf(dbyesLevel));
        dbsaName.setText(String.valueOf(dbyesName));
        dbsaHp.setText(dbyesHp);
        dbsaMp.setText(dbyesMp);
        dbsaPhysdmg.setText(dbyesPhysdmg);
        dbsaMgcdmg.setText(dbyesMgcdmg);
        dbsaPhysdef.setText(dbyesPhysdef);
        dbsaMgcdef.setText(dbyesMgcdef);
        dbsaXp.setText(dbyesXp);
        dbsaStr.setText(dbyesStr);
        dbsaAgi.setText(dbyesAgi);
        dbsaInt.setText(dbyesInt);


    }
}