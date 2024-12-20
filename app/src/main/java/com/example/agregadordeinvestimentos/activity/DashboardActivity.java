package com.example.agregadordeinvestimentos.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.agregadordeinvestimentos.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageView iconMenu = findViewById(R.id.iconMenu);
        ImageView iconSettings = findViewById(R.id.iconSettings);

        iconMenu.setOnClickListener(v -> {

        });

        iconSettings.setOnClickListener(v -> {

        });

        

    }


}