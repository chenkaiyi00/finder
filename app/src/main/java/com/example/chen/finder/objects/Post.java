package com.example.chen.finder.objects;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chen on 8/3/2015.
 */
public class Post implements Parcelable {
    public String title;
    public String author;
    public Like like;
    public Post(String title,String author,Like like){
        this.author=author;
        this.title=title;
        this.like=like;
    }

    protected Post(Parcel in) {
        title = in.readString();
        author = in.readString();
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel in) {
            return new Post(in);
        }

        @Override
        public Post[] newArray(int size) {
            return new Post[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(title);
        dest.writeString(author);
    }
}
