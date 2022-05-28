package com.kitoko.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // onCreate est la l'etape ou on initialise l'application
        // C'est a dire l'IU et les donnees

        Toast.makeText(this, "Dans onCreate", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Dans onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // On restaure l'etat precedent de l'activite

        Toast.makeText(this, "Dans onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Lorsque l'activite est partiellement cachee par une autre vue(ex. boite de dialogue)
        Toast.makeText(this, "Dans onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Les actions a executer lorsque l'activite est stopee
        // C'est a dire l'activite n'est plus visibe
        // Par exemple la sauvegarde de l'etat de l'activite
        Toast.makeText(this, "Dans onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Les actions a executer lorsque l'activite est detruite
        // La savegarde des donnees dans la base des donnees
        Toast.makeText(this, "Dans onDestroy", Toast.LENGTH_LONG).show();
    }
}