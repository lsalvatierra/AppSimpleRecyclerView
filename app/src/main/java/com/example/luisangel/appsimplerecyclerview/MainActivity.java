package com.example.luisangel.appsimplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listaDatos;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rvCapitales);
        recyclerView.setLayoutManager(new
                LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false));
        listaDatos = new ArrayList<String>();
        for(int i =0; i<= 50; i++){
            listaDatos.add("Dato: "+i);
        }
        //AdaterLista alista = new AdapterList(listaDatos);
        //recyclerView.setAdapter(alista);
        recyclerView.setAdapter(new AdapterLista(listaDatos));
    }
}
