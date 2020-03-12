package com.example.inheritancerpgfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import android.widget.ImageView;

public class XMonfive extends AppCompatActivity {

    String yesmHp, yesmMp, yesmPhysdmg, yesmMgcdmg, yesmPhysdef, yesmMgcdef, yesmName, yesmLevel, yesmDes;

    TextView samLevel, samHp, samMp, samPhysdmg, samMgcdmg, samPhysdef, samMgcdef,samName, samDes;
    TextView inmHp, inmMp, inmPhysdmg, inmMgcdmg, inmPhysdef, inmMgcdef;

    ImageView fivemonpic;

    ImageView s1, s2, s3, s4, s5, s6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_monfive);

        //Indicator Textview
        inmHp = findViewById(R.id.teHP);
        inmMp = findViewById(R.id.teMP);
        inmPhysdmg = findViewById(R.id.tePhysDMG);
        inmMgcdmg = findViewById(R.id.teMgcDMG);
        inmPhysdef = findViewById(R.id.tePhysDEF);
        inmMgcdef = findViewById(R.id.teMgcDEF);

        //Output TextView
        samLevel = findViewById(R.id.daLevel);
        samHp = findViewById(R.id.daHP);
        samMp = findViewById(R.id.daMP);
        samPhysdmg = findViewById(R.id.daPhysDMG);
        samMgcdmg = findViewById(R.id.daMgcDMG);
        samPhysdef = findViewById(R.id.daPhysDEF);
        samMgcdef = findViewById(R.id.daMgcDEF);
        samName = findViewById(R.id.daName);
        samDes = findViewById(R.id.daDes);

        //ImageView
        s1 = findViewById(R.id.monim1);
        s2 = findViewById(R.id.monim2);
        s3 = findViewById(R.id.monim3);
        s4 = findViewById(R.id.monim4);
        s5 = findViewById(R.id.monim5);
        s6 = findViewById(R.id.monim6);


        //GetIntent
        yesmLevel = getIntent().getStringExtra("mLevel");
        yesmHp = getIntent().getStringExtra("mHPres");
        yesmMp = getIntent().getStringExtra("mMPres");
        yesmPhysdmg = getIntent().getStringExtra("mPatkres");
        yesmPhysdef = getIntent().getStringExtra("mPdefres");
        yesmMgcdmg = getIntent().getStringExtra("mMatkres");
        yesmMgcdef = getIntent().getStringExtra("mMdefres");
        yesmName = getIntent().getStringExtra("mName");
        yesmDes = getIntent().getStringExtra("mDesres");

        //Set text
        samLevel.setText(String.valueOf(yesmLevel));
        samName.setText(String.valueOf(yesmName));
        samHp.setText(yesmHp);
        samMp.setText(yesmMp);
        samPhysdmg.setText(yesmPhysdmg);
        samMgcdmg.setText(yesmMgcdmg);
        samPhysdef.setText(yesmPhysdef);
        samMgcdef.setText(yesmMgcdef);
        samDes.setText(yesmDes);

        fivemonpic = findViewById(R.id.Monfiveim);



    }
}
