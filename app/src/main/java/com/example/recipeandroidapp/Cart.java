package com.example.recipeandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class Cart extends AppCompatActivity {

    private RecyclerView recyclerViewCart;
    private CartAdapter adapter;
    private List<Breakfasts> selectedList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cartlayout);

        recyclerViewCart = findViewById(R.id.recyclerViewCart);
        recyclerViewCart.setHasFixedSize(true);
        recyclerViewCart.setLayoutManager(new LinearLayoutManager(this));

        // Retrieve selected items passed from BreakfastsCategory activity
        selectedList = (List<Breakfasts>) getIntent().getSerializableExtra("selectedList");

        // Initialize adapter with selected items
        adapter = new CartAdapter(selectedList, this);
        recyclerViewCart.setAdapter(adapter);

        // Find the Get Recipe button
        Button getRecipeBtn = findViewById(R.id.getRecipeBtn);
        // Add click listener to the button
        getRecipeBtn.setOnClickListener(view -> {
            // Implement the logic to handle Get Recipe button click if needed
            // For example, you can navigate to a new activity to display recipes

        });

    }
}
