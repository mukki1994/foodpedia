package com.foodpedia.app.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.foodpedia.app.R;

public class UserProfileActivity extends BaseActivity implements View.OnClickListener {

    private TextView mTxtEditProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        init();
        setListener();
    }

    private void init(){
        mTxtEditProfile = findViewById(R.id.text_edit_profile);

    }

    private void setListener(){
        mTxtEditProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_edit_profile:
                Intent intent = new Intent(this, EditProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}
