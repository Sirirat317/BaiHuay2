package com.example.baihuay;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Huay huay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        huay = new Huay();
        Button button1 = (Button)findViewById(R.id.button_2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HuayActivity.class);
                intent.putExtra("text","เลขท้าย 2 ตัว");
                intent.putExtra("huay",huay.getRandomTwoDigits());
                startActivity(intent);
            }
        });
        Button button3 = (Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HuayActivity.class);
                intent.putExtra("text","เลขท้าย 3 ตัว");
                intent.putExtra("huay",huay.getRandomThreeDigits());
                startActivity(intent);
            }
        });
    }
    }

