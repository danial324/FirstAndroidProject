package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent=getIntent();
        int Surah_no=intent.getIntExtra("Surah_no",-1);

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        ArrayList<Urdu_Ayah> urdu_ayah = databaseAccess.getSurahAyahUrdu(Surah_no);
        recyclerView = findViewById(R.id.recyclerViewSurah);
        recyclerView.setHasFixedSize(true);
        /*layoutManager = new LinearLayoutManager(MainActivity3.this,
                LinearLayoutManager.HORIZONTAL,
                true);*/
        layoutManager = new LinearLayoutManager(MainActivity4.this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerViewUAyah(urdu_ayah);
        recyclerView.setAdapter(adapter);
    }
}