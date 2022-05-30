package com.kitoko.appone;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recupere les preferences en mode prive
        // Pour que seule notre application ait acces au fichier en question
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);

        String uEmail = preferences.getString("email", "Rien");
        String uMdp = preferences.getString("mdp", "Rien");

       // Recupere la zone de saisie de l'email
        EditText emailTxt = findViewById(R.id.emailTxt);
        // Recupere la zone de saisie du mot de passe
        EditText mdpTxt = findViewById(R.id.mdpTxt);
        // Recupere le bouton de connexion
        Button connexionBtn = findViewById(R.id.connexionBtn);

        emailTxt.setText(uEmail);

        mdpTxt.setText(uMdp);


        // Ecoute l'evenement de clic
        connexionBtn.setOnClickListener(v -> {
            // Recupere l'email dans une variable de type string
            String email= emailTxt.getText().toString();
            // Recupere le mot de passe
            String mdp = mdpTxt.getText().toString();

            // Recupere l'objet editor a partir de l'objet preferences
            SharedPreferences.Editor editor = preferences.edit();

            // Met le email dans l'editor
            editor.putString("email", email);
            // Meme chose pour le mot de passe
            editor.putString("mdp", mdp);

            // Enregistre dans les preferences
            editor.apply();

        });

    }



}