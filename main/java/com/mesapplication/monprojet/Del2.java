package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Del2 extends AppCompatActivity {
    ImageView selectedImage_del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del2);
        selectedImage_del = (ImageView) findViewById(R.id.selectedImage_del);

        Intent intent = getIntent();
        selectedImage_del.setImageResource(intent.getIntExtra("image", 0));

    }
}
