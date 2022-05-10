package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Categorie extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
        CardView cardView_hp=findViewById(R.id.hp);
        CardView cardView_del=findViewById(R.id.del);
        CardView cardView_lenovo=findViewById(R.id.lenovo);
        CardView cardView_mac=findViewById(R.id.mac);
     cardView_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Hp.class);
                startActivity(intent);
            }
        });
        cardView_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Del.class);
                startActivity(intent);
            }
        });
        cardView_lenovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Lenovo.class);
                startActivity(intent);
            }
        });
        cardView_mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), Mac.class);
                startActivity(intent);
            }
        });

    }
}