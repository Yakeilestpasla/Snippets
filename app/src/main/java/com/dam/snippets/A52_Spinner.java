package com.dam.snippets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class A52_Spinner extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] liste;
    //gestion du spinner java et xml
    private void spinnerXmlJava() {
        //lien entre design et java
        Spinner spinnerXmlJava = findViewById(R.id.spinnerXmlJava);
        // recuperation de la liste dans le fichier
        liste = getResources().getStringArray(R.array.listetest);
        // creation de l'adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, liste);
        // associer adapter au spinner
        spinnerXmlJava.setAdapter(adapter);

     spinnerXmlJava.setOnItemSelectedListener(this);


    }
    // Création du tableau qui va peupler le spinnerJavaJava
    String[] listeDesViewsLocal = {"ListView_1_item simple 1 item",
            "ListeView simple Plusieurs Item", "Recycle_View"};

    private void spinnerJavaJava() {
        // Lien entre le code et la vue spinner
        Spinner spinnerJavaJava = (Spinner) findViewById(R.id.spinnerJavaJava);
        // Instanciation du ArrayAdapter pour l'affichage des données du tableau listeView
        ArrayAdapter<String> adapterPourListeLocal = new ArrayAdapter<String>(
                // le contexte             le modèle                   les données
                this, android.R.layout.simple_list_item_1, listeDesViewsLocal);
        // Ajout du layout simple à chaque élément (item) du spinner
        adapterPourListeLocal.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        // Association des données de l'Array (listeView) résupérer dans l'Adapter
        // (adapterPourListeLocal) au spinner (spinnerJavaJava)
        spinnerJavaJava.setAdapter(adapterPourListeLocal);
        // Ajout du listener en s'appuyant sur l'implémentation AdapterView.OnItemSelectedListener
        // directement ajouter à la classe de l'activité
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a52_spinner);

        spinnerXmlJava();
        spinnerJavaJava();


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        final Toast myToast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        switch (adapterView.getId()) {
            case R.id.spinnerXmlJava:
                myToast.setText("Spinner xml et java" + liste[position]);
                myToast.show();
                break;
            case R.id.spinnerJavaJava:
                myToast.setText("spinner only java" + listeDesViewsLocal[position]);
                myToast.show();
                break;
            default:
                break;
        }



        }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {final Toast myToast = Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT);
        myToast.cancel();
    }
}

