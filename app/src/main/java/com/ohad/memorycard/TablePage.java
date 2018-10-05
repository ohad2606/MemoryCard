package com.ohad.memorycard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TablePage extends Activity {

    public static int level;
    TextView lblText, lblP1, lblP2;

    int cardInLine;
    int firstCardX;
    int firstCardY;
    int stepX;
    int stepY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_page);

        lblText = findViewById(R.id.lblLevel);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.apple);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(imageView);
        setContentView(linearLayout);


        switch (level){
            case 1:
                lblText.setText("שלב קל");
                findViewById(R.id.incLevelEsay).setVisibility(View.VISIBLE);
                findViewById(R.id.incLevelHard).setVisibility(View.GONE);
                cardInLine = 4;
                firstCardX = 80;
                firstCardY = 200;
                stepX = 50;
                stepY = 150;
                break;
            case 2:
                lblText.setText("שלב קשה");
                findViewById(R.id.incLevelEsay).setVisibility(View.GONE);
                findViewById(R.id.incLevelHard).setVisibility(View.VISIBLE);
                cardInLine = 6;
                firstCardX = 50;
                firstCardY = 150;
                stepX = 30;
                stepY = 100;
                break;
        }

    }

    public void btnMain(View view) {
        finish();
    }
}
