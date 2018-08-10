package com.foodpedia.app.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.foodpedia.app.R;

public class LetsStartedActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTxtClickTerms;
    private Button mBtnLetsStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_started);
        init();
        setListener();
        setSpannable();
    }

    private void init(){
        mTxtClickTerms = findViewById(R.id.text_click);
        mBtnLetsStarted = findViewById(R.id.button_lets_started);
    }

    private void setListener(){
        mBtnLetsStarted.setOnClickListener(this);
    }
    private void setSpannable(){
        SpannableStringBuilder spannableString = new SpannableStringBuilder(getString(R.string.click_terms_foodpedia));
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.dark_red)), 45, 60, 0);
        mTxtClickTerms.setText(spannableString);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_lets_started:
                Intent intent = new Intent(this,CreateBusinessNameActivity.class);
                startActivity(intent);
                break;
        }
    }
}
