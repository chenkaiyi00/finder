package com.example.chen.finder.Me.views.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chen.finder.Me.views.Likedsetui;
import com.example.chen.finder.R;
import com.example.chen.finder.objects.Product;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by chen on 8/13/2015.
 */
public class Gridlikedsetadpter extends ArrayAdapter<Product> {
    private Context mContext;
    int layoutResourceId;
    ArrayList<Product> data;
    public Gridlikedsetadpter(Context mContext, int layoutResourceId,  ArrayList<Product> data) {
        super(mContext, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }


    static class RecordHolder {
        TextView name;
        TextView price;
        TextView price_new;
        ImageView imageItem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;

        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new RecordHolder();
            holder.name = (TextView) row.findViewById(R.id.product_name);
            holder.price = (TextView) row.findViewById(R.id.product_price);
            holder.price_new = (TextView) row.findViewById(R.id.product_price_new);
            holder.imageItem= (ImageView) row.findViewById(R.id.product_pic);
            row.setTag(holder);

        } else {
            holder = (RecordHolder) row.getTag();
        }
        Product p =data.get(position);
        holder.name.setText(p.getname());
        holder.price.setText(p.getprice());
        holder.imageItem.setImageResource(p.getPicID());
        return row;
    }

}
