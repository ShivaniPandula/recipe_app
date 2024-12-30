package com.example.recipeandroidapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class Menu extends AppCompatActivity {
    private Button btnDesserts, btnMeals, btnBreakfasts, btnDinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        btnDesserts = findViewById(R.id.btnDesserts);
        btnMeals = findViewById(R.id.btnMeals);
        btnBreakfasts = findViewById(R.id.btnBreakfasts);
        btnDinner = findViewById(R.id.btnDinner);
// Set click listeners for your buttons
        btnDesserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this,DessertsCategory.class);
                startActivity(intent);
// Implement your logic for Desserts button click
// For example, start a new activity or perform some action related to Desserts
            }
        });
        btnMeals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Implement your logic for Meals button click
                Intent intent = new Intent(Menu.this,MealsCategory.class);
                startActivity(intent);

            }
        });
        btnBreakfasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Implement your logic for Breakfasts button click
                Intent intent = new Intent(Menu.this,BreakfastsCategory.class);
                startActivity(intent);

            }
        });
        btnDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Implement your logic for Dinner button click
                Intent intent = new Intent(Menu.this,DinnerCategory.class);
                startActivity(intent);


            }
        });
    }
}