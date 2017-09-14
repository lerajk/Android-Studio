package com.example.lee.nameapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String Program = "Program";
    public static final String Course = "Course";
    public static final String Semester = "3";
    public static final String Name = "Lee Raj";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

       // String id = "Name";
        Intent intent = new Intent(this, Main2Activity.class);

        //String name = ((TextView) findViewById(R.id.Name)).getText().toString();
        //TextView program = (TextView) findViewById(R.id.Program);
        //TextView course = (TextView) findViewById(R.id.Course);
       // TextView semester = (TextView) findViewById(R.id.Semester);
       // String messageprogram = program.getText().toString();
       // String messagecourse = course.getText().toString();
       // String messagesemester = semester.getText().toString();

       // String messageprogram = findViewById(R.id.Name).toString();
        String messagename = getString(R.string.name);
        String messageprogram = getString(R.string.program);
        String messagecourse = getString(R.string.course);
        String messagesemester = getString(R.string.semester);


        intent.putExtra(Name, messagename);
        intent.putExtra(Program,messageprogram);
        intent.putExtra(Course, messagecourse);
        intent.putExtra(Semester, messagesemester);
        startActivity(intent);

    }

    //String name = "Lee Raj";
    //String program = "Software ";
    //String sem = "3rd";
    //String course  = "3429";

    //TextView helloworld = (TextView) findViewById(R.id.helloworldTextView);



}
