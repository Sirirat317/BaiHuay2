package com.example.baihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Kmsuju on 18/10/2559.
 */

public class HuayActivity extends AppCompatActivity {

    protected void onCreate(Bundle sanedInstanceState){
        super.onCreate(sanedInstanceState);
        setContentView(R.layout.activity_huay);
       ///Intent intent = getIntent();
        ///int Ranname =intent.getIntExtra("Ran_name",-1);

      /// TextView RanNumber = (TextView) findViewById(R.id.Number);
       /// RanNumber.setText(Ranname);


        Intent intent = getIntent();
        String str = intent.getStringExtra("text");
        String baiHuay = intent.getStringExtra("huay");

        TextView text = (TextView) findViewById(R.id.Text_1);
        text.setText(str);
        TextView huay1 = (TextView) findViewById(R.id.Text_2);
        huay1.setText(baiHuay);

    }

}
