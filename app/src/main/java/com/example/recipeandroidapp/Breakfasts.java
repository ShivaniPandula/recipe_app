package com.example.recipeandroidapp;


import java.io.Serializable;

public class Breakfasts implements Serializable {
    private int imageResource;
    private String breakfastName;

    public Breakfasts(int imageResource, String breakfastName) {
        this.imageResource = imageResource;
        this.breakfastName = breakfastName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getBreakfastName() {
        return breakfastName;
    }
}

