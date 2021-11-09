package com.example.prm_final_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.prm_final_project.Quizs.Question;

import java.util.Random;

public class QuizContent_Flower extends AppCompatActivity {
    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;
    ImageView img_ques;
    private Question question = new Question();
    private int mark=0;

    private String answer;
    private int questionLength = question.questionsAnimal.length;
    private int countQues = 0;
    String typeOfQuiz="";
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_content_flower);

        Intent intent = getIntent();
        String type = intent.getStringExtra("Key_1");
        typeOfQuiz=type;

        btn_one = (Button) findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this::onClick);
        btn_two = (Button) findViewById(R.id.btn_two);
        btn_two.setOnClickListener(this::onClick);
        btn_three = (Button) findViewById(R.id.btn_three);
        btn_three.setOnClickListener(this::onClick);
        btn_four = (Button) findViewById(R.id.btn_four);
        btn_four.setOnClickListener(this::onClick);

        tv_question = (TextView) findViewById(R.id.tv_question);
        img_ques=findViewById(R.id.imageQuiz);
        NextQuestion(countQues,type);
    }

    public void onClick(View v) {
        countQues++;
            switch (v.getId()) {
                case R.id.btn_one:
                    if (btn_one.getText() == answer) {
                        mark++;
                        Toast.makeText(QuizContent_Flower.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                        if (countQues == questionLength) {
                            GameWin();
                        } else {
                            NextQuestion(countQues,typeOfQuiz);
                        }
                    }
                    else {
                        GameOver();
                    }
                    break;

                case R.id.btn_two:
                    if (btn_two.getText() == answer) {
                        mark++;
                        Toast.makeText(QuizContent_Flower.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                        if (countQues == questionLength) {
                            GameWin();
                        } else {
                            NextQuestion(countQues,typeOfQuiz);
                        }
                    }
                    else {
                        GameOver();
                    }
                    break;

                case R.id.btn_three:
                    if (btn_three.getText() == answer) {
                        mark++;
                        Toast.makeText(QuizContent_Flower.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                        if (countQues == questionLength) {
                            GameWin();
                        } else {
                            NextQuestion(countQues,typeOfQuiz);
                        }
                    }
                    else {
                        GameOver();
                    }
                    break;

                case R.id.btn_four:
                    if (btn_four.getText() == answer) {
                        mark++;
                        Toast.makeText(QuizContent_Flower.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                        if (countQues == questionLength) {
                            GameWin();
                        } else {
                            NextQuestion(countQues,typeOfQuiz);
                        }
                    }
                    else {
                        GameOver();
                    }
                    break;
            }
    }

    private void GameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizContent_Flower.this);
        alertDialogBuilder
                .setMessage("Game Over ! You get "+ mark+"/10 points !")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), QuizContent_Flower.class);
                        intent.putExtra("Key_1",typeOfQuiz);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), QuizHome.class);
                        intent.putExtra("Key_1",typeOfQuiz);
                        startActivity(intent);
                    }
                });
        alertDialogBuilder.show();

    }

    private void GameWin() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizContent_Flower.this);
        alertDialogBuilder
                .setMessage("You win ! You get 10/10 points !")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), QuizContent_Flower.class);
                        intent.putExtra("Key_1",typeOfQuiz);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), QuizHome.class);
                        intent.putExtra("Key_1",typeOfQuiz
                        );
                        startActivity(intent);
                    }
                });
        alertDialogBuilder.show();

    }


    private void NextQuestion(int num,String type) {
        tv_question.setText(question.getQuestion(num,type));
        btn_one.setText(question.getchoice1(num,type));
        btn_two.setText(question.getchoice2(num,type));
        btn_three.setText(question.getchoice3(num,type));
        btn_four.setText(question.getchoice4(num,type));

        String imageName=question.getImageQues(num,type);
        Context c = getApplicationContext();
        int id = c.getResources().getIdentifier("drawable/"+imageName, null, c.getPackageName());
        img_ques.setImageResource(id);

        answer = question.getCorrectAnswer(num,type);
    }
}