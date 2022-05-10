package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.os.Bundle;
import android.widget.GridView;

public class Hp extends AppCompatActivity {
    GridView simpleGrid_hp;
    int logos_hp[] = {R.drawable.hp1, R.drawable.hp2, R.drawable.hp3,
            R.drawable.hp4, R.drawable.hp5, R.drawable.hp6,
            R.drawable.hp1, R.drawable.hp2, R.drawable.hp3,
            R.drawable.hp4, R.drawable.hp5, R.drawable.hp6, R.drawable.hp1, R.drawable.hp2, R.drawable.hp3,
            R.drawable.hp4, R.drawable.hp5, R.drawable.hp6,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);
        simpleGrid_hp = (GridView) findViewById(R.id.simpleGridView_hp); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter_hp customAdapter_hp = new CustomAdapter_hp(getApplicationContext(), logos_hp);
        simpleGrid_hp.setAdapter(customAdapter_hp);
        // implement setOnItemClickListener event on GridView
        simpleGrid_hp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Hp.this, Hp2.class);
                intent.putExtra("image", logos_hp[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
