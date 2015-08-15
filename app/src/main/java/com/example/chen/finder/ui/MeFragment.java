package com.example.chen.finder.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chen.finder.Me.views.Likedsetui;
import com.example.chen.finder.R;
import com.example.chen.finder.Setting.views.Myaccountui;
import com.example.chen.finder.viewhelper.CustomFontTextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import de.hdodenhof.circleimageview.CircleImageView;

public class MeFragment extends Fragment {
    @InjectView(R.id.My_loves_sets)
    CustomFontTextView My_loves_sets;
    @InjectView(R.id.My_sets)
    CustomFontTextView My_sets;
    @InjectView(R.id.My_brands)
    CustomFontTextView My_brands;
    @InjectView(R.id.My_order)
    CustomFontTextView My_order;
    @InjectView(R.id.My_cart)
    CustomFontTextView My_cart;
    @InjectView(R.id.user_icon)
    CircleImageView user_icon;

    public MeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        ButterKnife.inject(this, view);
        final Context root = getActivity();
        My_loves_sets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(root, Likedsetui.class);
                startActivity(intent);
            }
        });
        My_sets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root, Myaccountui.class);
                startActivity(intent);
            }
        });
        My_brands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root, Myaccountui.class);
                startActivity(intent);
            }
        });
        My_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root, Myaccountui.class);
                startActivity(intent);
            }
        });
        My_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root, Myaccountui.class);
                startActivity(intent);
            }
        });
        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(root, Myaccountui.class);
                startActivity(intent);
            }
        });
        return  view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


}
