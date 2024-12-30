package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MealsCategory extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MealAdapter adapter;
    private List<Meal> mealList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meals_category); // Replace with the actual layout name

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewMeals);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize mealList
        mealList = new ArrayList<>();

        // Add sample meal items
        mealList.add(new Meal(R.drawable.rice, "Rice"));
        mealList.add(new Meal(R.drawable.bread, "Bread"));

        // Add more items as needed

        // Initialize adapter
        adapter = new MealAdapter(mealList, this);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }

    // Example code for button click listener
    // You can uncomment and customize it as needed

//    // Find views by their IDs
//    ImageView imageMeal = findViewById(R.id.imageMeal);
//    TextView textMealName = findViewById(R.id.textMealName);
//    Button btnAddMeal = findViewById(R.id.btnAddMeal);
//
//    // Set click listener for the "Add" button
//    btnAddMeal.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Intent intent = new Intent(MealsCategory.this, RecipeDetails.class);
//            startActivity(intent);
//        }
//    });
}
