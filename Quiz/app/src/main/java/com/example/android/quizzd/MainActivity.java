package com.example.android.quizzd;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String reward_for_right_answer_two = "";
    String reward_for_right_answer_one = "";
    String reward_for_right_answer_three = "";
    String reward_for_right_answer_four = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * submits quiz results
     */

    public void submitResults(View view) {


        EditText nameEditTextView = (EditText) findViewById(R.id.name_edit_text_view);
        String customerName = nameEditTextView.getText().toString();

        EditText answerOneEditTextView = (EditText) findViewById(R.id.answer_one_edit_text_view);
        String receivedAnswerOne = answerOneEditTextView.getText().toString();
        //answer for question one is Solomon.
        String ans1 = "Solomon";
        if (receivedAnswerOne.equalsIgnoreCase(ans1)) {
            reward_for_right_answer_one += "Question One is Correct";
        }else {
            reward_for_right_answer_one += "Question One is WRONG!";
        }


        RadioButton radio2 = (RadioButton) findViewById(R.id.radio_button_view_two);
        // answer for Question two is Radio button two.
        boolean checkedRadio2 = radio2.isChecked();
        if (checkedRadio2) {
            reward_for_right_answer_two += "Question Two is Correct";
        }else {
            reward_for_right_answer_two += "Question Two is WRONG!";
        }


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox_view_one);
        //answer for question three is checkbox one and two.
        boolean checkedAnswerOne = checkBox1.isChecked();
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox_view_two);
        boolean checkedAnswerTwo = checkBox2.isChecked();
        if ((checkedAnswerOne) && (checkedAnswerTwo)) {
            reward_for_right_answer_three += "Question Three is Correct";
        }else {
            reward_for_right_answer_three += "Question Three is WRONG!";
        }


        EditText answerFourEditTextView = (EditText) findViewById(R.id.answer_four_edit_text_view);
        String receivedAnswerFour = answerFourEditTextView.getText().toString();
        //answer for question four is Daniel
        String ans4 = "Daniel";
        if (receivedAnswerFour.equalsIgnoreCase(ans4)) {
            reward_for_right_answer_four += "Question Four is correct";
        }else {
            reward_for_right_answer_four += "Question Four is WRONG!";
        }

        if (receivedAnswerOne.isEmpty()){

        }


        String results = customerName + "\n" + reward_for_right_answer_one + "\n"
                + reward_for_right_answer_four + "\n"
                + reward_for_right_answer_three + "\n" + reward_for_right_answer_two;


        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, results, duration);
        toast.show();

        for (int i = 0; i<5; i++){
            toast.setText(results);
        }

    }


}
