package com.example.pang.boluomi.Adapter;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pang.boluomi.Domes.Dome;
import com.example.pang.boluomi.R;

import java.util.ArrayList;

/**
 * Created by Pang on 2017/6/13.
 */

public class MyAdapter extends BaseAdapter{
    FragmentActivity activity;
    ArrayList<Dome> list;
    public MyAdapter(FragmentActivity activity, ArrayList<Dome> list) {
        this.activity=activity;
        this.list=list;
    }


    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public Object getItem(int position) {
        return list.get(position);
    }



    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewholder h=new Viewholder();
        if(convertView==null){
            convertView= LayoutInflater.from(activity).inflate(R.layout.layout1,null);
            h.img= (ImageView) convertView.findViewById(R.id.image);
            h.title= (TextView) convertView.findViewById(R.id.title);
            h.content= (TextView) convertView.findViewById(R.id.content);
            convertView.setTag(h);
        }else{

    h= (Viewholder) convertView.getTag();
        }
        h.img.setImageResource(list.get(position).getImage());
        h.title.setText(list.get(position).getTitle());
        h.content.setText(list.get(position).getContent());
        h.content.setTextColor(Color.GRAY);
        return convertView;
    }
    class Viewholder{
        ImageView img;
        TextView title,content;
    }
}
