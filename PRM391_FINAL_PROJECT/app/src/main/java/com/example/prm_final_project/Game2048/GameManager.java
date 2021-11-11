package com.example.prm_final_project.Game2048;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

import com.example.prm_final_project.Game2048.sprites.EndGame;
import com.example.prm_final_project.Game2048.sprites.Grid;
import com.example.prm_final_project.Game2048.sprites.Score;

public class GameManager extends SurfaceView implements SurfaceHolder.Callback, SwipeCallback, GameManagerCallback {
    private static final String APP_NAME = "2048 Game";

    private MainThread thread;
    private Grid grid;
    private int scWidth, scHeight,standardSize;
    private TileManager tileManager;
    private boolean endGame = false;
    private EndGame endGameSprite;
    private Score score;

    private SwipeListener swipe;

    public GameManager(Context context, AttributeSet attrs){
        super(context, attrs);
        setLongClickable(true);

        getHolder().addCallback(this);
        swipe = new SwipeListener(getContext(), this);

        DisplayMetrics dm = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);
        scWidth = dm.widthPixels;
        scHeight = dm.heightPixels;
        standardSize = (int) (scWidth * 3.88) / 4 ;

        grid = new Grid(getResources(), scWidth, scHeight, standardSize);
        tileManager = new TileManager(getResources(), standardSize/4, scWidth, scHeight, this);
        endGameSprite = new EndGame(getResources(), scWidth,scHeight);
        score = new Score(getResources(), scWidth, scHeight, standardSize, getContext().getSharedPreferences(APP_NAME, Context.MODE_PRIVATE));
    }

    public void initGame(){
        endGame = false;
        tileManager.initGame();
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        thread = new MainThread(holder, this);
        thread.setRunning(true);
        thread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int i, int width, int height) {
        thread.setSurfaceHolder(holder);
    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        boolean retry = true;
        while(retry){
            try {
                thread.setRunning(false);
                thread.join();
                retry = false;

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void update(){
        if(!endGame){
            tileManager.update();
        }

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        canvas.drawRGB(255, 255, 255);
        grid.draw(canvas);
        tileManager.draw(canvas);
        score.draw(canvas);
        if(endGame){
            endGameSprite.draw(canvas);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        swipe.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public void onSwipe(Direction direction) {
        tileManager.onSwipe(direction);
    }

    @Override
    public void gameOver() {

        endGame = true;
    }

    @Override
    public void updateScore(int delta) {
        score.updateScore(delta);
    }
}

