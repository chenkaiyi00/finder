package com.example.chen.finder.objects;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.chen.finder.R;

/**
 * Created by chen on 8/4/2015.
 */
public class Like {
    int count;
     boolean liked;



    public Like( int count,boolean liked){
        this.count=count;
        this.liked=liked;
    }
    public void initial(ImageView view,TextView view1){
        view.setImageResource(R.drawable.likegrey);
        this.liked=false;
        view1.setText(Integer.toString(count));
    }

     public  boolean isLiked(){
         return liked;
     }
    public void setUnlike(ImageView view,TextView view1){
       view.setImageResource(R.drawable.likegrey);
        this.liked=false;
        decCount(view1);
    }

    public void setLike(ImageView view,TextView view1){
        view.setImageResource(R.drawable.likered);
        this.liked=true;
        incCount(view1);
    }

    public void decCount(TextView view){
          count--;
        view.setText(Integer.toString(count));
    }

    public  void incCount(TextView view){
        count++;
        view.setText(Integer.toString(count));

    }
}
