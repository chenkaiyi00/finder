package com.example.chen.finder.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.chen.finder.R;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;


public class MainActivity extends FragmentActivity  {
    loginFragment lo;
    PageIndicator mIndicator;
    SampleFragmentPagerAdapter adpater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
         adpater=  new SampleFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adpater);

        // Give the Tab Indicator of  the ViewPage
        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(viewPager);
    }
    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if(fragment instanceof loginFragment)
           lo=(loginFragment)fragment;
    }
    @Override
    public void onBackPressed() {
        if (lo.inlog) {
            lo.showmainfromloin();
            lo.inlog=false;
            lo.inmain=true;
        // Log.d("aaaaaaaaaaa", "aaaaaaaaaaaaaa");
        }
        else if (lo.insignup){
            lo.showmainfromsignup();
            lo.insignup=false;
            lo.inmain=true;
        }
        else
        {
           // Log.d("aaaaaaaaaaa", "aaaaaaaaaaaaaa");
            super.onBackPressed();

        }
    }

}