package com.example.chen.finder.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chen.finder.R;
import com.example.chen.finder.objects.Post;

import java.util.ArrayList;

/**
 * Created by chen on 8/3/2015.
 */

// Create the basic adapter extending from RecyclerView.Adapter
public class HomeSetsViewAdapter extends
        RecyclerView.Adapter<HomeSetsViewAdapter.ViewHolder> {
    // Store a member variable for the users
    private ArrayList<Post> posts;
    // Store the context for later use

    @Override
    public HomeSetsViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        //to inflate the item layout and create the holder
        // Inflate the custom layout
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.sets_item, parent, false);
       final ImageView like_button=(ImageView)itemView.findViewById(R.id.like_button);
       final TextView like_count = (TextView)itemView.findViewById(R.id.like_count);
        final Post p = posts.get(viewType);
        like_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(p.like.isLiked()){
                   p.like.setUnlike(like_button,like_count);
               }else{
                   p.like.setLike(like_button, like_count);
               }
            }
        });
        return new HomeSetsViewAdapter.ViewHolder(itemView,context);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //to set the view attributes based on the data
        // Get the data model based on position
        Post post = posts.get(position);
        // Set item views based on the data model
        holder.tvAuthor.setText(post.author);
        holder.tvTitile.setText(post.title);
        holder.comment_count.setText("15");
        post.like.initial( holder.like_button,holder.like_count);
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView tvTitile;
        public TextView tvAuthor;
        public ImageView like_button;
        public TextView like_count;
        public TextView comment_count;
        private Context context;
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView,Context context) {
            super(itemView);
            this.tvTitile = (TextView) itemView.findViewById(R.id.tvTitile);
            this.tvAuthor = (TextView) itemView.findViewById(R.id.tvAuthor);
            this.like_button = (ImageView) itemView.findViewById(R.id.like_button);
            this.like_count = (TextView) itemView.findViewById(R.id.like_count);
            this.comment_count = (TextView) itemView.findViewById(R.id.comment_count);
            this.context = context;
            // Attach a click listener to the entire row view
            itemView.setOnClickListener(this);
        }

        // Handles the row being being clicked
        @Override
        public void onClick(View v) {
            int position = getLayoutPosition(); // gets item position
            Post p =posts.get(position);
            Toast.makeText(context, tvTitile.getText(), Toast.LENGTH_SHORT).show();
        }
    }
    private Context context;
    // Pass in the context and users array into the constructor
    public HomeSetsViewAdapter(Context context, ArrayList<Post> posts) {
        this.posts = posts;
        this.context = context;
    }
}