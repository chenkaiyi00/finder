package com.example.chen.finder.home.views;


import android.content.Intent;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.etiennelawlor.quickreturn.library.enums.QuickReturnViewType;
import com.etiennelawlor.quickreturn.library.listeners.QuickReturnRecyclerViewOnScrollListener;
import com.etiennelawlor.quickreturn.library.listeners.SpeedyQuickReturnScrollViewOnScrollChangedListener;
import com.etiennelawlor.quickreturn.library.views.NotifyingScrollView;
import com.example.chen.finder.R;
import com.example.chen.finder.objects.Post;
import com.example.chen.finder.util.HomeSetsViewAdapter;
import java.util.Random;
import butterknife.ButterKnife;
import butterknife.InjectView;
/*
 * shows reader post detail in this activity - primarily used for easy swiping between
 * posts in home, but can also be used to show a single
 * post detail
 */
public class HomePostPagerActivity extends AppCompatActivity  {
    public static final String EXTRA_NAME = "post_tittle";
    public static final String EXTRA_IMG = "img_src";
    private Intent intent;
    @InjectView(R.id.quick_return_footer_ll)
    LinearLayout mFooterLinearLayout;
    @InjectView(R.id.nested_scrollView)
    NotifyingScrollView mNotifyingScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_post_pager);
        intent = getIntent();
        Post post= getIntent().getParcelableExtra(HomeSetsViewAdapter.PAR_KEY);

        final String post_tittle = post.title;

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        ButterKnife.inject(this);

        SpeedyQuickReturnScrollViewOnScrollChangedListener scrollListener;

        scrollListener = new SpeedyQuickReturnScrollViewOnScrollChangedListener.Builder(this, QuickReturnViewType.FOOTER)
                .footer(mFooterLinearLayout)
                .build();
        mNotifyingScrollView.setOnScrollChangedListener(scrollListener);
    }
    private void loadBackdrop() {
        //final ImageView image1 = (ImageView) findViewById(R.id.pic_1);
       // final ImageView image2 = (ImageView) findViewById(R.id.pic_2);
       // final ImageView image3 = (ImageView) findViewById(R.id.pic_3);
       //Glide.with(this).load(getrandomPic()).centerCrop().into(imageView);
       // Glide.with(this).load(getrandomPic()).centerCrop().into(image1);
       // Glide.with(this).load(getrandomPic()).centerCrop().into(image2);
       // Glide.with(this).load(getrandomPic()).centerCrop().into(image3);
    }


    //this method only use during development
    private static int getrandomPic() {
          final Random RANDOM = new Random();
        switch (RANDOM.nextInt(6)) {
            default:
            case 0:
                return R.drawable.pic1;
            case 1:
                return R.drawable.pic2;
            case 2:
                return R.drawable.pic3;
            case 3:
                return R.drawable.pic4;
            case 4:
                return R.drawable.pic5;
            case 5:
                return R.drawable.pic6;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_post_pager, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if (id== android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
