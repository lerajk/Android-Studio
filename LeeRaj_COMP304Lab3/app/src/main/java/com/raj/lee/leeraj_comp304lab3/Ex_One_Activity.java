package com.raj.lee.leeraj_comp304lab3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

public class Ex_One_Activity extends AppCompatActivity {

    Spinner spinner_color;
    Spinner spinner_thickness;
    Button buttonClear;
    ImageView drawImageView;
    ImageButton dwnKey;
    ImageButton rtKey;
    ImageButton upKey;
    ImageButton lfKey;

    Paint paint;
    Bitmap bitmap;
    Canvas canvas;

    int start_XAxis = 15;
    int start_YAxis = 15;
    int end_XAxis = 15;
    int end_YAxis = 15;

    int color;
    int thickness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex__one_);

        spinner_color = (Spinner) findViewById(R.id.spinner_color);
        spinner_thickness = (Spinner) findViewById(R.id.spinner_thickness);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        drawImageView = (ImageView) findViewById(R.id.drawImageView);

        thickness = Integer.parseInt(spinner_thickness.getSelectedItem().toString());
        selectColor(spinner_color.getSelectedItemPosition());

        paint = new Paint();
        paint.setColor(color);
        paint.setStrokeWidth(thickness);


        int width = (int) getResources().getDimension(R.dimen.img_width);
        int height = (int) getResources().getDimension(R.dimen.img_height);

        bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        //set canvas background
        canvas.drawColor(Color.WHITE);
        //set a bitmap as content view for the image
        drawImageView.setImageBitmap(bitmap);

        dwnKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    end_YAxis = end_YAxis + 12;
                    constructLine(canvas);
                }

                if(motionEvent.getAction() == MotionEvent.ACTION_UP){

                }

                return true;
            }
        });

        upKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    end_YAxis = end_YAxis - 12;
                    constructLine(canvas);
                }

                if(motionEvent.getAction() == MotionEvent.ACTION_UP){


                }
                return true;
            }
        });

        rtKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    end_XAxis = end_XAxis + 12;
                    constructLine(canvas);
                }
                return true;
            }
        });

        lfKey.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    end_XAxis = end_XAxis - 12;
                    constructLine(canvas);
                }
                return true;
            }
        });

        spinner_color.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectColor(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner_thickness.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                thickness = Integer.parseInt(adapterView.getSelectedItem().toString());
                paint.setStrokeWidth(thickness);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                canvas.drawColor(Color.WHITE);
            }
        });



    }

    private void selectColor(int select) {

        switch (select) {

            case 0: {
                color = Color.CYAN;
                break;
            }
            case 1: {
                color = Color.MAGENTA;
                break;
            }

            case 2: {
                color = Color.YELLOW;
                break;
            }

        }
    }


    public void constructLine(Canvas canvas)
    {
        canvas.drawLine(start_XAxis, start_YAxis, end_XAxis, end_YAxis, paint);
        start_XAxis = end_XAxis;
        start_YAxis = end_YAxis;
        drawImageView.invalidate();

    }

}
