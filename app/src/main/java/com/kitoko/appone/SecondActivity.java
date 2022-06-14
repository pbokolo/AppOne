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

        // Recupere l'objet intent qui a lance cette activite
        Intent intent = getIntent();
        // Recupere la donnee email(nom de la donnee) qui se trouve dans l'intent
        String email = intent.getStringExtra("email");

        TextView usrnmLbl = findViewById(R.id.usrnmLbl);
        usrnmLbl.setText("Bienvenu "+email);

    }
}