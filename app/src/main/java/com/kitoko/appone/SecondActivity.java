package com.kitoko.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView usrnmLbl = findViewById(R.id.usrnmLbl);

        Intent intent = getIntent();

        String usrnm = intent.getStringExtra("usrname");
        usrnmLbl.setText("Welcome "+usrnm);

    }
}