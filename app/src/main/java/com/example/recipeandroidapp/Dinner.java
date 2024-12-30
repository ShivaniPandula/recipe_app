package com.example.recipeandroidapp;


public class Dinner {
    private int imageResource;
    private String dinnerName;

    public Dinner(int imageResource, String dinnerName) {
        this.imageResource = imageResource;
        this.dinnerName = dinnerName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDinnerName() {
        return dinnerName;
    }
}

