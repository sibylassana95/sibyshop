package com.mesapplication.monprojet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter_mac extends BaseAdapter {
    Context context_mac;
    int logos_mac[];
    LayoutInflater inflter_mac;

    public CustomAdapter_mac(Context applicationContext, int[] logos_mac) {
        this.context_mac = applicationContext;
        this.logos_mac = logos_mac;
        inflter_mac = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return logos_mac.length;
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
        view = inflter_mac.inflate(R.layout.activity_gridview_mac, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon_mac); // get the reference of ImageView
        icon.setImageResource(logos_mac[i]); // set logo images
        return view;
    }
}
