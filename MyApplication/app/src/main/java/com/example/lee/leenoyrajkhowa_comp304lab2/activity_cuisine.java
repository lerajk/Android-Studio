package com.example.lee.leenoyrajkhowa_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class activity_cuisine extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);

        radioGroup =(RadioGroup) findViewById(R.id.rdb_cusines_group);
        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                int selected = radioGroup.getCheckedRadioButtonId();
                Intent intent = new Intent(activity_cuisine.this,activity_foodmenu.class);
                intent.putExtra("cuisine_id", selected);
                startActivity(intent);

            }

        });
    }
}
