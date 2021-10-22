package com.mega.mobile14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
        Button b8, b9, b10;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main7);

            b8 = findViewById(R.id.button8);
            b9 = findViewById(R.id.button9);
            b10 = findViewById(R.id.button10);

            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "페이지5로 넘어갑니다!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7.this, MainActivity5.class);
                    startActivity(intent);
                }
            });

            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "페이지6으로 넘어갑니다!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity7.this, MainActivity6.class);
                    startActivity(intent);
                }
            });

            b10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getApplicationContext(), "페이지7을 종료합니다.", Toast.LENGTH_SHORT).show();
                    finish();

                }
            });
        }
    }