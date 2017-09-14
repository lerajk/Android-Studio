package com.example.lee.nameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String a = intent.getStringExtra("N");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(a);

        String messageprogram = intent.getStringExtra(MainActivity.Program);
        String messagecourse = intent.getStringExtra(MainActivity.Course);
        String messagesemester = intent.getStringExtra(MainActivity.Semester);

        TextView textviewprogram = (TextView) findViewById(R.id.Program);
        TextView textviewcourse = (TextView) findViewById(R.id.Course);
        TextView textviewsemester = (TextView) findViewById(R.id.Semester);

        textviewprogram.setText(messageprogram);
        textviewcourse.setText(messagecourse);
        textviewsemester.setText(messagesemester);




    }



}
