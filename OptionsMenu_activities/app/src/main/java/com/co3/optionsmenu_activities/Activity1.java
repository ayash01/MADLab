package com.co3.optionsmenu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.*;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        TextView textView = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.button1);

        textView.setText("You selected Option 1");

        button1.setOnClickListener(v -> {
            finish();
        });
    }
}