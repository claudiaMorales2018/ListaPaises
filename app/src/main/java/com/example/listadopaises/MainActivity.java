package com.example.listadopaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity<adapter> extends AppCompatActivity {
    private String[] paises = { "Alemania,Argentina", "Brazil", "Canada", "Colombia",
            "CoreaSur", "Mexico", "Peru", "Uruguay", "Venezuela" };
    private String[] habitantes = { "83,200,000", "44,939,000", "44,940,000",
            "37,590,000", "5,0340,0000", "51,710,000", "127,600.000", "32,510,000",
            "3,462.000", "28,520.000" };
    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        lv1=findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, paises);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                tv1.setText("Población de "+ lv1.getItemAtPosition(i) + " es "+ habitantes[i]);
            }

        
        });
    }

    }
