package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MaxMinActivity extends AppCompatActivity {

    TextView txtReturn, txtKq;
    EditText edt1, edt2, edt3;
    Button btnKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_max_min);
        txtKq = (TextView) findViewById(R.id.txtKetQua);
        txtReturn = (TextView) findViewById(R.id.txtreturn);
        btnKetQua = (Button) findViewById(R.id.btnKetQua);
        edt1 = (EditText) findViewById(R.id.edtnum1);
        edt2 = (EditText) findViewById(R.id.edtnum2);
        edt3 = (EditText) findViewById(R.id.edtnum3);

        btnKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(edt1.getText().toString());
                int num2 = Integer.parseInt(edt2.getText().toString());
                int num3 = Integer.parseInt(edt3.getText().toString());

                int max = num1;
                max = max > num2 ? max : num2;
                max = max > num3 ? max : num3;

                int min = num1;
                min = min < num2 ? min : num2;
                min = min < num3 ? min : num3;

                txtKq.setText("Max: "+ max + " | Min: "+min);
            }
        });

        txtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaxMinActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
