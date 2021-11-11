package com.example.prm_final_project.Game2048.sprites;

import android.graphics.Canvas;

import com.example.prm_final_project.Game2048.TileManagerCallback;

import java.util.Random;

public class Tile implements Sprite {
    private int screenWidth, screenHeight, standardSize;
    private TileManagerCallback callBack;
    private int count = 1;
    private int currentX, currentY;
    private int desX, desY;
    private boolean moving = false;
    private int speed = 200;
    private boolean increment;


    public Tile(int standardSize, int screenWidth, int screenHeight, TileManagerCallback callBack, int matrixX, int matrixY,int count){
        this(standardSize, screenWidth, screenHeight, callBack, matrixX, matrixY);
        this.count = count;
    }
    public Tile(int standardSize, int screenWidth, int screenHeight, TileManagerCallback callBack, int matrixX, int matrixY){
        this.standardSize = standardSize;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.callBack = callBack;
        currentX = desX = screenWidth / 2 - 2 * standardSize + matrixY * standardSize;
        currentY = desY = screenHeight / 2 - 2 * standardSize + matrixX * standardSize;
        int chance = new Random().nextInt(100);
        if(chance>=90){
            count = 2;
        }
    }
    public void move (int matrixX, int matrixY){
        moving = true;
        desX = screenWidth / 2 - 2 * standardSize + matrixY * standardSize;
        desY = screenHeight / 2 - 2 * standardSize + matrixX * standardSize;
    }
    public int getValue(){
        return count;
    }
    public Tile increment(){
        increment = true;
        return this;
    }
    public boolean toIncrement(){
        return increment;
    }
    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(callBack.getBitmap(count), currentX, currentY, null);
        if(moving && currentX == desX && currentY == desY){
            moving = false;
            if(increment){
                count++;
                increment = false;
                int amount = (int) Math.pow(2,count);
                callBack.updateScore(amount);
            }
            callBack.finishedMoving(this);
        }
    }

    @Override
    public void update() {
        if(currentX < desX){
            if(currentX + speed > desX){
                currentX = desX;
            }else {
                currentX += speed;
            }
        }else if(currentX > desX){
            if(currentX - speed < desX){
                currentX = desX;
            }else{
                currentX -= speed;
            }
        }

        if(currentY < desY){
            if(currentY + speed > desY){
                currentY = desY;
            }else {
                currentY += speed;
            }
        }else if(currentY > desY){
            if(currentY - speed < desY){
                currentY = desY;
            }else{
                currentY -= speed;
            }
        }
    }

}

