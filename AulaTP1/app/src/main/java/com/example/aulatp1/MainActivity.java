package com.example.aulatp1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int  REQUESTCODEBLUE = 1;
    private final int  REQUESTCODEGREEN = 2;
    private final int  OK = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    /** Called when the user taps the Send button */
    public void GoGreen(View view) {
        Intent intent = new Intent(this, Green.class);
        startActivityForResult(intent,REQUESTCODEGREEN);
    }

    /** Called when the user taps the Send button */
    public void GoBlue(View view) {
        Intent intent = new Intent(this, Blue.class);
        startActivityForResult(intent,REQUESTCODEBLUE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == REQUESTCODEBLUE && resultCode == OK){
                TextView textView = findViewById(R.id.textView);
                textView.setText("I came back from the red activity.");
        }
        else if (requestCode == REQUESTCODEGREEN && resultCode == OK){
            TextView textView = findViewById(R.id.textView);
            textView.setText("I came back from the green activity.");
        }
    }
}
