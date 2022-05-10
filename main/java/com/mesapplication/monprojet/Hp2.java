package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Hp2 extends AppCompatActivity {
    ImageView selectedImage_hp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp2);
        selectedImage_hp = (ImageView) findViewById(R.id.selectedImage_hp);

        Intent intent = getIntent();
        selectedImage_hp.setImageResource(intent.getIntExtra("image", 0));

    }
}
