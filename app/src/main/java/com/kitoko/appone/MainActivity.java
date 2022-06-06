package com.kitoko.appone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Recupere la zone de saisie de l'email
        EditText emailTxt = findViewById(R.id.emailTxt);
        // Recupere la zone de saisie du mot de passe
        EditText mdpTxt = findViewById(R.id.mdpTxt);
        // Recupere le bouton de connexion
        Button connexionBtn = findViewById(R.id.connexionBtn);

        // Recupere une instance de SharedPreferences
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        // Recupere l'objet Editor a partir de l'instance SharedPreferences
        SharedPreferences.Editor editor = preferences.edit();

        // Recupere l'email dans le fichier preferences
        String emailEnr = preferences.getString("email", "");
        // Meme chose pour le mot de passe
        String mdpEnr = preferences.getString("mdp", "");

        // Ecoute l'evenement de clic
        connexionBtn.setOnClickListener(v -> {
            String emailUt = emailTxt.getText().toString();
            String mdpUt = mdpTxt.getText().toString();

            // Verifie si l'utilisateur a fourni son email et son mot de passe
            if (emailUt.length() > 0 && mdpUt.length() > 0) {

                // Verifie s'il y a un email deja enregistre
               if(emailEnr.length() > 0){
                   // Comparer l'email que l'utilisateur a saisi et l'email qui existe
                   // Comparer le mot de passe que l'utilisateur a saisi et celui qui existe
                   if(emailUt.equals(emailEnr) && mdpUt.equals(mdpEnr)){

                       // Lance la 2eme activite
                       Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                       startActivity(intent);

                   }else{

                       Toast.makeText(MainActivity.this, "Informations invalides", Toast.LENGTH_SHORT).show();

                   }
               }else{
                   // Place les information a enregistrer dans l'objet editor
                   editor.putString("email", emailUt);
                   editor.putString("mdp", mdpUt);
                   // Enregistre dans les preferences
                   editor.apply();

                   /**
                    * Pour lancer une activite, on passe par deux etapes
                    * 1. Cree un objet de type Intent(intention) : context de depart et activite d'arrivee
                    * 2. Envoyer l'intent a Android
                    */
                   Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                   startActivity(intent);

               }


            }else{

                Toast.makeText(MainActivity.this, "Informations incompletes", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}