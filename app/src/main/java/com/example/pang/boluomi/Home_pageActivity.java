package com.example.pang.boluomi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.example.pang.boluomi.Fragment.Fragment1;
import com.example.pang.boluomi.Fragment.Fragment2;
import com.example.pang.boluomi.Fragment.Fragment3;
import com.example.pang.boluomi.Fragment.Fragment4;
import com.example.pang.boluomi.Fragment.Fragment5;
import com.example.pang.boluomi.Fragment.Fragment6;

public class Home_pageActivity extends AppCompatActivity implements View.OnClickListener{
RadioButton r1,r2,r3,r4,r5,r6;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;
    Fragment5 fragment5;
    Fragment6 fragment6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        r1= (RadioButton) findViewById(R.id.rb_video);
        r2= (RadioButton) findViewById(R.id.rb_book);
        r3= (RadioButton) findViewById(R.id.rb_home);
        r4= (RadioButton) findViewById(R.id.rb_jiejie);
        r5= (RadioButton) findViewById(R.id.rb_maimai);
        r6= (RadioButton) findViewById(R.id.rb_mine);
        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);
        r6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager. beginTransaction();
            hide(transaction);

        switch (v.getId()){
            case R.id.rb_video:
                r1.setTextColor(Color.WHITE);
                r2.setTextColor(Color.BLACK);
                r3.setTextColor(Color.BLACK);
                r4.setTextColor(Color.BLACK);
                r5.setTextColor(Color.BLACK);
                r6.setTextColor(Color.BLACK);
                if(fragment1==null){
                    fragment1=new Fragment1();
                    transaction.add(R.id.fl, fragment1);
                }else{
                    transaction.show(fragment1);
                }

                break;
            case R.id.rb_book:
                r1.setTextColor(Color.BLACK);
                r3.setTextColor(Color.BLACK);
                r4.setTextColor(Color.BLACK);
                r5.setTextColor(Color.BLACK);
                r6.setTextColor(Color.BLACK);
                r2.setTextColor(Color.WHITE);
                if(fragment2==null){
                    fragment2=new Fragment2();
                    transaction.add(R.id.fl, fragment2);
                }else{
                    transaction.show(fragment2);
                }
                break;
            case R.id.rb_home:
                r2.setTextColor(Color.BLACK);
                r1.setTextColor(Color.BLACK);
                r4.setTextColor(Color.BLACK);
                r5.setTextColor(Color.BLACK);
                r6.setTextColor(Color.BLACK);
                r3.setTextColor(Color.WHITE);
                if(fragment3==null){
                    fragment3=new Fragment3();
                    transaction.add(R.id.fl, fragment3);
                }else{
                    transaction.show(fragment3);
                }
                break;
            case R.id.rb_jiejie:
                r2.setTextColor(Color.BLACK);
                r3.setTextColor(Color.BLACK);
                r1.setTextColor(Color.BLACK);
                r5.setTextColor(Color.BLACK);
                r6.setTextColor(Color.BLACK);
                r4.setTextColor(Color.WHITE);
                if(fragment4==null){
                    fragment4=new Fragment4();
                    transaction.add(R.id.fl, fragment4);
                }else{
                    transaction.show(fragment4);
                }
                break;
            case R.id.rb_maimai:
                r2.setTextColor(Color.BLACK);
                r3.setTextColor(Color.BLACK);
                r4.setTextColor(Color.BLACK);
                r1.setTextColor(Color.BLACK);
                r6.setTextColor(Color.BLACK);
                r5.setTextColor(Color.WHITE);
                if(fragment5==null){
                    fragment5=new Fragment5();
                    transaction.add(R.id.fl, fragment5);
                }else{
                    transaction.show(fragment5);
                }
                break;
            case R.id.rb_mine:
                r2.setTextColor(Color.BLACK);
                r3.setTextColor(Color.BLACK);
                r4.setTextColor(Color.BLACK);
                r5.setTextColor(Color.BLACK);
                r1.setTextColor(Color.BLACK);
                r6.setTextColor(Color.WHITE);
                if(fragment6==null){
                    fragment6=new Fragment6();
                    transaction.add(R.id.fl, fragment6);
                }else{
                    transaction.show(fragment6);
                }
                break;

        }
        transaction.commit();
    }
    public void hide( FragmentTransaction transaction){
        if(fragment1!=null){
            transaction.hide(fragment1);
        }
        if(fragment2!=null){
            transaction.hide(fragment2);
        }
        if(fragment3!=null){
            transaction.hide(fragment3);
        }
        if(fragment4!=null){
            transaction.hide(fragment4);
        }
        if(fragment5!=null){
            transaction.hide(fragment5);
        }
        if(fragment6!=null){
            transaction.hide(fragment6);
        }

    }
}
