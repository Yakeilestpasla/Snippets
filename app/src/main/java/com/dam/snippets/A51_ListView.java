package com.dam.snippets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class A51_ListView extends AppCompatActivity {

    //** methode 1 avec un tableau dans le java **/
    private String[] listeStagiaires = new String[]{
            "Théodore", "Fred", "Silvere", "Moi", "Jasem", "Caid", "Serge", "Patrick", "Andy", "Anthony",
    };

    private void affichageListView(){
        // lien entre java et design
        ListView lvListView =  findViewById(R.id.lvListView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listeStagiaires);

        lvListView.setAdapter(adapter);

        lvListView.setOnItemClickListener(((adapterView, view, position, l) -> {String valItem = (String) lvListView.getItemAtPosition(position);
            Toast.makeText(A51_ListView.this, "Le stagiarie : " + valItem, Toast.LENGTH_SHORT).show();} ));
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a51_list_view);
        affichageListView();
    }
}