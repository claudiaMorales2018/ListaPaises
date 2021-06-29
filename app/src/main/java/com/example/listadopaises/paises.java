package com.example.listadopaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class paises extends AppCompatActivity {


    private String[] paises = { "Alemania,Argentina", "Brazil", "Canada", "Colombia",
            "CoreaSur", "Mexico", "Peru", "Uruguay", "Venezuela" };
    private String[] habitantes = { "83,200,000", "44,939,000", "44,940,000",
            "37,590,000", "5,0340,0000", "51,710,000", "127,600.000", "32,510,000",
            "3,462.000", "28,520.000" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises);
    }
}