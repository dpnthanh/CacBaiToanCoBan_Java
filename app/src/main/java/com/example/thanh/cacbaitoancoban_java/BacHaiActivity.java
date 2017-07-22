package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BacHaiActivity extends AppCompatActivity {
    TextView txtReturn, txtKq1, txtKq2;
    Button btnKetQua;
    EditText edta, edtb, edtc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bac_hai);

        txtReturn = (TextView) findViewById(R.id.txtreturn);
        txtKq1 = (TextView) findViewById(R.id.txtKq1);
        txtKq2 = (TextView) findViewById(R.id.txtKq2);
        btnKetQua = (Button) findViewById(R.id.btnKetQua);
        edta = (EditText) findViewById(R.id.edtnuma);
        edtb = (EditText) findViewById(R.id.edtnumb);
        edtc = (EditText) findViewById(R.id.edtnumc);

        txtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BacHaiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edta.getText().toString());
                double b = Double.parseDouble(edtb.getText().toString());
                double c = Double.parseDouble(edtc.getText().toString());
                if(a == 0){
                    if(b == 0.0){
                        if(c == 0.0){
                            txtKq1.setText(R.string.VSNghiem);
                            txtKq2.setText("");
                        }else {
                            txtKq1.setText(R.string.VoNghiem);
                            txtKq2.setText("");
                        }
                    } else {
                        double kq = -c/b;
                        txtKq1.setText("Phương trình có nghiệm: " + kq);
                        txtKq2.setText("");
                    }

                } else {

                    double delta = Math.pow(b, 2) - 4 * a * c;
                    if (delta < 0) {
                        txtKq1.setText(R.string.VoNghiem);
                        txtKq2.setText("");
                    } else if (delta == 0) {
                        double kq = -b / 2 * a;
                        txtKq1.setText(R.string.NghiemKep);
                        txtKq2.setText("x = " + kq);
                    } else {
                        double sqrtDelta = Math.sqrt(delta);
                        double kqX1 = (-b - sqrtDelta) / (2 * a);
                        double kqX2 = (-b + sqrtDelta) / (2 * a);
                        txtKq1.setText("X1= " + kqX1);
                        txtKq2.setText("X2= " + kqX2);
                    }
                }
            }
        });
    }
}
