package com.example.myappquran1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ayah_List extends AppCompatActivity {

    ListView ayah_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayah_list);
        ayah_list=findViewById(R.id.ayah_list);

        QuranArabicText qat=new QuranArabicText();
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,qat.GetAyah());
        ayah_list.setAdapter(arrayadapter);
        ayah_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(), Ayah_Display.class);
                intent.putExtra("Ayah_no",position+1); //position+1 because positions start from 0 but Surahs start from 1
                //intent.putExtra("image",imgs[position]);
                startActivity(intent);

            }
        });
    }
}