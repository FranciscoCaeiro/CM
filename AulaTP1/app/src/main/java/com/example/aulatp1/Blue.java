package com.example.aulatp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Blue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue);
    }

    @Override
    public void onBackPressed() {

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        setResult(0,intent);

        super.onBackPressed();
    }
}
