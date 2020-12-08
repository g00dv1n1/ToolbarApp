package com.example.toolbarapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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

        if (id == R.id.action_open_notes) {
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);
        }

        if (id == R.id.action_open_calendar) {
            Intent intentNotes = new Intent(MainActivity.this, CalendarViewActivity.class);
            startActivity(intentNotes);
        }

        if (id == R.id.action_open_spinner) {
            Intent intentNotes = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentNotes);
        }

        if (id == R.id.action_open_checkbox) {
            Intent intentNotes = new Intent(MainActivity.this, CheckBoxActivity.class);
            startActivity(intentNotes);
        }

        if (id == R.id.action_open_healthApp) {
            Intent intentNotes = new Intent(MainActivity.this, HealthAppActivity.class);
            startActivity(intentNotes);
        }

        if (id == R.id.action_open_subscribe) {
            Intent intentNotes = new Intent(MainActivity.this, SubscribeActivity.class);
            startActivity(intentNotes);
        }
        if (id == R.id.action_open_album) {
            Intent intentNotes = new Intent(MainActivity.this, PhotoAlbumActivity.class);
            startActivity(intentNotes);
        }



        return super.onOptionsItemSelected(item);
    }
}