package com.example.student.my2ndapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //TextView tx1;
    TextView editText3;
    EditText Abc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tx1= findViewById(R.id.Tx1);
        editText3 = findViewById(R.id.Tx1);
        Abc = findViewById(R.id .editText3);
    }


    public void sendData(View view) {
        //Intent intent = new Intent(MainActivity.this,lab3.class);
        //String msg = tx1.getText().toString();
        //intent.putExtra("FirstText",msg);

        Intent intent = new Intent(MainActivity.this,lab3.class);
        String msg = Abc.getText().toString();
        intent.putExtra("FirstText",msg);




        startActivity(intent);


    }
}
