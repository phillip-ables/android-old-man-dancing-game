package com.example.phill.dance_dont_die;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDance = findViewById(R.id.btnDance);
        Button btnWalk = findViewById(R.id.btnWalk);

        btnDance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DANCE OLD MAN, DANCE!!", Toast.LENGTH_SHORT).show();

                ImageView oldMan = findViewById(R.id.imgAnimation);
                oldMan.setImageResource(R.drawable.basic_dance);
                AnimationDrawable dancing_oldMan = (AnimationDrawable)oldMan.getDrawable();
                dancing_oldMan.start();
            }
        });

        btnWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView oldMan_walk = findViewById(R.id.imgAnimation);
                oldMan_walk.setImageResource(R.drawable.walk_walker);
                AnimationDrawable walking_oldMan = (AnimationDrawable)oldMan_walk.getDrawable();
                walking_oldMan.start();
            }
        });
    }
}
