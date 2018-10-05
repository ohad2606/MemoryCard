package com.ohad.memorycard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnEasy(View view) {
        TablePage.level = 1;
        Intent intent = new Intent(this, TablePage.class);
        startActivity(intent);

    }

    public void btnHard(View view) {
        TablePage.level = 2;
        Intent intent = new Intent(this, TablePage.class);
        startActivity(intent);
    }
}
