package com.example.prm_final_project.Game2048.sprites;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.prm_final_project.R;

public class EndGame implements Sprite {
    private int scWidth, scHeight;
    private Bitmap bm;
    public EndGame(Resources resources, int scWidth, int scHeight){
        this.scWidth = scWidth;
        this.scHeight = scHeight;

        int endGameWidth = (int) resources.getDimension(R.dimen.endgame_width);
        int endGameHeight = (int) resources.getDimension(R.dimen.endgame_height);

        Bitmap b = BitmapFactory.decodeResource(resources, R.drawable.gameover);
        bm = Bitmap.createScaledBitmap(b, endGameWidth,endGameHeight,false);
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bm, scWidth/2-bm.getWidth(), scHeight /2 - bm.getHeight(), null);
    }

    @Override
    public void update() {

    }
}
