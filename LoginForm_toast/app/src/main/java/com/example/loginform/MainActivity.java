package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private EditText usernameField;
    private EditText passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditText fields after setContentView
        usernameField = findViewById(R.id.usernameEditText);
        passwordField = findViewById(R.id.passwordEditText);

        final String validUsername = "johndoe";
        final String validPassword = "password";

        Button loginBtn = findViewById(R.id.button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredUsername = usernameField.getText().toString();
                String enteredPassword = passwordField.getText().toString();

                if (enteredUsername.equals(validUsername) && enteredPassword.equals(validPassword)) {
                    Toast.makeText(MainActivity.this, "Valid credentials", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid credentials. Please try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}