package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class Details_Display extends AppCompatActivity {

    TextView intro;
    TextView ename;
    TextView uname;
    TextView nazool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_display);
        Intent intent=getIntent();
        int Surah_no=intent.getIntExtra("Sura_no",-1);
        // textView=findViewById(R.id.textView);
        //textView.setText(Integer.toString(Surah_no));
        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();
        intro=findViewById(R.id.intro);
        ename=findViewById(R.id.ename);
        uname=findViewById(R.id.uname);
        nazool=findViewById(R.id.nazool);
        Surah_Details sd = new Surah_Details();
        sd = databaseAccess.getSurahDetails(Surah_no);
        //ayahs.setAdapter(listadapter);

        intro.setText(sd.getIntro());
        ename.setText(sd.geteName());
        uname.setText(sd.getuName());
        nazool.setText(sd.getNazool());

    }
}