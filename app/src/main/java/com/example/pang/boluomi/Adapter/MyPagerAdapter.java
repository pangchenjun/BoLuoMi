package com.example.pang.boluomi.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Pang on 2017/6/13.
 */

public class MyPagerAdapter extends FragmentPagerAdapter{
    String [] str={"HOT 热门","BOOKS 书城","VIDEO 视频","BARRIER 结界"};
    ArrayList<Fragment> list;
    public MyPagerAdapter(FragmentManager manager, ArrayList<Fragment> list) {
        super(manager);
        this.list=list;
    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return str[position];
    }
}
