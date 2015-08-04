package com.example.chen.finder.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chen.finder.R;
import com.example.chen.finder.objects.Post;

import java.util.ArrayList;

/**
 * Created by chen on 8/3/2015.
 */

// Create the basic adapter extending from RecyclerView.Adapter
public class HomeSetsViewAdapter extends
        RecyclerView.Adapter<HomeSetsViewAdapter.ViewHolder> {


    @Override
    public HomeSetsViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //to inflate the item layout and create the holder
        // Inflate the custom layout
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.sets_item, parent, false);
        return new HomeSetsViewAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //to set the view attributes based on the data
        // Get the data model based on position
        Post post = posts.get(position);
        // Set item views based on the data model
        holder.tvAuthor.setText(post.author);
        holder.tvTitile.setText(post.title);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView tvTitile;
        public TextView tvAuthor;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            super(itemView);
            this.tvTitile = (TextView) itemView.findViewById(R.id.tvTitile);
            this.tvAuthor = (TextView) itemView.findViewById(R.id.tvAuthor);
        }
    }

    // Store a member variable for the users
    private ArrayList<Post> posts;
    // Store the context for later use
    private Context context;
    // Pass in the context and users array into the constructor
    public HomeSetsViewAdapter(Context context, ArrayList<Post> posts) {
        this.posts = posts;
        this.context = context;
    }
}