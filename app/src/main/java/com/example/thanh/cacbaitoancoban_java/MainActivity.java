package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBacNhat, btnBacHai, btnMaxMin, btnNguyenTo, btnsum, btnUocBoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBacNhat = (Button) findViewById(R.id.btnBacNhat);
        btnBacHai = (Button) findViewById(R.id.btnBacHai);
        btnMaxMin = (Button) findViewById(R.id.btnMaxMin);
        btnNguyenTo = (Button) findViewById(R.id.btnNguyenTo);
        btnsum = (Button) findViewById(R.id.btnSum);
        btnUocBoi = (Button) findViewById(R.id.btnUocBoi);

        btnBacNhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BacNhatActivity.class);
                startActivity(intent);
            }
        });

        btnBacHai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BacHaiActivity.class);
                startActivity(intent);

            }
        });
        btnMaxMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MaxMinActivity.class);
                startActivity(intent);
            }
        });
        btnNguyenTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NguyenToActivity.class);
                startActivity(intent);
            }
        });
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TinhTongActivity.class);
                startActivity(intent);
            }
        });
        btnUocBoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UocBoiActivity.class);
                startActivity(intent);
            }
        });

    }
}
