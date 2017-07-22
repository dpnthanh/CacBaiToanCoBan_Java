package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BacNhatActivity extends AppCompatActivity {
    TextView txtReturn, txtKQ;
    EditText edta, edtb;
    Button btnKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bac_nhat);

        edta = (EditText) findViewById(R.id.edtnuma);
        edtb = (EditText) findViewById(R.id.edtnumb);
        txtReturn = (TextView) findViewById(R.id.txtreturn);
        txtKQ = (TextView) findViewById(R.id.txtKetQua);
        btnKQ = (Button) findViewById(R.id.btnKetQua);

        txtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BacNhatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edta.getText().toString());
                double b = Double.parseDouble(edtb.getText().toString());

                if(a == 0.0){
                    if(b == 0.0){
                        txtKQ.setText(R.string.VSNghiem);
                    }else {
                        txtKQ.setText(R.string.VoNghiem);
                    }
                } else {
                    double kq = -b/a;
                    txtKQ.setText("Phương trình có nghiệm: " + kq);
                }
            }
        });
    }
}
