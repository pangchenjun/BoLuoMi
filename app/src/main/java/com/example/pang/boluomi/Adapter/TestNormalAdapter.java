package com.example.pang.boluomi.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.pang.boluomi.R;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;

/**
 * Created by Pang on 2017/6/13.
 */

public class TestNormalAdapter extends StaticPagerAdapter {
    private int[] imgs = {
            R.drawable.q,
            R.drawable.e,
            R.drawable.t,
            R.drawable.y,
    };
    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getCount() {
        return imgs.length;
    }
}
