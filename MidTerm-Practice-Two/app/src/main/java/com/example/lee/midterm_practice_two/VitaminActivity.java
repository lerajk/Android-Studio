package com.example.lee.midterm_practice_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class VitaminActivity extends AppCompatActivity {


    private Intent intent;
    //array stores state of checkboxes
    private int[] checkedStates = new int[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin);
    }

    //event handler for checkboxes
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chkVitaminA:
                if (checked)
                    checkedStates[0]=1;
                break;
            case R.id.chkVitaminB:
                if (checked)
                    checkedStates[1]=1;
                break;
            case R.id.chkVitaminC:
                if (checked)
                    checkedStates[2]=1;
                break;
            case R.id.chkVitaminD:
                if (checked)
                    checkedStates[3]=1;
                break;
            default:
                break;
        }
    }

    //handle image button

    public void showChartActivity(View v)
    {
        //put selected items in Extras
        intent = new Intent(this, ChartActivity.class);
        intent.putExtra("checkedStates",checkedStates);
        //
        startActivity(intent);
    }



}
