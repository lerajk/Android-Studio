package com.example.lee.nameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        
    }

    String name = "Lee Raj";
    String program = "Software ";
    String sem = "3rd";
    String course  = "3429";

    //TextView helloworld = (TextView) findViewById(R.id.helloworldTextView);



}
