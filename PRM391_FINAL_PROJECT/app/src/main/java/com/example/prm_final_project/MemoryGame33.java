package com.example.prm_final_project;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class MemoryGame33 extends AppCompatActivity {
    ImageView iv_1,iv_2,iv_3,iv_4,iv_5,iv_6,iv_7,iv_8,iv_9,iv_10,iv_11,iv_12;
    TextView txtMove;
    //array for image
    Integer[] cardsArray ={101,102,103,104,105,106,201,202,203,204,205,206};
    //actual image
    int image101,image102,image103,image104,image105,image106,image201,image202,image203,image204,image205,image206;
    int clickFirst, clickSecond;
    int firstCard,secondCard;
    int cardNumber=1;
    int move =13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_game_1);
        txtMove = (TextView) findViewById(R.id.txtMove);
        txtMove.setText(String.valueOf(move));

        iv_1 = (ImageView) findViewById(R.id.iv_1);
        iv_2 = (ImageView) findViewById(R.id.iv_2);
        iv_3 = (ImageView) findViewById(R.id.iv_3);
        iv_4 = (ImageView) findViewById(R.id.iv_4);
        iv_5 = (ImageView) findViewById(R.id.iv_5);
        iv_6 = (ImageView) findViewById(R.id.iv_6);
        iv_7 = (ImageView) findViewById(R.id.iv_7);
        iv_8 = (ImageView) findViewById(R.id.iv_8);
        iv_9 = (ImageView) findViewById(R.id.iv_9);
        iv_10= (ImageView) findViewById(R.id.iv_10);
        iv_11= (ImageView) findViewById(R.id.iv_11);
        iv_12= (ImageView) findViewById(R.id.iv_12);

        iv_1.setTag("0");
        iv_2.setTag("1");
        iv_3.setTag("2");
        iv_4.setTag("3");
        iv_5.setTag("4");
        iv_6.setTag("5");
        iv_7.setTag("6");
        iv_8.setTag("7");
        iv_9.setTag("8");
        iv_10.setTag("9");
        iv_11.setTag("10");
        iv_12.setTag("11");



        iv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_1,theCard);
            }
        });
        iv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_2,theCard);
            }
        });
        iv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_3,theCard);
            }
        });
        iv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_4,theCard);
            }
        });
        iv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_5,theCard);
            }
        });
        iv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_6,theCard);
            }
        });
        iv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_7,theCard);
            }
        });
        iv_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_8,theCard);
            }
        });
        iv_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_9,theCard);
            }
        });
        iv_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_10,theCard);
            }
        });
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11,theCard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12,theCard);
            }
        });

        //load the card images
        loadImages();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));
    }
    private  void doStuff(ImageView iv,int card){
        //set correct image to the imageView

        if(cardsArray[card] == 101){
            iv.setImageResource(image101);
        }else if(cardsArray[card] == 102){
            iv.setImageResource(image102);
        }else if(cardsArray[card] == 103){
            iv.setImageResource(image103);
        }else if(cardsArray[card] == 104){
            iv.setImageResource(image104);
        }else if(cardsArray[card] == 105){
            iv.setImageResource(image105);
        }else if(cardsArray[card] == 106){
            iv.setImageResource(image106);
        }else if(cardsArray[card] == 201){
            iv.setImageResource(image201);
        }else if(cardsArray[card] == 202){
            iv.setImageResource(image202);
        }else if(cardsArray[card] == 203){
            iv.setImageResource(image203);
        }else if(cardsArray[card] == 204){
            iv.setImageResource(image204);
        }else if(cardsArray[card] == 205){
            iv.setImageResource(image205);
        }else if(cardsArray[card] == 206){
            iv.setImageResource(image206);
        }

        //check which image is selected and save it to temporary variable
        if(cardNumber == 1 ){
            firstCard = cardsArray[card];
            if(firstCard >200){
                firstCard =firstCard-100;
            }
            cardNumber =2;
            clickFirst =card;
            iv.setEnabled(false);
        }else if(cardNumber ==2){
            secondCard =cardsArray[card];
            if(secondCard >200){
                secondCard =secondCard-100;
            }
            cardNumber =1;
            clickSecond = card;

            iv_1.setEnabled(false);
            iv_2.setEnabled(false);
            iv_3.setEnabled(false);
            iv_4.setEnabled(false);
            iv_5.setEnabled(false);
            iv_6.setEnabled(false);
            iv_7.setEnabled(false);
            iv_8.setEnabled(false);
            iv_9.setEnabled(false);
            iv_10.setEnabled(false);
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);

            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are equal
                    calculate();
                }
            },1000);
        }
    }
    private void calculate(){
        //checkMove
        move--;
        if(move == 0){
            checkMove();
        }
        txtMove.setText(String.valueOf(move));
        //if image are equal remove them
        if(firstCard == secondCard){
            if(clickFirst == 0){
                iv_1.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 1){
                iv_2.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 2){
                iv_3.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 3){
                iv_4.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 4){
                iv_5.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 5){
                iv_6.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 6){
                iv_7.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 7){
                iv_8.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 8){
                iv_9.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 9){
                iv_10.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 10){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickFirst == 11){
                iv_12.setVisibility(View.INVISIBLE);
            }

            if(clickSecond == 0){
                iv_1.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 1){
                iv_2.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 2){
                iv_3.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 3){
                iv_4.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 4){
                iv_5.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 5){
                iv_6.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 6){
                iv_7.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 7){
                iv_8.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 8){
                iv_9.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 9){
                iv_10.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 10){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickSecond == 11){
                iv_12.setVisibility(View.INVISIBLE);
            }
        }else{
            iv_1.setImageResource(R.drawable.question);
            iv_2.setImageResource(R.drawable.question);
            iv_3.setImageResource(R.drawable.question);
            iv_4.setImageResource(R.drawable.question);
            iv_5.setImageResource(R.drawable.question);
            iv_6.setImageResource(R.drawable.question);
            iv_7.setImageResource(R.drawable.question);
            iv_8.setImageResource(R.drawable.question);
            iv_9.setImageResource(R.drawable.question);
            iv_10.setImageResource(R.drawable.question);
            iv_11.setImageResource(R.drawable.question);
            iv_12.setImageResource(R.drawable.question);

        }
        iv_1.setEnabled(true);
        iv_2.setEnabled(true);
        iv_3.setEnabled(true);
        iv_4.setEnabled(true);
        iv_5.setEnabled(true);
        iv_6.setEnabled(true);
        iv_7.setEnabled(true);
        iv_8.setEnabled(true);
        iv_9.setEnabled(true);
        iv_10.setEnabled(true);
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);


        //check if the game is over
        checkEnd();
    }
    private void checkMove(){
        AlertDialog.Builder alert = new AlertDialog.Builder(MemoryGame33.this);
        alert.setMessage("Out of Moves!!").setCancelable(false)
                .setPositiveButton("NewGame", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), MemoryGame33.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), MemoryGameMenu.class);
                        startActivity(intent);
                        finish();
                    }
                });
        AlertDialog alertDialog = alert.create();
        alertDialog.show();
    }
    private void checkEnd(){
        if(iv_1.getVisibility() == View.INVISIBLE &&
                iv_2.getVisibility() == View.INVISIBLE &&
                iv_3.getVisibility() == View.INVISIBLE &&
                iv_4.getVisibility() == View.INVISIBLE &&
                iv_5.getVisibility() == View.INVISIBLE &&
                iv_6.getVisibility() == View.INVISIBLE &&
                iv_7.getVisibility() == View.INVISIBLE &&
                iv_8.getVisibility() == View.INVISIBLE &&
                iv_9.getVisibility() == View.INVISIBLE &&
                iv_10.getVisibility() == View.INVISIBLE&&
                iv_11.getVisibility() == View.INVISIBLE&&
                iv_12.getVisibility() == View.INVISIBLE){
            AlertDialog.Builder alert = new AlertDialog.Builder(MemoryGame33.this);
            alert.setMessage("Game Over!!").setCancelable(false)
                    .setPositiveButton("NewGame", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MemoryGame33.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MemoryGameMenu.class);
                            startActivity(intent);
                            finish();
                        }
                    });
            AlertDialog alertDialog = alert.create();
            alertDialog.show();
        }
    }
    private void loadImages(){
        image101 = R.drawable.ic_ball;
        image102 = R.drawable.ic_car;
        image103 = R.drawable.ic_plane;
        image104 = R.drawable.ic_smile;
        image105 = R.drawable.ic_heart;
        image106 = R.drawable.ic_cut;
        image201 = R.drawable.ic_ball;
        image202 = R.drawable.ic_car;
        image203 = R.drawable.ic_plane;
        image204 = R.drawable.ic_smile;
        image205= R.drawable.ic_heart;
        image206 = R.drawable.ic_cut;
    }
}
