package com.example.prm_final_project.Game2048;

public interface SwipeCallback {
    void onSwipe(Direction direction);
    enum Direction{
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
}
