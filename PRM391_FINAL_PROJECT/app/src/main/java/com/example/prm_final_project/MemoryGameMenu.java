package com.example.prm_final_project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MemoryGameMenu extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_game_menu);
    }
    public void goTo3x3(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MemoryGameMenu.this, MemoryGame33.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void goTo4x4(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MemoryGameMenu.this, MemoryGame44.class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    /*public void backToHome(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MemoryGameMenu.this, .class);
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }*/
}
