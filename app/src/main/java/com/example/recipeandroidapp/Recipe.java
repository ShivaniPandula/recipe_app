package com.example.recipeandroidapp;

import java.io.Serializable;

public class Recipe implements Serializable {
    private int imageResource;
    private String title;
    private String link;

    public Recipe(int imageResource, String title, String link) {
        this.imageResource = imageResource;
        this.title = title;
        this.link = link;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }
}
