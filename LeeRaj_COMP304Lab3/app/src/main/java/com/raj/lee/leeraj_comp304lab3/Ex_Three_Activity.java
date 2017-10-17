package com.raj.lee.leeraj_comp304lab3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Ex_Three_Activity extends AppCompatActivity {

    ImageView reusableImageView;
    Animation an;
    //
    Paint paint;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex__three_);
        paint = new Paint();
        // Handle Start Button
        final Button onButton = (Button) findViewById(R.id.button_start_ex3);
        onButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startAnimation();
            }
        });

        // Handle Stop Button
        final Button offButton = (Button) findViewById(R.id.button_stop_ex3);
        offButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAnimation();
            }
        });

    }

    private void startAnimation()
    {
        // We will animate the imageview
        reusableImageView = (ImageView)findViewById(R.id.imageView_ex3);
        reusableImageView.setImageResource(R.drawable.moon);

        reusableImageView.setVisibility(View.VISIBLE);

        Path p = new Path();
        p.moveTo(10, 300);
        p.lineTo(700, 300);

//        canvas.drawTextOnPath("Should learn Android", p, 0, 0, paint);

        // Load the appropriate animation
        an =  AnimationUtils.loadAnimation(this, R.anim.translate_position);

        // Start the animation
        reusableImageView.startAnimation(an);

    }// end of startAnimation

    private void stopAnimation()
    {
        reusableImageView.clearAnimation();
    }

}
