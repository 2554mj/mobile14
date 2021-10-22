package com.mega.mobile14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
       Button b5, b6, b7;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main6);

            b5 = findViewById(R.id.button5);
            b6 = findViewById(R.id.button6);
            b7 = findViewById(R.id.button7);

            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "페이지5로 넘어갑니다!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity6.this, MainActivity5.class);
                    startActivity(intent);
                }
            });

            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "페이지7로 넘어갑니다!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
                    startActivity(intent);
                }
            });

            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "페이지6을 종료합니다.", Toast.LENGTH_SHORT).show();
                    finish();

                }
            });
        }
    }