package com.example.toolbarapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intentNotes = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.action_open_notes : intentNotes = new Intent(MainActivity.this, NotesActivity.class); break;
            case R.id.action_open_calendar : intentNotes = new Intent(MainActivity.this, CalendarViewActivity.class); break;
            case R.id.action_open_spinner : intentNotes = new Intent(MainActivity.this, SpinnerActivity.class); break;
            case R.id.action_open_checkbox : intentNotes = new Intent(MainActivity.this, CheckBoxActivity.class); break;
            case R.id.action_open_healthApp : intentNotes = new Intent(MainActivity.this, HealthAppActivity.class); break;
            case R.id.action_open_subscribe : intentNotes = new Intent(MainActivity.this, SubscribeActivity.class); break;
            case R.id.action_open_album : intentNotes = new Intent(MainActivity.this, PhotoAlbumActivity.class); break;
        }

        startActivity(intentNotes);
        return super.onOptionsItemSelected(item);
    }
}