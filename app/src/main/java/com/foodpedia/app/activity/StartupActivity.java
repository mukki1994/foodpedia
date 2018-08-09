package com.foodpedia.app.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.foodpedia.app.R;
import com.foodpedia.app.adapter.StartupViewPagerAdapter;

public class StartupActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    CharSequence Titles[]={"Sign in","Sign up"};
    int Numboftabs =2;
    private StartupViewPagerAdapter mViewPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        init();
        mViewPagerAdapter =  new StartupViewPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);
        mViewPager.setAdapter(mViewPagerAdapter);
        mTabLayout.setTabsFromPagerAdapter(mViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
    }

    private void init(){
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.viewpager);
    }

    /*private void addListnerTabLayout(){
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mImgIndicatorSecond.setVisibility(View.VISIBLE);
                mImgIndicatorFirst.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                mImgIndicatorFirst.setVisibility(View.INVISIBLE);
                mImgIndicatorSecond.setVisibility(View.VISIBLE);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                mImgIndicatorFirst.setVisibility(View.VISIBLE);
                mImgIndicatorSecond.setVisibility(View.INVISIBLE);

            }
        });*/


}
