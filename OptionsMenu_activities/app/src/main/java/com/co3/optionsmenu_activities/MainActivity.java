package com.co3.optionsmenu_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
            Intent intent1 = new Intent(MainActivity.this, Activity1.class);
            startActivity(intent1);
            return true;
        } else if (id == R.id.item2) {
            Intent intent2 = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent2);
            return true;
        } else if (id == R.id.item3) {
            Intent intent3 = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent3);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}