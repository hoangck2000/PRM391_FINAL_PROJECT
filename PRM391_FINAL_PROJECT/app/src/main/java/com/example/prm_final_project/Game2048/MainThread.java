package com.example.prm_final_project.Game2048;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

import com.example.prm_final_project.Game2048.GameManager;

public class MainThread extends Thread{
    private SurfaceHolder surfaceHolder;
    private GameManager gameManager;
    private int targetFPS = 60;
    private boolean running;
    private Canvas canvas;
    public MainThread(SurfaceHolder surfaceHolder, GameManager gameManager){
        super();
        this.surfaceHolder = surfaceHolder;
        this.gameManager = gameManager;
    }
    public void setRunning(boolean isRunning){
        running = isRunning;
    }
    public void setSurfaceHolder(SurfaceHolder surfaceHolder){
        this.surfaceHolder = surfaceHolder;
    }

    @Override
    public void run() {
        long startTime, timeMills, waitTime;
        long totalTime = 0;
        int frameCount = 0;
        long targetTime = 1000/targetFPS;
        while(running){
            startTime = System.nanoTime();
            canvas = null;
            try {
                canvas = surfaceHolder.lockCanvas();
                synchronized (surfaceHolder){
                    gameManager.update();
                    gameManager.draw(canvas);
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if(canvas != null){
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            timeMills = (System.nanoTime() - startTime)/ 100000;
            waitTime = targetTime - timeMills;
            try {
                if(waitTime > 0){
                    sleep(waitTime);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

