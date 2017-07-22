package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TinhTongActivity extends AppCompatActivity {
    TextView txtReturn, txtKq;
    EditText edtNumber;
    Button btnKq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinh_tong);
        txtReturn = (TextView) findViewById(R.id.txtreturn);
        txtKq = (TextView) findViewById(R.id.txtKetQua);
        edtNumber = (EditText) findViewById(R.id.edtnuma);
        btnKq = (Button) findViewById(R.id.btnKetQua);

        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(edtNumber.getText().toString());
                txtKq.setText("Tổng: "+sum(num));
            }
        });
        txtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TinhTongActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public int sum(int n){
        int s = 0;
        for (int i = 0; i <= n; i++){
            s += i;
        }
        return s;
    }
}
