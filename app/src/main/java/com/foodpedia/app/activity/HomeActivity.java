package com.foodpedia.app.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.foodpedia.app.R;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener{

    private DrawerLayout mDrawerLayout;
    private ImageView mImgOpenDrawer;
    private NavigationView mNavigationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        setListener();
    }

    private void init(){
        mDrawerLayout = findViewById(R.id.drawer_layout);
        mImgOpenDrawer = findViewById(R.id.image_open_drawer);
        mNavigationview = findViewById(R.id.navigation_view);
    }

    private void setListener(){
        mImgOpenDrawer.setOnClickListener(this);
        mNavigationview.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent intent = new Intent(this,LetsStartedActivity.class);
            startActivity(intent);
        } else if (id == R.id.create_new_page) {
            Intent intent = new Intent(this,LetsStartedActivity.class);
            startActivity(intent);

        } else if (id == R.id.settings) {
            Intent intent = new Intent(this,LetsStartedActivity.class);
            startActivity(intent);

        } else if (id == R.id.my_business_pages) {
            Intent intent = new Intent(this,LetsStartedActivity.class);
            startActivity(intent);

        } else if (id == R.id.logout) {
            Intent intent = new Intent(this,LetsStartedActivity.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.image_open_drawer:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();

        }
    }
}
