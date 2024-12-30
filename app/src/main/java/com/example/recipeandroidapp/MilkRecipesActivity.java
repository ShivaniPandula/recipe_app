package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MilkRecipesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MilkRecipeAdapter adapter;
    private List<Recipe> milkRecipesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_recipes);

        // Retrieve selected milk item information
        List<Dessert> selectedList = (List<Dessert>) getIntent().getSerializableExtra("selectedList");

        // Ensure selectedList is not null and contains at least one item
        if (selectedList != null && !selectedList.isEmpty()) {
            Dessert selectedDessert = selectedList.get(0); // Assuming only one milk item is selected
            // Fetch recipes based on the selected milk item
            milkRecipesList = fetchRecipes(selectedDessert);
        } else {
            // Handle case when selectedList is null or empty
            // For example, display an error message or return to the previous activity
            // You can add your implementation here
        }

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewMilkRecipes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize adapter
        adapter = new MilkRecipeAdapter(milkRecipesList, this);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }

    // Method to fetch recipes based on the selected milk item
    private List<Recipe> fetchRecipes(Dessert selectedDessert) {
        // Implement your logic to fetch recipes based on the selected milk item
        // This could involve querying a database or calling an API
        // For demonstration purposes, I'll create a sample list of recipes
        List<Recipe> recipes = new ArrayList<>();
        // Add sample recipes for demonstration
        recipes.add(new Recipe(R.drawable.recipe1, "Recipe 1", "Link 1"));
        recipes.add(new Recipe(R.drawable.recipe2, "Recipe 2", "Link 2"));
        recipes.add(new Recipe(R.drawable.recipe3, "Recipe 3", "Link 3"));
        return recipes;
    }
}
