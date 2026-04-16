package com.example.ks_22241_boykopa_v4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalArea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_area);

        ImageButton settings = findViewById(R.id.imageButton5);
        Button exit = findViewById(R.id.button2);
        Button online = findViewById(R.id.button3);
        Button map = findViewById(R.id.button4);

        settings.setOnClickListener(v ->
                startActivity(new Intent(this, Setting.class))
        );

        exit.setOnClickListener(v -> finish());

        online.setOnClickListener(v -> {
        });

        map.setOnClickListener(v -> {
            try {
                Uri uri = Uri.parse("https://www.google.com/maps/search/?api=1&query=Zagreb");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}