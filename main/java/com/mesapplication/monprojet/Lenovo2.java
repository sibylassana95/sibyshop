package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Lenovo2 extends AppCompatActivity {
    ImageView selectedImage_leno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leno2);
        selectedImage_leno = (ImageView) findViewById(R.id.selectedImage_leno);

        Intent intent = getIntent();
        selectedImage_leno.setImageResource(intent.getIntExtra("image", 0));

    }
}
