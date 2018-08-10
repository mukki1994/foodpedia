package com.foodpedia.app.activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.foodpedia.app.R;

public class EditProfileActivity extends BaseActivity implements View.OnClickListener{


    private ImageView mImgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        init();
        setListener();
    }

    private void init(){
        mImgBack = findViewById(R.id.image_back);

    }

    private void setListener(){
        mImgBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_back:
                finish();
                break;
        }
    }
}
