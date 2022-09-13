package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        QDH qdh=new QDH();
        ArrayList<String> surahList =new ArrayList<>(qdh.GetSurahNames());
        recyclerView = findViewById(R.id.recylerViewSurah);
        recyclerView.setHasFixedSize(true);
        /*layoutManager = new LinearLayoutManager(MainActivity3.this,
                LinearLayoutManager.HORIZONTAL,
                true);*/
        layoutManager = new LinearLayoutManager(MainActivity3.this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new myRecyclerView(surahList) ;
        recyclerView.setAdapter(adapter);



    }
}