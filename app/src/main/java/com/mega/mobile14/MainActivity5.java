package com.mega.mobile14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    Button b2, b3, b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "페이지6으로 넘어갑니다!", Toast.LENGTH_SHORT).show();
                //화면 넘겨주는 객체 생성해주어야 함!
                //생성자(현제액티비티, 넘어갈액티비티)
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "페이지7로 넘어갑니다!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity5.this, MainActivity7.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "페이지5를 종료합니다.", Toast.LENGTH_SHORT).show();
            finish();

            }
        });
    }
}
