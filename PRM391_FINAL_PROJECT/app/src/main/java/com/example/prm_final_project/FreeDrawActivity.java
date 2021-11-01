package com.example.prm_final_project;

import static com.example.prm_final_project.DisplayClass.colorList;
import static com.example.prm_final_project.DisplayClass.current_brush;
import static com.example.prm_final_project.DisplayClass.pathList;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class FreeDrawActivity extends AppCompatActivity {
public static Path path = new Path();
public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_draw);
    }

    public void redColorPicked(View view) {
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }

    public void yellowColorPicked(View view) {
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }

    public void greenColorPicked(View view) {
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }

    public void magentaColorPicked(View view) {
        paint_brush.setColor(Color.MAGENTA);
        currentColor(paint_brush.getColor());
    }

    public void blueColorPicked(View view) {
        paint_brush.setColor(Color.BLUE);
        currentColor(paint_brush.getColor());
    }

    public void pencilClick(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void eraserClick(View view) {
        paint_brush.setColor(Color.WHITE);
        currentColor(paint_brush.getColor());
    }

    public void deleteAllClick(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }

    public void currentColor(int c){
        current_brush = c;
        path = new Path();
    }


    public void backHome(View view) {
        finish();
    }
}