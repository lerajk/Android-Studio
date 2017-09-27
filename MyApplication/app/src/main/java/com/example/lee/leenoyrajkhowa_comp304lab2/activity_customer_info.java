package com.example.lee.leenoyrajkhowa_comp304lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_customer_info extends AppCompatActivity {

    EditText nameValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_info);

        nameValidation = (EditText) findViewById(R.id.Name);

        nameValidation.setOnFocusChangeListener(new View.OnFocusChangeListener(){

            @Override
            public void onFocusChange(View view, boolean b) {
                if(nameValidation.getText().length()<5){
                    nameValidation.setError("Enter more than 5 characters");
                }
            }
        });
    }

    public void back_button_two(View view)
    {
        Intent intent = new Intent(activity_customer_info.this, activity_foodmenu.class);
        startActivity(intent);
    }


    public void order_button(View view)
    {
        Intent intent = new Intent(activity_customer_info.this, activity_checkout.class);
        startActivity(intent);
    }
}
