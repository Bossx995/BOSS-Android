package com.boss.android;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setBackgroundColor(Color.rgb(10, 12, 18));
        TextView title = new TextView(this);
        title.setText("BOSS");
        title.setTextColor(Color.rgb(245, 190, 55));
        title.setTextSize(38);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        TextView sub = new TextView(this);
        sub.setText("ANDROID CLOUD BUILD\n\nYour BOSS app project is ready.\nConnect this project to GitHub to build an APK automatically.");
        sub.setTextColor(Color.WHITE);
        sub.setTextSize(16);
        sub.setGravity(Gravity.CENTER);
        sub.setPadding(32, 24, 32, 24);
        root.addView(title);
        root.addView(sub);
        setContentView(root);
    }
}
