package com.wsl.example;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void intentToTest(View view) {
        startActivity(new Intent(this, TestActivity.class));
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus) {
            mm();
        }
    }

    private void mm() {
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float density = displayMetrics.density;
        int densityDpi = displayMetrics.densityDpi;
        int widthPixels = displayMetrics.widthPixels;
        int heightPixels = displayMetrics.heightPixels;


        TextView tv0 = (TextView) findViewById(R.id.view_display0);
        TextView tv1 = (TextView) findViewById(R.id.view_display1);

        View view = findViewById(R.id.img1);
        int w = view.getWidth();
        int h = view.getHeight();
        Drawable d = getResources().getDrawable(R.drawable.img_quiz);
        tv0.setText("w=" + w + "-h=" + h + "-iw: " + d.getIntrinsicWidth() + "ih: " + d.getIntrinsicHeight());

        tv1.setText("densityDpi : " + densityDpi + "-density: " + density + "-w: " + widthPixels + "-h:" +heightPixels);
    }
}
