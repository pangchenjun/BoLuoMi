package com.example.pang.boluomi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegisteredActivity2 extends AppCompatActivity {
Button determine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered2);
        determine= (Button) findViewById(R.id.determine);
        determine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(RegisteredActivity2.this,Home_pageActivity.class);
                startActivity(in);
            }
        });
    }
}
