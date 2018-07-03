package com.wsl.example;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if(hasFocus) {
            View view1 = findViewById(R.id.img1);
            View view2 = findViewById(R.id.img2);
            View view3 = findViewById(R.id.img3);
            TextView tv0 = (TextView) findViewById(R.id.view_display0);
            TextView tv1 = (TextView) findViewById(R.id.view_display1);
            int w1 = view1.getWidth();
            int h1 = view1.getHeight();

            int w2 = view2.getWidth();
            int h2 = view2.getHeight();

            int w3 = view3.getWidth();
            int h3 = view3.getHeight();
            Drawable d = getResources().getDrawable(R.drawable.img_quiz);

            tv0.setText("w2: " + w2 + "-h2:" + h2 + "w3: " + w3 + "-h3:" + h3);
            tv1.setText("w1=" + w1 + "-h1=" + h1 + "-dw: " + d.getIntrinsicWidth() + "dh: " + d.getIntrinsicHeight());
        }
    }
}
