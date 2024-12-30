package com.example.recipeandroidapp;

public class Meal {
    private int imageResource;
    private String mealName;

    public Meal(int imageResource, String mealName) {
        this.imageResource = imageResource;
        this.mealName = mealName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getMealName() {
        return mealName;
    }
}

