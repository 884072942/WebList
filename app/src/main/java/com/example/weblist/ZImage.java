package com.example.weblist;

public class ZImage {
    private String name;
    private int imageId;

    public ZImage(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
