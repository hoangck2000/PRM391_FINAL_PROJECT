package com.example.prm_final_project;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class QuizHome extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_home);
    }
    public void goToQuizContent_animal(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(QuizHome.this, QuizContent_Flower.class);
                intent.putExtra("Key_1", "animal");
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void goToQuizContent_fruit(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(QuizHome.this, QuizContent_Flower.class);
                intent.putExtra("Key_1", "fruit");
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void goToQuizContent_flower(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(QuizHome.this, QuizContent_Flower.class);
                intent.putExtra("Key_1", "flower");
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void goToQuizContent_fun(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(QuizHome.this, QuizContent_Flower.class);
                intent.putExtra("Key_1", "fun");
                startActivity(intent);
            }
        }, SPLASH_TIME_OUT);
    }
    public void backHome(View view) {
        finish();
    }
}
