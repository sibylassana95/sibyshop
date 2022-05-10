package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.os.Bundle;
import android.widget.GridView;

public class Lenovo extends AppCompatActivity {
    GridView simpleGrid_leno;
    int logos_leno[] = {R.drawable.leno1, R.drawable.leno2, R.drawable.leno3,
            R.drawable.leno4, R.drawable.leno5, R.drawable.leno6,
            R.drawable.leno1, R.drawable.leno2, R.drawable.leno3,
            R.drawable.leno4, R.drawable.leno5, R.drawable.leno6,R.drawable.leno1, R.drawable.leno2, R.drawable.leno3,
            R.drawable.leno4, R.drawable.leno5, R.drawable.leno6,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leno);
        simpleGrid_leno = (GridView) findViewById(R.id.simpleGridView_leno); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter_leno customAdapter_leno = new CustomAdapter_leno(getApplicationContext(), logos_leno);
        simpleGrid_leno.setAdapter(customAdapter_leno);
        // implement setOnItemClickListener event on GridView
        simpleGrid_leno.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Lenovo.this, Lenovo2.class);
                intent.putExtra("image", logos_leno[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
