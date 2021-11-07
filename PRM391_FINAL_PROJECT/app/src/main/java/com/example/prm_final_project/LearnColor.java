package com.example.prm_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_color);

        Button click1=(Button)findViewById(R.id.button1);
        Button click2=(Button)findViewById(R.id.button2);
        Button click3=(Button)findViewById(R.id.button3);
        Button click4=(Button)findViewById(R.id.button4);
        Button click5=(Button)findViewById(R.id.button5);
        Button click6=(Button)findViewById(R.id.button6);

        final MediaPlayer mp1=MediaPlayer.create(getApplicationContext(), R.raw.red);
        final MediaPlayer mp2=MediaPlayer.create(getApplicationContext(), R.raw.orange);
        final MediaPlayer mp3=MediaPlayer.create(getApplicationContext(), R.raw.black);
        final MediaPlayer mp4=MediaPlayer.create(getApplicationContext(), R.raw.green);
        final MediaPlayer mp5=MediaPlayer.create(getApplicationContext(), R.raw.blue);
        final MediaPlayer mp6=MediaPlayer.create(getApplicationContext(), R.raw.gray);

        View.OnClickListener elem = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button1:
                        mp1.start();
                        break;
                    case R.id.button2:
                        mp2.start();
                        break;
                    case R.id.button3:
                        mp3.start();
                        break;
                    case R.id.button4:
                        mp4.start();
                        break;
                    case R.id.button5:
                        mp5.start();
                        break;
                    case R.id.button6:
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