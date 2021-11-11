package com.example.prm_final_project.Game2048;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.prm_final_project.R;

public class g2048_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.game2048_layout);
    }
}
