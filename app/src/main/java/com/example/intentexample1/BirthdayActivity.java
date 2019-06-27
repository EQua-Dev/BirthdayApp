package com.example.intentexample1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//This Java class creates the functionality for the birthday_message xml page
public class BirthdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birthday_message);
        Button exit = findViewById(R.id.button2);
        exit.setOnClickListener(new View.OnClickListener(){
            //sets onClickListener on the 'Thank You' button
            @Override
            public void onClick(View v) {
                //Displays toast when the 'Thank You' button is clicked
                Toast.makeText(getApplicationContext(),"You are welcome!",Toast.LENGTH_SHORT).show();
            //exits the app when the 'Thank You' button is clicked after displaying the toast
                android.os.Process.killProcess(android.os.Process.myPid());
                finish();

            }
                                }

        );
    }
}

