package com.example.pang.boluomi;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.pang.boluomi.R.drawable.shap;
import static com.example.pang.boluomi.R.drawable.shap1;


public class VerificationActivity extends AppCompatActivity {
Button Verification_code_bt;
    EditText phone_number,Verification_code;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);
        Verification_code_bt= (Button) findViewById(R.id.Verification_code_bt);
        phone_number= (EditText) findViewById(R.id.phone_number);
        Verification_code= (EditText) findViewById(R.id.Verification_code);

        phone_number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if(s.length()==11) {
                    Verification_code_bt.setBackground(getDrawable(shap));
                    Verification_code_bt.setTextColor(Color.WHITE);
                }  else {

                    Verification_code_bt.setBackground(getDrawable(shap1));
                    Verification_code_bt.setTextColor(Color.GRAY);
                }
            }
        });
        Verification_code_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(VerificationActivity.this,RegisteredActivity.class);
                startActivity(in);
            }
        });

    }
}
