package com.example.classtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;

public class AlphabetQuiz extends AppCompatActivity  {

    TextView t1;
    CheckBox c1 , c2 , c3 , c4 ;
    Button b1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_quiz);

        t1=findViewById(R.id.resulttext);
        c1=findViewById(R.id.checkBox1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Wrong Answer");
            }
        });
        c2=findViewById(R.id.checkBox2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Right Answer");
            }
        });
        c3=findViewById(R.id.checkBox3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Wrong Answer");
            }
        });
        c4=findViewById(R.id.checkBox4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Wrong Answer");
            }
        });




    }


}