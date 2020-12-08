package com.example.toolbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubscribeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        final EditText login = findViewById(R.id.login);
        final EditText email = findViewById(R.id.email);
        final TextView result = findViewById(R.id.textResult);

        Button buttonOk = findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lg = login.getText().toString();
                String em = email.getText().toString();
                String resultText = getString(R.string.message, lg, em);
                result.setText(resultText);
            }
        });
        Button buttonClean = findViewById(R.id.buttonClean);
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                login.setText("");
                email.setText("");
            }
        });
    }
}