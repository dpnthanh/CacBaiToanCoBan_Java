package com.example.thanh.cacbaitoancoban_java;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NguyenToActivity extends AppCompatActivity {

    TextView txtReturn, txtKq;
    EditText edt1, edt2;
    Button btnKq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguyen_to);

        txtKq = (TextView) findViewById(R.id.txtKetQua);
        txtReturn = (TextView) findViewById(R.id.txtreturn);
        edt1 = (EditText) findViewById(R.id.edtnuma);
        edt2 = (EditText) findViewById(R.id.edtnumb);
        btnKq = (Button) findViewById(R.id.btnKetQua);

        btnKq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String list = "";
                int num1 = Integer.parseInt(edt1.getText().toString());
                int num2 = Integer.parseInt(edt2.getText().toString());
                System.out.println(num1 + " " + num2);
                if (num1 > num2) {
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                    num1 = num1 - num2;
                }
                for (int i = num1; i <= num2; i++){
                    if (isNguenTo(i)){
                        list += i +" ";
                    }
                }
                txtKq.setText(list);
            }
        });

        txtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NguyenToActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    public boolean isNguenTo(int num){
        if (num < 2) {
            return false;
        } else {
            if (num % 2 == 0) {
                return false;
            } else {
                for (int i = 3; i < Math.sqrt(num); i+=2) {
                    if (num % i == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
