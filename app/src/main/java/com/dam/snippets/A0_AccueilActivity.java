package com.dam.snippets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A0_AccueilActivity extends AppCompatActivity {

    /**
     * Variable globales
     **/
    TextView tvLinearLayout;
    TextView videoView;
    TextView lvListViewIndex;
    TextView tvSpinnerIndex;

    /**
     * Méthode pour lier design au code
     **/
    @SuppressLint("WrongViewCast")
    public void initUI() {
        tvLinearLayout = findViewById(R.id.tvLinearLayout);
        videoView = findViewById(R.id.videoViewIndex);
        lvListViewIndex = findViewById(R.id.lvListViewIndex);
        tvSpinnerIndex = findViewById(R.id.tvSpinnerIndex);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a0_accueil);
        initUI();

        tvLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Départ //Arrivée
                Intent intent = new Intent(A0_AccueilActivity.this, A11_LinearLayoutXml.class);
                startActivity(intent);
            }
        });
        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View videoViewIndex) {
                // Départ //Arrivée
                Intent intent = new Intent(A0_AccueilActivity.this, A42_Video.class);
                startActivity(intent);
            }
        });
        lvListViewIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View lvListViewIndex) {
                // Départ //Arrivée
                Intent intent = new Intent(A0_AccueilActivity.this, A51_ListView.class);
                startActivity(intent);
            }

        });
        tvSpinnerIndex.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View tvSpinnerIndex){
                // Départ //Arrivée
                Intent intent = new Intent(A0_AccueilActivity.this, A52_Spinner.class);
                startActivity(intent);
            }
        });


        }
}
