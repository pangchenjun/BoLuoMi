package com.example.pang.boluomi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class RegisteredActivity extends AppCompatActivity {
Button registered;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered);
        registered= (Button) findViewById(R.id.registered);
        registered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(RegisteredActivity.this,RegisteredActivity2.class);
                startActivity(in);
            }
        });
    }
}
