package com.mesapplication.monprojet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter_del extends BaseAdapter {
    Context context_del;
    int logos_del[];
    LayoutInflater inflter_del;

    public CustomAdapter_del(Context applicationContext, int[] logos_del) {
        this.context_del = applicationContext;
        this.logos_del = logos_del;
        inflter_del = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return logos_del.length;
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
        view = inflter_del.inflate(R.layout.activity_gridview_del, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon_del); // get the reference of ImageView
        icon.setImageResource(logos_del[i]); // set logo images
        return view;
    }
}
