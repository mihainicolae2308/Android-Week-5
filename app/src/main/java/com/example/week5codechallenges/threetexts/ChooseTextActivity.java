package com.example.week5codechallenges.threetexts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.week5codechallenges.R;

public class ChooseTextActivity extends AppCompatActivity {

    public static final String SECTION_NUMBER = "section";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_text);
    }


    public void displayText1OnClick(View view) {
        setTextInDisplayActivity(1);
    }

    public void displayText2OnClick(View view) {
        setTextInDisplayActivity(2);
    }

    public void displayText3OnClick(View view) {
        setTextInDisplayActivity(3);
    }

    private void setTextInDisplayActivity(int textNumber) {
        Intent intent = new Intent(ChooseTextActivity.this, DisplayActivity.class);
        intent.putExtra(SECTION_NUMBER, textNumber);
        startActivity(intent);
    }
}
