package com.mesapplication.monprojet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter_hp extends BaseAdapter {
    Context context_hp;
    int logos_hp[];
    LayoutInflater inflter_hp;

    public CustomAdapter_hp(Context applicationContext, int[] logos_hp) {
        this.context_hp = applicationContext;
        this.logos_hp = logos_hp;
        inflter_hp = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return logos_hp.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter_hp.inflate(R.layout.activity_gridview_hp, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon_hp); // get the reference of ImageView
        icon.setImageResource(logos_hp[i]); // set logo images
        return view;
    }
}
