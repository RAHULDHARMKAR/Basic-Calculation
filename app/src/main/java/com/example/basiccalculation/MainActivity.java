package com.example.basiccalculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1,num2;
    Button sum1,sub,mul,div,cleartext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        sum1 = findViewById(R.id.sum1);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        cleartext = findViewById(R.id.cleartext);
        sum1.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        cleartext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sum1:
                String s1 = num1.getText().toString();
                String s2 = num2.getText().toString();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int total = a + b;
                Toast.makeText(this, "Sum is "+ String.valueOf(total), Toast.LENGTH_SHORT).show();
                break;
            case R.id.sub:
                String s3 = num1.getText().toString();
                String s4 = num2.getText().toString();
                int a1 = Integer.parseInt(s3);
                int a2 = Integer.parseInt(s4);
                int total1 = a1 - a2;
                Toast.makeText(this, "Sub is "+ String.valueOf(total1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.mul:
                String s5 = num1.getText().toString();
                String s6 = num2.getText().toString();
                int a3 = Integer.parseInt(s5);
                int a4 = Integer.parseInt(s6);
                int total2 = a3 * a4;
                Toast.makeText(this, "Mul is "+ String.valueOf(total2) , Toast.LENGTH_SHORT).show();
                break;
            case R.id.div:
                String s7 = num1.getText().toString();
                String s8 = num2.getText().toString();
                int a5 = Integer.parseInt(s7);
                int a6 = Integer.parseInt(s8);
                int total3 = a5 / a6;
                Toast.makeText(this, "Div is "+ String.valueOf(total3) , Toast.LENGTH_SHORT).show();
                break;
            case R.id.cleartext:
                num1.setText(" ");
                num2.setText(" ");
                break;
        }

    }
}
