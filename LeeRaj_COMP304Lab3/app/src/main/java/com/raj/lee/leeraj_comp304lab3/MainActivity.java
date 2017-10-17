package com.raj.lee.leeraj_comp304lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView LV;
    private String[] list = new String[]{"Excercise One", "Excercise Two", "Excercise Three" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV = (ListView) findViewById(R.id.list_excercises);

        ArrayAdapter<String> array = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);

        LV.setAdapter(array);

        final Intent intent = new Intent();

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0: {
                        intent.setClass(MainActivity.this, Ex_One_Activity.class);
                        break;
                    }
                    case 1: {
                        intent.setClass(MainActivity.this, Ex_Two_Activity.class);
                        break;
                    }
                    case 2: {
                        intent.setClass(MainActivity.this, Ex_Three_Activity.class);
                        break;
                    }
                }
                startActivity(intent);
            }
        });
    }
}
