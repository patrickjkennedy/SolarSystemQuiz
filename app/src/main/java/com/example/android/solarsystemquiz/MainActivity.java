package com.example.android.solarsystemquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view){
        int correctAnswers = 0;

        RadioGroup questionOne = (RadioGroup) findViewById(R.id.question_one);
        int id = questionOne.getCheckedRadioButtonId();


    }


}
