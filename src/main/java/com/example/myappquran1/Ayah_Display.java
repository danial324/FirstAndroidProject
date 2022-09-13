package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class Ayah_Display extends AppCompatActivity {

    TextView ayah3;
    TextView urdu3;
    TextView english3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayah_display);
        Intent intent=getIntent();
        int Ayah_no=intent.getIntExtra("Ayah_no",-1);
        // textView=findViewById(R.id.textView);
        //textView.setText(Integer.toString(Surah_no));
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        ayah3=findViewById(R.id.ayah3);
        urdu3=findViewById(R.id.urdu3);
        english3=findViewById(R.id.english3);

        Ayah ayah1 = new Ayah();
        ayah1 = databaseAccess.getSurahAyah(Ayah_no);
        //ayah1.setAdapter(listadapter);

        ayah3.setText(ayah1.getAyah());
        urdu3.setText(ayah1.getUrduTranslation());
        english3.setText(ayah1.getEnglishTranslation());

    }

}