package com.deepgulhane.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button , calButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Home");

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InfoPart.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Hi , I'm Deep Gulhane ", Toast.LENGTH_LONG).show();
            }
        });

        calButton = findViewById(R.id.calButton1);
        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Calculator.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this , "Opening Calculator",Toast.LENGTH_LONG).show();
            }
        });
    }
}