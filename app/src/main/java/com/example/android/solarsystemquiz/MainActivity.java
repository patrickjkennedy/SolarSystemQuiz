package com.example.android.solarsystemquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        int correctAnswers = 0;

        // Grab each of the correct answers

        RadioButton questionOne = (RadioButton) findViewById(R.id.question_one_answer);
        boolean questionOneCorrect = questionOne.isChecked();

        RadioButton questionTwo = (RadioButton) findViewById(R.id.question_two_answer);
        boolean questionTwoCorrect = questionTwo.isChecked();

        CheckBox questionThreeOne = (CheckBox) findViewById(R.id.question_three_answer_one);
        boolean questionThreeOneCorrect = questionThreeOne.isChecked();

        CheckBox questionThreeTwo = (CheckBox) findViewById(R.id.question_three_answer_two);
        boolean questionThreeTwoCorrect = questionThreeTwo.isChecked();

        CheckBox questionThreeIncorrectAnswer = (CheckBox) findViewById(R.id.question_three_incorrect_answer);

        RadioButton questionFour = (RadioButton) findViewById(R.id.question_four_answer);
        boolean questionFourCorrect = questionFour.isChecked();

        RadioButton questionFive = (RadioButton) findViewById(R.id.question_five_answer);
        boolean questionFiveCorrect = questionFive.isChecked();

        RadioButton questionSix = (RadioButton) findViewById(R.id.question_six_answer);
        boolean questionSixCorrect = questionSix.isChecked();

        EditText questionSeven = (EditText) findViewById(R.id.question_seven_answer);
        String questionSevenCorrect = questionSeven.getText().toString().trim();

        RadioButton questionEight = (RadioButton) findViewById(R.id.question_eight_answer);
        boolean questionEightCorrect = questionEight.isChecked();

        // Set up if statements

        if (questionOneCorrect) {
            correctAnswers += 1;
        }

        if (questionTwoCorrect) {
            correctAnswers += 1;
        }

        if (questionThreeOneCorrect && questionThreeTwoCorrect && !questionThreeIncorrectAnswer.isChecked()) {
            correctAnswers += 1;
        }

        if (questionFourCorrect) {
            correctAnswers += 1;
        }

        if (questionFiveCorrect) {
            correctAnswers += 1;
        }

        if (questionSixCorrect) {
            correctAnswers += 1;
        }

        if (questionSevenCorrect.equalsIgnoreCase("Laika")) {
            correctAnswers += 1;
        }

        if (questionEightCorrect) {
            correctAnswers += 1;
        }

        displayMessage(correctAnswers);
    }

    public void displayMessage(int answers) {
        Context context = getApplicationContext();

        if (answers <= 4) {
            CharSequence text = "You got " + answers + " questions correct. Study up and try again!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            CharSequence text = "You got " + answers + " questions correct. You're out of this world!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }


    }


}
