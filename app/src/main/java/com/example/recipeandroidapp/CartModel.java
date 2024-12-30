package com.example.recipeandroidapp;


import java.io.Serializable;

public class CartModel implements Serializable {
    private int imageResource;
    private String itemName;

    public CartModel(int imageResource, String itemName) {
        this.imageResource = imageResource;
        this.itemName = itemName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getItemName() {
        return itemName;
    }


}

