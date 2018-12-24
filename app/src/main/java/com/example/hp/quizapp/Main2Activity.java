package com.example.hp.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent2 = getIntent();
        int score = intent2.getIntExtra("intVariableName", 0);
        tv2= findViewById(R.id.textView3);
        tv2.setText(Integer.toString(score));


    }


}
