package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Surah_List extends AppCompatActivity {
    ListView surah_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_list);
        surah_list=findViewById(R.id.surah_list);
        Intent intent=getIntent();
        String type =intent.getStringExtra("type");
        QDH qdh=new QDH();
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,qdh.GetSurahNames());
        surah_list.setAdapter(arrayadapter);
        surah_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(type.equals("Urdu")){
                    Intent intent1=new Intent(getApplicationContext(), MainActivity4.class);
                    intent1.putExtra("Surah_no",position+1); //position+1 because positions start from 0 but Surahs start from 1
                    startActivity(intent1);
                }
                if(type.equals("UrduEng")) {
                    Intent intent1 = new Intent(getApplicationContext(), Surah_Display.class);
                    intent1.putExtra("Surah_no", position + 1); //position+1 because positions start from 0 but Surahs start from 1
                    //intent.putExtra("image",imgs[position]);
                    startActivity(intent1);
                }

            }
        });
    }
}