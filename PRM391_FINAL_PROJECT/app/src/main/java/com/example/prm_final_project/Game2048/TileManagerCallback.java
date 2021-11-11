package com.example.prm_final_project.Game2048;

import android.graphics.Bitmap;

import com.example.prm_final_project.Game2048.sprites.Tile;

public interface TileManagerCallback {
    Bitmap getBitmap(int count);
    void finishedMoving(Tile t);
    void updateScore(int delta);
}
