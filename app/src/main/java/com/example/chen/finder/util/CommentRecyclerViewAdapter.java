package com.example.chen.finder.util;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chen.finder.R;
import com.example.chen.finder.objects.Comment;


import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by chen on 8/11/2015.
 */
public class CommentRecyclerViewAdapter extends
        RecyclerView.Adapter<CommentRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Comment> comments;
    // Store the context for later use
    private Context context;

    public CommentRecyclerViewAdapter(Context context, ArrayList<Comment> comments){
        this.comments=comments;
        this.context=context;
    }
    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public CommentRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.row_comment, parent, false);
        return new CommentRecyclerViewAdapter.ViewHolder(itemView);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(CommentRecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return comments.size();
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView mUser_icon;
        public    TextView mUser_id;
        public   TextView mReview_time;
        public   TextView mContent;
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            super(itemView);
            this.mUser_id=(TextView)itemView.findViewById(R.id.user_id);
            this.mUser_icon=(CircleImageView)itemView.findViewById(R.id.user_icon);
            this.mReview_time=(TextView)itemView.findViewById(R.id.review_time);
            this.mContent=(TextView)itemView.findViewById(R.id.content);
        }
    }
}
