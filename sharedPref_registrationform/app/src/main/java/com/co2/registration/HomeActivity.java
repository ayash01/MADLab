package com.co2.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.widget.*;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        Button logOutBtn = findViewById(R.id.logOutBtn);

        SharedPreferences sharedPreferences = getSharedPreferences("prefs", MODE_PRIVATE);

        String fullname = sharedPreferences.getString("fullname", null);
        String username = sharedPreferences.getString("username", null);
        String password = sharedPreferences.getString("password", null);

        welcomeTextView.setText(String.format("Welcome %s. Your provided username is '%s' and your password is '%s'", fullname, username, password));

        logOutBtn.setOnClickListener(v -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.commit();
            finish();
        });
    }
}

