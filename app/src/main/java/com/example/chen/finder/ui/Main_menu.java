package com.example.chen.finder.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.chen.finder.R;

public class Main_menu extends AppCompatActivity {
    TextView homebtn;
    TextView storebtn;
    TextView combtn;
    TextView mebtn;
    TextView settingbtn;
    private static final int HOME=0;
    private static final int STORE=1;
    private static final int COMMUNITY=2;
    private static final int ME=3;
    private static final int SETTINGS=4;
    private static final int DEFAULT=0;
    public int curStance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        // Check that the activity is using the layout version with
        // the fragment_container FrameLayout
        if (findViewById(R.id.fragment_container) != null){
            // when first create the activity
            // show the default fragment
             if(savedInstanceState==null){
                HomeFragment home= new HomeFragment();
                 getSupportFragmentManager().beginTransaction()
                         .add(R.id.fragment_container, home).commit();
             }
                //if we're being restored from a previous state,
            // then we don't need to do anything
        }

        homebtn=(TextView)findViewById(R.id.home);
        storebtn=(TextView)findViewById(R.id.store);
        combtn=(TextView)findViewById(R.id.community);
        mebtn=(TextView)findViewById(R.id.me);
        settingbtn=(TextView)findViewById(R.id.settings);
        final  View root = settingbtn.getRootView();

        settingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               changeCurStanceColor(curStance);
                curStance=SETTINGS;
                setFragView(curStance);
                root.invalidate();
            }
        });
        mebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCurStanceColor(curStance);
                curStance=ME;
                setFragView(curStance);
                root.invalidate();
            }
        });
        combtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCurStanceColor(curStance);
                curStance=COMMUNITY;
                setFragView(curStance);
                root.invalidate();
            }
        });
        storebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCurStanceColor(curStance);
                curStance=STORE;
                setFragView(curStance);
                root.invalidate();
            }
        });
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeCurStanceColor(curStance);
                curStance=HOME;
                setFragView(curStance);
            }
        });

    }

    private void setFragView(int curstance) {
             switch (curstance) {
            case HOME:
                HomeFragment home= new HomeFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, home).commit();
                break;
            case SETTINGS:
                SettingFragment setting= new SettingFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, setting).commit();
                break;
            case STORE:
                StoreFragment store= new StoreFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, store).commit();
                break;
            case COMMUNITY:
                CommunityFragment community= new CommunityFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, community).commit();
                break;
            case ME:
               MeFragment me= new MeFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, me).commit();
                break;
 }
    }

    private void changeCurStanceColor(int curstance) {
    }

    protected void changeStance(){

    }

}
