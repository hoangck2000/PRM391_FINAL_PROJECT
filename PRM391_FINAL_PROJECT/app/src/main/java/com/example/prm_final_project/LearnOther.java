package com.example.prm_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LearnOther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_other);

        ImageButton click1=(ImageButton)findViewById(R.id.imageButton8);
        ImageButton click2=(ImageButton)findViewById(R.id.imageButton9);
        ImageButton click3=(ImageButton)findViewById(R.id.imageButton10);
        ImageButton click4=(ImageButton)findViewById(R.id.imageButton11);
        ImageButton click5=(ImageButton)findViewById(R.id.imageButton12);
        ImageButton click6=(ImageButton)findViewById(R.id.imageButton13);

        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.dog);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.bird);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.cat);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.fish);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.chicken);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.pig);

        View.OnClickListener elem = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageButton8:
                        mp1.start();
                        break;
                    case R.id.imageButton9:
                        mp2.start();
                        break;
                    case R.id.imageButton10:
                        mp3.start();
                        break;
                    case R.id.imageButton11:
                        mp4.start();
                        break;
                    case R.id.imageButton12:
                        mp5.start();
                        break;
                    case R.id.imageButton13:
                        mp6.start();
                        break;
                }
            }
        };
        click1.setOnClickListener(elem);
        click2.setOnClickListener(elem);
        click3.setOnClickListener(elem);
        click4.setOnClickListener(elem);
        click5.setOnClickListener(elem);
        click6.setOnClickListener(elem);
    }
}