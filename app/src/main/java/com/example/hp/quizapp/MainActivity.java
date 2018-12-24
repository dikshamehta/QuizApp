package com.example.hp.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Questions questions= new Questions();
    private int questionnumber=0;
    public int score=0;
    RadioGroup rg;
    RadioButton rb;
    RadioButton optn0;
    RadioButton optn1;
    RadioButton optn2;
    Button btn2;
    TextView tv;
    TextView tv2;
    String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg= findViewById(R.id.radiogroup1);
        optn0= findViewById(R.id.choice1);
        optn1= findViewById(R.id.choice2);
        optn2= findViewById(R.id.choice3);
        tv= findViewById(R.id.textview1);
        tv2=findViewById(R.id.textView2);
        final Button btn =  (Button) findViewById(R.id.button1);
        btn2= findViewById(R.id.button2);
        updateQuestions();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkOptions();
                if(questionnumber==5)
                {
                    btn.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkOptions();
                openMain2Activity();
            }
        });




    }
    public void updateQuestions()
    {

        tv.setText(questions.getQuestions(questionnumber));
        optn0.setText(questions.getOption0(questionnumber));
        optn1.setText(questions.getOption1(questionnumber));
        optn2.setText(questions.getOption2(questionnumber));
        ans= questions.getCorrectOption(questionnumber);
        questionnumber++;

    }
    public void displayScore()
    {
        score= score+1;
        tv2.setText("Score: "+score);

    }
    public void checkOptions()
    {
        int radioId= rg.getCheckedRadioButtonId();
        rb= findViewById(radioId);
        if(rb.getText()==ans)
        {

            displayScore();
            if(questionnumber<5) {
                updateQuestions();
            }

        }
        else
        {
            if(questionnumber<5) {
                updateQuestions();
            }
        }

    }
    public void openMain2Activity()
    {
        Intent intent= new Intent(this, Main2Activity.class);
        intent.putExtra("intVariableName", score);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}
