package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class RecipeDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_details); // Replace with the actual layout name
// Find views by their IDs
        ImageView imageRecipe = findViewById(R.id.imageRecipe);
        TextView textRecipeName = findViewById(R.id.textRecipeName);
        TextView textRecipeDescription = findViewById(R.id.textRecipeDescription);
// Set sample data (replace with your actual data)
        imageRecipe.setImageResource(R.drawable.almondhoneypanna);
        textRecipeName.setText("Delicious Recipe");
        textRecipeDescription.setText("This is a sample recipe description. Replace it with your actual description.");
// Set click listener for the "Back" button
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Navigate back to the Menu class
                Intent intent = new Intent(RecipeDetails.this, Menu.class);
                startActivity(intent);
                finish(); // Optional: close the current activity
            }
        });
// Set click listener for the "Add" button if you have one
// Button btnAddRecipe = findViewById(R.id.btnAddRecipe);
// btnAddRecipe.setOnClickListener(new View.OnClickListener() {
// @Override
// public void onClick(View view) {
// // Add your logic for the button click event
// }
// });
    }
}