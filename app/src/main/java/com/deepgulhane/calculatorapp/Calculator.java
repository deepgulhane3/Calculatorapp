package com.deepgulhane.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    Button addButton, subButton, mulButton , divButton , modButton;
    EditText firstNo, secondNo;
    TextView answer;
    CardView card;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Calculator");

        addButton = findViewById(R.id.addButton);
        firstNo = findViewById(R.id.firstNo);
        secondNo = findViewById(R.id.secondNo);
        answer = findViewById(R.id.ansButton);
        subButton = findViewById(R.id.subButton);
        mulButton = findViewById(R.id.mulButton);
        divButton = findViewById(R.id.divButton);
        modButton = findViewById(R.id.modButton);
        card = findViewById(R.id.card);

        card.setVisibility(View.VISIBLE);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Float num1 , num2 , ans;
                num1 = Float.parseFloat(firstNo.getText().toString());
                num2 = Float.parseFloat(secondNo.getText().toString());

                ans = num1 + num2 ;
                answer.setText("Answer :" + ans);

                card.setVisibility(View.VISIBLE);
            }
        });
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 , num2 , ans;
                num1 = Float.parseFloat(firstNo.getText().toString());
                num2 = Float.parseFloat(secondNo.getText().toString());

                ans = num1 - num2 ;
                answer.setText("Answer :" + ans);
                card.setVisibility(View.VISIBLE);
            }
        });
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num3 , num4 , ansmul;
                num3 = Float.parseFloat(firstNo.getText().toString());
                num4 = Float.parseFloat(secondNo.getText().toString());

                ansmul =(num3 * num4 );
                answer.setText("Answer :" + ansmul);
                card.setVisibility(View.VISIBLE);
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 , num2 ,ansdiv;
                num1 = Float.parseFloat(firstNo.getText().toString());
                num2 = Float.parseFloat(secondNo.getText().toString());

                ansdiv = num1 / num2;
                answer.setText("Answer :" + ansdiv);
                card.setVisibility(View.VISIBLE);
            }
        });
        modButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float num1 , num2 , ansmod;
                num1= Float.parseFloat(firstNo.getText().toString());
                num2 = Float.parseFloat(secondNo.getText().toString());

                ansmod = num1 % num2;
                answer.setText("Answer :" + ansmod);
                card.setVisibility(View.VISIBLE);
            }
        });

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}