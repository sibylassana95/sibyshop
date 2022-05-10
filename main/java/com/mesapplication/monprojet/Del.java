package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.os.Bundle;
import android.widget.GridView;

public class Del extends AppCompatActivity {
    GridView simpleGrid_del;
    int logos_del[] = {R.drawable.del1, R.drawable.del2, R.drawable.del3,
            R.drawable.del4, R.drawable.del5, R.drawable.del6,
            R.drawable.del1, R.drawable.del2, R.drawable.del3,
            R.drawable.del4, R.drawable.del5, R.drawable.del6, R.drawable.del1, R.drawable.del2, R.drawable.del3,
            R.drawable.del4, R.drawable.del5, R.drawable.del6,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del);
        simpleGrid_del = (GridView) findViewById(R.id.simpleGridView_del); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        CustomAdapter_del customAdapter_del = new CustomAdapter_del(getApplicationContext(), logos_del);
        simpleGrid_del.setAdapter(customAdapter_del);
        // implement setOnItemClickListener event on GridView
        simpleGrid_del.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Del.this, Del2.class);
                intent.putExtra("image", logos_del[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
