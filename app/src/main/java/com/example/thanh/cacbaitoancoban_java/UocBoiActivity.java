package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UocBoiActivity extends AppCompatActivity {
    TextView txtReturn, txtKq1, txtKq2;
    Button btnKq;
    EditText edt1, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uoc_boi);
        txtReturn = (TextView) findViewById(R.id.txtreturn);
        txtKq1 = (TextView) findViewById(R.id.txtKetQua1);
        txtKq2 = (TextView) findViewById(R.id.txtKetQua2);
        edt1 = (EditText) findViewById(R.id.edtnuma);
        edt2 = (EditText) findViewById(R.id.edtnumb);
        btnKq = (Button) findViewById(R.id.btnKetQua);


        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt1.getText().toString());
                int b = Integer.parseInt(edt2.getText().toString());
                txtKq1.setText("Ước chung lớn nhất: "+uocChungLonNhat(a, b));
                txtKq2.setText("Bội chung nhỏ nhất: "+boiChungNhoNhat(a, b));
            }
        });
        txtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UocBoiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public int uocChungLonNhat(int a, int b){
        return (b == 0) ? a : uocChungLonNhat(b, a % b);
    }
    public int boiChungNhoNhat(int a, int b){
        return (a*b)/uocChungLonNhat(a, b);
    }
}
