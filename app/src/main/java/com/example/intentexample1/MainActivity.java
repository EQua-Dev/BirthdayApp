package com.example.intentexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Java file for the front page ie activity_main
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
    }
//creates an new explicit intent to the birthday message page when the button is clicked
    //this method "onClick" was called in the button attribute in the xml file
    public void onClick(View view){
        Intent intent = new Intent(this, BirthdayActivity.class);
        startActivity(intent);
    }
        }



