package com.example.prm_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToFreeDraw(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, FreeDrawActivity.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void goToQuizApp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, QuizHome.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void backEnterName(View view) {
        finish();
    }

    public void toLearnRead(View view) {
        Intent intent = new Intent(MainActivity.this,FirstLearnScreen.class);
        startActivity(intent);
    }
    public void goToMemoryGame(View view) {
        Intent intent = new Intent(MainActivity.this, MemoryGameMenu.class);
        startActivity(intent);
    }
    public void goTo2048Game(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, com.example.prm_final_project.Game2048.g2048_Activity.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
}