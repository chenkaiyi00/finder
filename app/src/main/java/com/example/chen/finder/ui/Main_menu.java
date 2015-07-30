package com.example.chen.finder.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
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
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        if(savedInstanceState==null)
            curStance=DEFAULT;
        homebtn=(TextView)findViewById(R.id.home);
        storebtn=(TextView)findViewById(R.id.store);
        combtn=(TextView)findViewById(R.id.community);
        mebtn=(TextView)findViewById(R.id.me);
        settingbtn=(TextView)findViewById(R.id.settings);
        final  View root = settingbtn.getRootView();

        ft = getSupportFragmentManager().beginTransaction();// Begin the transaction
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
                root.invalidate();
            }
        });

    }

    private void setFragView(int curstance) {
             switch (curstance) {
            case HOME:.

                ft.replace(R.id.main_page_fragment, new HomeFragment(),"home");
                // Replace the contents of the container with the new fragment
                ft.commit();
                // Complete the changes added above\
                break;
            case SETTINGS:
            case STORE:
            case COMMUNITY:
            case ME:
 }
    }

    private void changeCurStanceColor(int curstance) {
    }

    protected void changeStance(){

    }

}
