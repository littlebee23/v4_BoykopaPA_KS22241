package com.example.ks_22241_boykopa_v4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.setting);

        ImageButton backBtn = findViewById(R.id.imageButton);
        backBtn.setOnClickListener(v -> finish());

        Button resetBtn = findViewById(R.id.button);
        resetBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Настройки сброшены", Toast.LENGTH_SHORT).show();
        });

        Button locationBtn = findViewById(R.id.button5);
        locationBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Настройка местоположения нажата", Toast.LENGTH_SHORT).show();
        });

        ImageButton rightBtn = findViewById(R.id.imageButton2);
        rightBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Доп. действие", Toast.LENGTH_SHORT).show();
        });
    }
}