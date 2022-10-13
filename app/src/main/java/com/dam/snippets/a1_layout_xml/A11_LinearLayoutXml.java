package com.dam.snippets.a1_layout_xml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dam.snippets.A11_1_LinearLayoutVerticalXml;
import com.dam.snippets.R;

public class A11_LinearLayoutXml extends AppCompatActivity {

    Button buttonLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11_linear_layout_xml);
        buttonLinearLayout = findViewById(R.id.buttonLinearLayout);
        buttonLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //le code pour l'action
               Intent intent = new Intent(A11_LinearLayoutXml.this, A11_1_LinearLayoutVerticalXml.class);
               startActivity(intent);
            }
        });
    }

            //Methode 2 avec l'appel de la méthode onClick du XML
                    public void gestionDuClick(View view) {
                //attaché le widget a cette méthode avec l'attribut du onClick du XML
            Intent intent = new Intent(A11_LinearLayoutXml.this, A11_1_LinearLayoutVerticalXml.class);
            startActivity(intent);
        }

        }

