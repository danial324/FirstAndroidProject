package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sDetails_List extends AppCompatActivity {
    ListView parah_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdetails_list);
        parah_list=findViewById(R.id.parah_list);
//        Intent intent=getIntent();
        QDH qdh=new QDH();
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,qdh.GetSurahNames());
        parah_list.setAdapter(arrayadapter);
        parah_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(), Details_Display.class);
                intent.putExtra("Sura_no",position+1); //position because positions start from 0 and Parahs start from 1
                //intent.putExtra("image",imgs[position]);
                startActivity(intent);

            }
        });
    }
}