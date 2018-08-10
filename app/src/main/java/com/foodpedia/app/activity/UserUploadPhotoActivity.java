package com.foodpedia.app.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.foodpedia.app.R;

public class UserUploadPhotoActivity extends BaseActivity implements View.OnClickListener{

    private Button mBtnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_upload_photo);
        init();
        setListener();
    }

    private void init(){
        mBtnUpload = findViewById(R.id.button_upload);

    }

    private void setListener(){
        mBtnUpload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_upload:
                Intent intent = new Intent(this, SuccessBusinessPage.class);
                startActivity(intent);
                break;
        }
    }
}

