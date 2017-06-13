package com.example.pang.boluomi.Home_Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;

import com.example.pang.boluomi.Adapter.MyAdapter;
import com.example.pang.boluomi.Adapter.TestNormalAdapter;
import com.example.pang.boluomi.Domes.Dome;
import com.example.pang.boluomi.R;
import com.jude.rollviewpager.RollPagerView;

import java.util.ArrayList;

public class Fragment3_1 extends Fragment {
    RollPagerView mRollViewPager;
    GridView gridView;
    int [] image={R.drawable.w,R.drawable.e,R.drawable.t,R.drawable.q,R.drawable.w,R.drawable.e,R.drawable.t,R.drawable.q,R.drawable.w,R.drawable.e,R.drawable.t,R.drawable.q
    ,R.drawable.w,R.drawable.e,R.drawable.t,R.drawable.q,R.drawable.w,R.drawable.e,R.drawable.t,R.drawable.q};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_fragment3, null);
        mRollViewPager = (RollPagerView) inflate.findViewById(R.id.roll_view_pager);

        //设置播放时间间隔
        mRollViewPager.setPlayDelay(1000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        gridView= (GridView) inflate.findViewById(R.id.gridview);
        ArrayList<Dome> list=new ArrayList<>();
        for(int i=0;i<20;i++){
            Dome dome=new Dome();
            dome.setImage(image[i]);
            dome.setTitle("我的未婚妻是非人类");
            dome.setContent("为什么要伤害我的眼睛");
            list.add(dome);
        }
    MyAdapter adapter=new MyAdapter(getActivity(),list);
        gridView.setAdapter(adapter);
        setListViewHeightBasedOnChildren(gridView);
        return inflate;
    }
    public void setListViewHeightBasedOnChildren(GridView listview) {
        // 获取ListView对应的Adapter
        ListAdapter adapter = listview.getAdapter();
        if (adapter == null) {
            Log.e("1211132",adapter.getCount()+"");
            return;
        }


        int totalHeight = 0;
        Log.e("1211132",adapter.getCount()+"");
        for (int i = 0; i < adapter.getCount(); i++) {
            // listAdapter.getCount()返回数据项的数目
            View listItem = adapter.getView(i, null, listview);
            // 计算子项View 的宽高
            listItem.measure(0, 0);
            // 统计所有子项的总高度
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listview.getLayoutParams();
        params.height = totalHeight+ (listview.getHeight() * (adapter.getCount() - 1));
        // listView.getDividerHeight()获取子项间分隔符占用的高度
        // params.height最后得到整个ListView完整显示需要的高度
        listview.setLayoutParams(params);

    }
}
