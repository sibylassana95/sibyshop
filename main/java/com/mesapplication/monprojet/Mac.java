package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.os.Bundle;
import android.widget.GridView;

public class Mac extends AppCompatActivity {
    GridView simpleGrid_mac;
    int logos_mac[] = {R.drawable.mac1, R.drawable.mac2, R.drawable.mac3,
            R.drawable.mac4, R.drawable.mac5, R.drawable.mac6,
            R.drawable.mac1, R.drawable.mac2, R.drawable.mac3,
            R.drawable.mac4, R.drawable.mac5, R.drawable.mac6,R.drawable.mac1, R.drawable.mac2, R.drawable.mac3,
            R.drawable.mac4, R.drawable.mac5, R.drawable.mac6,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac);
        simpleGrid_mac = (GridView) findViewById(R.id.simpleGridView_mac); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter_mac customAdapter_mac = new CustomAdapter_mac(getApplicationContext(), logos_mac);
        simpleGrid_mac.setAdapter(customAdapter_mac);
        // implement setOnItemClickListener event on GridView
        simpleGrid_mac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Mac.this, Mac2.class);
                intent.putExtra("image", logos_mac[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
