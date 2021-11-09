package com.example.prm_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstLearnScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_learn_screen);
    }

    public void learnColor(View view) {
        Intent intent = new Intent(FirstLearnScreen.this,LearnColor.class);
        startActivity(intent);
    }

    public void learnOther(View view) {
        Intent intent = new Intent(FirstLearnScreen.this,LearnOther.class);
        startActivity(intent);
    }
}