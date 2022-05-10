package com.mesapplication.monprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Mac2 extends AppCompatActivity {
    ImageView selectedImage_mac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac2);
        selectedImage_mac = (ImageView) findViewById(R.id.selectedImage_mac);

        Intent intent = getIntent();
        selectedImage_mac.setImageResource(intent.getIntExtra("image", 0));

    }
}
