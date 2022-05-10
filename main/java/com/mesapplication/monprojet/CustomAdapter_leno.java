package com.mesapplication.monprojet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter_leno extends BaseAdapter {
    Context context_leno;
    int logos_leno[];
    LayoutInflater inflter_leno;

    public CustomAdapter_leno(Context applicationContext, int[] logos_leno) {
        this.context_leno = applicationContext;
        this.logos_leno = logos_leno;
        inflter_leno = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return logos_leno.length;
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
        view = inflter_leno.inflate(R.layout.activity_gridview_leno, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.icon_leno); // get the reference of ImageView
        icon.setImageResource(logos_leno[i]); // set logo images
        return view;
    }
}
