package com.example.prm_final_project.Game2048.sprites;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.prm_final_project.R;

public class Score implements Sprite{
    private static final String SCORE_PREF = "Score pref";

    private int screenWidth, screenHeight, standardSize;
    private Bitmap bmpScore, bmpTopScore;
    private int score, topScore;
    private SharedPreferences prefs;
    private Paint paint;

    public Score(Resources resources, int screenWidth, int screenHeight, int standardSize, SharedPreferences prefs){
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.standardSize = standardSize;
        this.prefs = prefs;

        topScore = prefs.getInt(SCORE_PREF, 0);
        int width = (int) resources.getDimension((R.dimen.score_lable_width));
        int height = (int) resources.getDimension((R.dimen.score_lable_height));

        Bitmap sc = BitmapFactory.decodeResource(resources, R.drawable.score);
        bmpScore = Bitmap.createScaledBitmap(sc, width, height,false);

        Bitmap tsc = BitmapFactory.decodeResource(resources, R.drawable.topscore);
        bmpTopScore = Bitmap.createScaledBitmap(tsc, width, height,false);

        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(resources.getDimension(R.dimen.score_text_size));

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bmpScore, screenWidth / 4 - bmpScore.getWidth() / 2, bmpScore.getHeight(), null);
        canvas.drawBitmap(bmpTopScore, 3 * screenWidth / 4 - bmpTopScore.getWidth() / 2, bmpTopScore.getHeight(), null);

        int width = (int) paint.measureText(String.valueOf(score));
        int width2 = (int) paint.measureText(String.valueOf(topScore));
        canvas.drawText(String.valueOf(score), screenWidth / 4 -width / 2, bmpScore.getHeight() * 4, paint);
        canvas.drawText(String.valueOf(topScore), 3 * screenWidth / 4 - width2 / 2, bmpTopScore.getHeight() * 4, paint);
    }

    @Override
    public void update() {

    }
    public void updateScore(int delta){
        score += delta;
        checkTopScore();
    }
    public void checkTopScore(){
        topScore = prefs.getInt(SCORE_PREF, 0);
        if(topScore < score){
            prefs.edit().putInt(SCORE_PREF, score).apply();
            topScore = score;
        }
    }
}

