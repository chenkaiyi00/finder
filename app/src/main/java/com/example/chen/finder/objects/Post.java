package com.example.chen.finder.objects;

/**
 * Created by chen on 8/3/2015.
 */
public class Post {
    public String title;
    public String author;
    public Like like;
    public Post(String title,String author,Like like){
        this.author=author;
        this.title=title;
        this.like=like;
    }

}
