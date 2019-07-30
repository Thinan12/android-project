package com.example.student.my2ndapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class lab3 extends AppCompatActivity {

    //TextView Tx2;
    TextView editText3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3);


       // Tx2 = findViewById(R. id.Tx2);
            editText3 = findViewById(R.id.Tx2);


            Intent intent = getIntent();
            String s3 = intent.getStringExtra("FirstText");
            editText3.setText(s3);
        //Intent intent = getIntent();
        //String s2 = intent.getStringExtra("FirstText");

        //Tx2.setText(s2);
    }
}
