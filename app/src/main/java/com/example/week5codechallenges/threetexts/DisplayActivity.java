package com.example.week5codechallenges.threetexts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.week5codechallenges.R;

public class DisplayActivity extends AppCompatActivity {

    private TextView mTextViewDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        initView();

        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                int valueSent = bundle.getInt(ChooseTextActivity.SECTION_NUMBER);
                setText(valueSent);
            }
        }
    }

    private void initView() {
        mTextViewDisplayText = findViewById(R.id.text_view_display_text);
    }

    private void setText(int textNumber) {
        switch (textNumber) {
            case 1: mTextViewDisplayText.setText(getString(R.string.text_1));
                    break;
            case 2: mTextViewDisplayText.setText(getString(R.string.text_2));
                    break;
            case 3: mTextViewDisplayText.setText(getString(R.string.text_3));
                    break;
            default: mTextViewDisplayText.setText("Invalid Section");
                    break;
        }
    }


}
