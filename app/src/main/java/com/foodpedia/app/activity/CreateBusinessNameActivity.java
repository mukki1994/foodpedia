package com.foodpedia.app.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.foodpedia.app.R;

public class CreateBusinessNameActivity extends BaseActivity implements View.OnClickListener {

    private Button mBtnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_business_name);
        init();
        setListener();
    }

    private void init(){
        mBtnContinue = findViewById(R.id.button_continue);

    }

    private void setListener(){
        mBtnContinue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_continue:
                Intent intent = new Intent(this, UserUploadPhotoActivity.class);
                startActivity(intent);
                break;
        }
    }
}
