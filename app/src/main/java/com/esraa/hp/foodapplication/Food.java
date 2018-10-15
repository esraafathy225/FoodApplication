package com.esraa.hp.foodapplication;

/**
 * Created by HP on 2018-10-14.
 */

public class Food {
    private int imageId;
    private String title;
    private String price;

    public Food(String title,String price,int imageId){
        this.title=title;
        this.price=price;
        this.imageId=imageId;
    }
    public  Food(){

    }
    public int getImageId(){
        return imageId;
    }
    public String getTitle(){
      return title;
    }
    public String getPrice(){
      return price;
    }
}
