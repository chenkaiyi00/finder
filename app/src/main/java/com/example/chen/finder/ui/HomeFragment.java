package com.example.chen.finder.ui;


import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chen.finder.R;
import com.example.chen.finder.objects.Post;
import com.example.chen.finder.util.HomeSetsViewAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment  implements SwipeRefreshLayout.OnRefreshListener {

    SwipeRefreshLayout swipeLayout;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Context root = getActivity();
        HomeSetsViewAdapter homeSetsViewAdapter = new HomeSetsViewAdapter(root,getThronesCharacters());
        // Attach the adapter to the recyclerview to populate items
        RecyclerView rvPosts = (RecyclerView) view.findViewById(R.id.rvPosts);
        rvPosts.setAdapter(homeSetsViewAdapter);
        rvPosts.setLayoutManager(new LinearLayoutManager(root));


        swipeLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_container);
        swipeLayout.setOnRefreshListener(this);
        // Configure the refreshing colors
        swipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light);

        return view;
    }

    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeLayout.setRefreshing(false);
            }
        }, 3000);
    }
    private ArrayList<Post> getThronesCharacters() {
        ArrayList<Post> items = new ArrayList<>();
        items.add(new Post("Dany Targaryen", "Valyria"));
        items.add(new Post("Rob Stark", "Winterfell"));
        items.add(new Post("Jon Snow", "Castle Black"));
        items.add(new Post("Tyrion Lanister", "King's Landing"));
        items.add(new Post("Dany Targaryen", "Valyria"));
        items.add(new Post("Rob Stark", "Winterfell"));
        items.add(new Post("Jon Snow", "Castle Black"));
        items.add(new Post("Tyrion Lanister", "King's Landing"));
        items.add(new Post("Dany Targaryen", "Valyria"));
        items.add(new Post("Rob Stark", "Winterfell"));
        items.add(new Post("Jon Snow", "Castle Black"));
        items.add(new Post("Tyrion Lanister", "King's Landing"));
        items.add(new Post("Dany Targaryen", "Valyria"));
        items.add(new Post("Rob Stark", "Winterfell"));
        items.add(new Post("Jon Snow", "Castle Black"));
        items.add(new Post("Tyrion Lanister", "King's Landing"));
        return items;
    }

}
