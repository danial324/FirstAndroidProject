package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

                    Button b ;
                    CheckBox ch ;
                    TextView TextView2;
                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);
                        b = findViewById(R.id.button3);
                        b.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(com.example.linearlayout.MainActivity.this,NumDetails.class);
                                startActivity(intent);

            }
        });
                        ch = findViewById(R.id.checkBox);
                        TextView2=findViewById(R.id.textView5);
                        ch.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                switch (v.getId())
                                {
                                    case R.id.checkBox:
                                    if (ch.isChecked()) {

                                        TextView2.setText("Congratulations ");

                                    }
                                }
                            }
                        });

    }
}