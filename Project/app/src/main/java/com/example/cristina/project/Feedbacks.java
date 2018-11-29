package com.example.cristina.project;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class Feedbacks extends AppCompatActivity {
    private RatingBar ratingBar;
    private float value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbacks);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        RatingBar.OnRatingBarChangeListener ratingChaned=new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v , boolean fromUser) {
                value=v;
                Toast.makeText(getApplicationContext(),"Rating is :"+value,Toast.LENGTH_SHORT).show();
            }
        };

    }

    public void send(View v){
        //send feedbacks to database
    }
}

