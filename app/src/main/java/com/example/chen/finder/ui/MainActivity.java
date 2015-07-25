package com.example.chen.finder.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.chen.finder.R;
import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;


public class MainActivity extends FragmentActivity implements loginFragment.OnBackPressedListener {
    PageIndicator mIndicator;
    protected loginFragment.OnBackPressedListener loginfragmentListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(),
                MainActivity.this));

        // Give the Tab Indicator of  the ViewPage
        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(viewPager);
    }

    @Override
    public void onBackPressed() {
        if (loginfragmentListener != null)
            loginfragmentListener.doBack();
        else
            super.onBackPressed();
    }

    @Override
    public void doBack() {
     loginFragment frag=(loginFragment)getSupportFragmentManager().findFragmentById(R.id.pager);
      if(frag.inlog) {
          frag.showlog();
      }
      else if (frag.inmain){
      frag.showmain();
      }
      else {
     frag.showsignup();
      }
    }
}