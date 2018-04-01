package com.example.android.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View view) {
        questionOne();
    }
    public void  check2(View view) {
        questionTwo();
    }
    public void check3(View view) {
        questionThree();
    }
    public void check4(View view) {
        questionFour();
    }
    public void check5(View view) {
        questionFive();
    }
    public void check6(View view){
       questionSix();
    }
    //Question One
    public void questionOne() {
        Button ques1Button = (Button) findViewById(R.id.question_1_button);
        RadioButton ques1RB = (RadioButton) findViewById(R.id.radioButton3);
        if (ques1RB.isChecked()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
    //Question two
        public void questionTwo() {
        Button ques2Button = (Button) findViewById(R.id.question_2_button);
        RadioButton ques2RB = (RadioButton) findViewById(R.id.q2_radioButton2);
        if (ques2RB.isChecked()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
        }
        //Question three
    public void questionThree() {
        Button ques3Button = (Button) findViewById(R.id.question_3_button);
        RadioButton ques3RB = (RadioButton) findViewById(R.id.q3_radioButton2);
        if (ques3RB.isChecked()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
    //Question four
    public void questionFour() {
        Button ques4Button = (Button) findViewById(R.id.question_4_button);
        RadioButton ques4RB = (RadioButton) findViewById(R.id.q4_radioButton3);
        if (ques4RB.isChecked()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
        ////Question five
    public void questionFive(){
        Button ques5Button = (Button) findViewById(R.id.question_5_button);
        RadioButton ques5RB = (RadioButton) findViewById(R.id.q5_radioButton4);
        if (ques5RB.isChecked()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
    public void questionSix() {
        ////Question six
    Button ques6Button = (Button) findViewById(R.id.question_6_button);

    RadioButton ques6RB = (RadioButton) findViewById(R.id.q6_radioButton3);
        if (ques6RB.isChecked()) {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
}

