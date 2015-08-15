package com.example.chen.finder.objects;


/**
 * Created by chen on 8/13/2015.
 */
public class Product {

   private Integer picID;
    private String name;
    private String price;
    private  String priceNew;
    public Product(Integer picID, String name, String price, String priceNew){
        this.picID=picID;
        this.name=name;
        this.price=price;
        this.priceNew=priceNew;
    }

  public Integer getPicID(){
      return  picID;
  }
    public String getname(){
        return  name;
    }
    public String getprice(){
        return  price;
    }
    public String getpriceNew(){
        return  priceNew;
    }
}
