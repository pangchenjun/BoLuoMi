package com.example.pang.boluomi.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pang.boluomi.Adapter.MyPagerAdapter;
import com.example.pang.boluomi.Home_Fragment.Fragment3_1;
import com.example.pang.boluomi.Home_Fragment.Fragment3_2;
import com.example.pang.boluomi.Home_Fragment.Fragment3_3;
import com.example.pang.boluomi.Home_Fragment.Fragment3_4;
import com.example.pang.boluomi.R;

import java.util.ArrayList;


public class Fragment3 extends Fragment {
    ViewPager viewPager;
    ArrayList<Fragment> list=new ArrayList<>();
    TabLayout tablayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment3, null);
        tablayout= (TabLayout) inflate.findViewById(R.id.tablayout);
        viewPager= (ViewPager) inflate.findViewById(R.id.viewpager);
        list.add(new Fragment3_1());
        list.add(new Fragment3_2());
        list.add(new Fragment3_3());
        list.add(new Fragment3_4());
        FragmentManager manager = getActivity().getSupportFragmentManager();
        MyPagerAdapter adapter=new MyPagerAdapter(manager,list);
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);
        return inflate;
    }


}
