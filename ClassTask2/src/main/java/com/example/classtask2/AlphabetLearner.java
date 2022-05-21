package com.example.classtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlphabetLearner extends AppCompatActivity {

    Button b1 , b2 , b3 , b4 , b5  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_learner);
        b1=findViewById(R.id.buttonA);
        b2=findViewById(R.id.buttonB);
        b3=findViewById(R.id.buttonC);
        b4=findViewById(R.id.buttonD);
        b5=findViewById(R.id.buttonE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetLearner.this , DetailsA.class);
                startActivity(intent);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetLearner.this , DetailsB.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetLearner.this , DetailsC.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetLearner.this , DetailsD.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlphabetLearner.this , DetailsE.class);
                startActivity(intent);
            }
        });
    }

}