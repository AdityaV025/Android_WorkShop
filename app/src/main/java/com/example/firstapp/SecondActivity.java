package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mEmail = findViewById(R.id.userEmail);

        String userEmail = getIntent().getStringExtra("EMAIL");

        mEmail.setText("My Email is: " + userEmail);

    }
}