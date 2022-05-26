package com.kitoko.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kitoko.appone.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Deserialisation avec le viewBinding
        ActivityMainBinding binding = ActivityMainBinding
                .inflate(getLayoutInflater());

        // Lien avec la vue
        setContentView(binding.getRoot());

        binding.clickBtn.setOnClickListener(v -> {
            // L'objectif est de lancer la deuxieme activite

            // Definition de l'intention(intent) : veut partir de MainActivity a SecondActivity
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            startActivity(intent);

        });

    }
}